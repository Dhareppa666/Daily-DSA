package org.patterns.vik;

import java.util.HashSet;

public class Test {

    static HashSet<Integer> first_player = new HashSet<>();
    static HashSet<Integer> second_player = new HashSet<>();;

    public static void main(String[] args) {
        String res = calculateScore2(2, "4-3-0-8-5-1-6-2");
        System.out.println("The res is: "+res);
    }

    public static String calculateScore (int rounds, String pinsDropped){
        String[] pinsDropped2 = pinsDropped.split("-");
        int[] arr = new int[pinsDropped2.length];
        int indexs  = 0;
        for(String s: pinsDropped2){
            arr[indexs++] = Integer.parseInt(s);
        }
        HashSet<Integer> first_player = new HashSet<>();
        HashSet<Integer> second_player = new HashSet<>();;
        for(int index = 0; index<arr.length; index++) {
            int player = arr[index+rounds];
            HashSet<Integer> new_player = new HashSet<>();
            for (int i = 0; i <= 1; i++) {
                if (i == 0) {
                    if (arr[i] == 9)
                        new_player.add(18);
                    else
                        new_player.add(arr[i]);
                } else if (i == 1) {
                    if (arr[1] == 9)
                        new_player.add(27);
                    else
                        new_player.add(arr[1]);
                }
            }
            int player_score = new_player.stream().mapToInt(Integer::intValue).sum();
            if (index % 2 == 0)
                first_player.add(player_score);
            else
                second_player.add(player_score);
            index += rounds;
        }

        int sum_first = first_player.stream().mapToInt(Integer::intValue).sum();
        int sum_second = second_player.stream().mapToInt(Integer::intValue).sum();

        if (sum_first > sum_second)
        return sum_first+"-"+sum_second;
            else
        return sum_second+"-"+sum_first;

    }

    public static String calculateScore2 (int rounds, String pinsDropped){
        String[] pinsDropped2 = pinsDropped.split("-");
        int[] arr = new int[pinsDropped2.length];
        int indexs  = 0;
        for(String s: pinsDropped2){
            arr[indexs++] = Integer.parseInt(s);
        }

        int index = 0;
        while(index<arr.length){
            int ind  = doForP1(arr, index, first_player);
            int ind2 = doForP1(arr, ind, second_player);
            index = ind2;
            //index++;
        }

        int sum_first = first_player.stream().mapToInt(Integer::intValue).sum();
        int sum_second = second_player.stream().mapToInt(Integer::intValue).sum();

        if (sum_first > sum_second)
            return sum_first+"-"+sum_second;
        else
            return sum_second+"-"+sum_first;

    }

    private static int doForP1(int[] arr, int index, HashSet<Integer> player) {
        boolean firstTime = true;
        for(int x = index; x<=index+1; x++){
            if(arr[index] == 9 && firstTime){
                player.add(18);
                return index+1;
            } else if (arr[index] == 9){
                player.add(27);
            } else {
                player.add(arr[index]);
            }
            firstTime = false;
        }
        return index+2;
    }

}
