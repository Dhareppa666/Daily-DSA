package main.finale.online.coding.help;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static Map<String, Integer> processData(ArrayList<String> array) {
        /*
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */

        Map<String,Integer> retVal = new HashMap<String,Integer>();
        ListIterator<String> listIterator = array.listIterator();
        while (listIterator.hasNext()) {
            String input = listIterator.next();
            String[] split = input.split(",");

        }
        //retVal.put();
        return retVal;
    }

    public static void main(String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("C:\\opt\\vcs\\settlement\\encryption_backup\\multi_thread_Test.txt")));
            while (in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String, Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for (Map.Entry<String, Integer> e : retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
