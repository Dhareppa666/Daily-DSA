package main.finale.In_Walmart.LC.Daily;
import java.util.*;

//https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
//2244. Minimum Rounds to Complete All Tasks
public class Tasks {

    public static void main(String[] args) {
        System.out.println(minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }
    public static int minimumRounds(int[] tasks) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();// element, occurance
        for(int i=0; i<tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            Integer occurances = m.getValue();
            while(occurances>=2){
                occurances = (occurances%3==0) ? occurances - 3 : occurances - 2;
                res++;
            }
            if(occurances==1){
                return -1;
            }
        }
        return res;
    }
}