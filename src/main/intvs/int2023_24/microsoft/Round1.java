package main.intvs.int2023_24.microsoft;

public class Round1 {

    public static void main(String[] args) {
        int[] input1 = {1, 4};
        int[] input2 = {-2, -1, 0};

        int totalLengthOfArrays = input1.length + input2.length;
        int mideanIndex = totalLengthOfArrays / 2;

        Integer res = getMedian(input1, input2, mideanIndex);

    }

    public static Integer getMedian(int[] input1, int[] input2, int mideanIndex) {//[2],[3]//1
        int index1 = 0, index2 = 0;

        if (input1.length == 0 && input2.length == 0) {
            return -1;
        }

        while (index1 < input1.length || index2 < input2.length) {
            // Base conditions
            // if(index1 >= input1.length) {//0>=1
            //     index2++;
            // }
            // if(index2 >= input2.length) {//0>=1
            //     index1++;
            // }

            // CHeck whether we found median
            if (index1 == mideanIndex && index1 < input1.length) {//0==1//1==1 && 1<1
                return input1[index1];
            } else if (index2 == mideanIndex && index2 < input2.length) {//0==1//0==1
                return input2[index2];
            }

            if (index1 >= input1.length) {//0>=1
                index2++;//1
                continue;
            }
            if (index2 >= input2.length) {//0>=1
                index1++;
                continue;
            }

            // Increement Pointers
            if (input1[index1] > input2[index2]) {//2>3
                index2++;
            } else {
                index1++;//
            }
        }

        return 0;
    }
}


