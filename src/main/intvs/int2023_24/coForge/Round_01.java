package main.intvs.int2023_24.coForge;

public class Round_01 {

    //Question - 01
    // Print the words occurrence using Java 8 features and techniques.
    // Input as;
    // String myArr=["AA", "BB", "AA", "CC", "DD", "DD"];
    // Output as;
    // AA : 2
    // BB : 1
    // CC : 1
    // DD : 2

    // String[] myArr={"AA", "BB", "AA", "CC", "DD", "DD"};
    // Map<String, Integer> map = Arrays.stream(myArr).map((a)->).collect(Collector.toMap());
    // System.out.println(map);
    // Map<String, Integer> map = new HashMap<>();
    // for(String str: myArr) {
    //     map.put(str, map.getOrDefault(str, 0)+1);
    // }
    // System.out.println(map);

    //Question - 02

    // Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.

    // Examples:
    // Input: arr[] = {0, -1, 2, -3, 1}, x= -2
    // Output: Yes
    // Explanation: If we calculate the sum of the output,1 + (-3) = -2

    // Input: arr[] = {1, -2, 1, 0, 5}, x = 0
    // Output: No

    //    int[] input = {1, -2, 1, 0, 5};
    //    int x = 0;
    //    boolean isPairFound = false;
    //    HashSet<Integer> set = new HashSet<>();
    //        for(int index = 0; index<input.length; index++) {
    //        if(set.contains(x-input[index])) { // since x is larger bcz of sum of 2 numbers
    //            isPairFound = true;
    //            break;
    //        }
    //        set.add(input[index]);
    //    }
    //
    //        if(isPairFound) {
    //        System.out.println("Yes");
    //    } else {
    //        System.out.println("No");
    //    }

    // TOLD about 2 pointer approach with Sorting the array to reduce Space Complexity
    //0, -1, 2, -3, 1
    //-3, -1, 0, 1, 2

    //-2

    // ==>>>

    //1, -2, 1, 0, 5
    //-2, 0, 1, 1, 5
    // need 0

}
