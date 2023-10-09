package main.finale.In_Walmart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

        public static void main(String[] args) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(
                        "/Users/d0s0jfn/My_Workspace/Team_Conversation/ace-manager-core-hours/load-testing/perf/temp.json"));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line.trim());
                    // read next line
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
