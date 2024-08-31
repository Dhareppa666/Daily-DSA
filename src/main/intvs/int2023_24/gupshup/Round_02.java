package main.intvs.int2023_24.gupshup;

import java.util.Arrays;

public class Round_02 {

    //Saurabh Srivastava
    //SQL query. IP address that has made the modt number of requests in last 4 hours
    // ip, api, time_stamp
    // SQL query. IP address that has made the most number of requests in last 4 hours

    // ip1, t1
    // ip2, t1
    // ip1, t2

    // SELECT MAX(ip_address) from table WHERE() SELECT TOP 1 time_stamp from table Order By time_stamp


    // arr1 = [1,3,10] // arrival
    // arr2 = [4,6,15] // departure
    // find min number of platforms
    //Saurabh Srivastava
    //4:52
    //{9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

    // class TrainTimings {
    //     startTime;
    //     endTime
    // }


    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        // int[] arrival = {1,3,9,10};
        // int[] departure = {4,6,13,15};
        //arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00},
        //dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

        double[] arrival = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00, 19.00};
        double[] departure = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00, 24.00};

         double[][] trainTimings = new double[arrival.length][2];
         for(int index = 0; index<trainTimings.length; index++) {
             trainTimings[index][0] = arrival[index];
             trainTimings[index][1] = departure[index];
         }
         Arrays.sort(trainTimings, (a, b)-> Double.compare(b[1],a[1]));//
        int count = 1;
        int max = Integer.MIN_VALUE;
        double[] prevTrain = trainTimings[0];
        for(int index = 1; index<trainTimings.length; index++) {
            double[] currentTrain = trainTimings[index];
            if(prevTrain[0] < currentTrain[1]) {
                count++;
                prevTrain[0] = Math.min(prevTrain[0], currentTrain[0]);
            } else {
                prevTrain = currentTrain;
                if(count>1) {
                    count--;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println("Min Number of Trains required are: "+ max);
    }
}
