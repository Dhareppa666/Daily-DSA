package main.intvs.int2023_24.walmart;

//[2, 3, 4, 1, 2, 30, 9, 10, 1]

//Slot size : 4
//Operation: reverse
//[1, 4, 3, 2, 10, 9, 20, 2, 1]

//Operation is add
//[10, 51, 1]

import java.util.Arrays;

class GenericUtils {

    public static int[] reverse(int left, int right, int[] array) {
        int rightIndex = (left+ (right-left)) /2;
        while (left<rightIndex) {
            int tempValue = array[left];
            array[left] = array[rightIndex];
            array[rightIndex] = tempValue;
            rightIndex--;
            left++;
        }
        return array;
    }

    public static int add(int left, int right, int[] array) {
        int sum = 0;
        for (int index = left; index <= right; index++) {
            sum += array[index];
        }
        return sum;
    }
}

interface ArrayOperationInterface {

    public int[] reverse(int slotSize);

    public int[] add(int slotSize);
}


class ArrayOperation implements ArrayOperationInterface {
    private int[] input;

    private int slotSize;//TODO

    public ArrayOperation(int[] input, int slotSize) {
        this.input = input;
        this.slotSize = slotSize;
    }

    @Override
    public int[] reverse(int slotSize) {
        int[] clonedInput = Arrays.copyOf(input, input.length);
        int leftIndex = 0;//0
        int rightIndex = slotSize-1;//4

        while (rightIndex < input.length) {
            GenericUtils.reverse(leftIndex, rightIndex, clonedInput);//0,3,
            leftIndex += slotSize;//3
            rightIndex += slotSize;//7
        }
        return clonedInput;
    }

    @Override
    public int[] add(int slotSize) {
        int leftIndex = 0;//0
        int rightIndex = slotSize - 1;//3

        int unProcessedLength = input.length % slotSize;
        int[] additionArray = new int[(input.length / slotSize) + (unProcessedLength > 0 ? 1 : 0)];
        int resultArrayIndex = 0;
        while (rightIndex < input.length) {
            int sum = GenericUtils.add(leftIndex, rightIndex, input);//3,
            additionArray[resultArrayIndex++] = sum;
            leftIndex += slotSize;//3
            rightIndex += slotSize;//7
        }
//        if (unProcessedLength != 1) {
//
//        }
        return additionArray;
    }
}

public class Intv_04 {

    public static void main(String[] args) {
        int[] input = {2, 3, 4, 1, 2, 30, 9, 10, 1};
        ArrayOperation obj = new ArrayOperation(input, 0);

        int[] reversedArray = obj.reverse(4);
        System.out.println(Arrays.toString(reversedArray));

        int[] arrayAddition = obj.add(4);
        System.out.println(Arrays.toString(arrayAddition));
    }

}
