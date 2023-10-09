package main.finale.In_Walmart.interviews;

public class Test {
    public static void main(String[] args) {
        int[][] input = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };

        int left = 0, right = input[0].length-1, bottom = input.length-1, top =0;
        int rowIndex = 0;
        while(right >= 0 && left<=bottom){//
            if(input[left][right] == 1){
                rowIndex = left;
                right--;
            } else {
                left++;
            }
        }
        printArr(input);
        System.out.println(rowIndex);

    }

    public static void printArr(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
