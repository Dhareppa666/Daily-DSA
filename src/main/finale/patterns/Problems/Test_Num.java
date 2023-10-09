package main.finale.patterns.Problems;

import java.util.*;

class Test_Num {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // no of mobiles
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            int price = sc.nextInt();
            int speed = sc.nextInt();
            if(map.get(price) == null ){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(speed);
                map.put(price, list);
            } else {
                List<Integer> list = map.get(price);
                list.add(speed);
                map.put(price, list);
            }
        }

        int q = sc.nextInt();  // no of mobiles
        for(int i=1; i<=q; i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            int total = find(left, right, map, false);
            System.out.println(total+" mobiles are available");
            find(left, right, map, true);
        }
    }

    public static int find(int left, int right, HashMap<Integer, List<Integer>> map, boolean print ){
        int count = 0;
        for (Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            if(entry.getKey()>=left && entry.getKey()<=right){
                int listSize = entry.getValue().size();
                List newList = entry.getValue();
                Collections.sort(newList);
                for(int i=0; i<listSize; i++){
                    count++;
                    if(print){
                        System.out.println("Price "+entry.getKey()+" Speed "+newList.get(i));
                    }
                }
            }
        }
        return count;
    }
}

