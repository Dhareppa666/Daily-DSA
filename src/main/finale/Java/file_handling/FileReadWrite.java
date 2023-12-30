package main.finale.Java.file_handling;

import main.finale.Java.file_handling.AllInOneUtils;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {

    private static File file = new File("C:\\My WorkSpace\\DSA\\src\\main\\java\\main.finale\\util\\abc.txt");

    public static void main(String[] args) throws Exception {
        //Using Scanner.
        int noOfLines;
//        noOfLines = readAndFetchNoOfLines();
//        System.out.println("The total no of lines is: " + noOfLines);

        //Using Scanner.
        noOfLines = readAndFetchNoOfLines2();
        System.out.println("The total no of lines is: " + noOfLines);
    }

    private static int readAndFetchNoOfLines() throws FileNotFoundException {
        int res = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            res++;
            System.out.println(sc.nextLine());
        }

        return res;
    }

    private static int readAndFetchNoOfLines2() throws IOException {
        int res = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            res++;
            //System.out.println(st);
            String[] obj = st.split("\\\\");
            AllInOneUtils.printArr(obj);
        }
        return res;
    }
}
