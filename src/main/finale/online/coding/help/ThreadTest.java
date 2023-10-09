package org.online.coding.help;

import java.io.*;

public class ThreadTest {
    static class Thread1 extends Thread {
        ThreadTest tt = null;

        Thread1(ThreadTest tt) {
            this.tt = tt;
        }

        public void run() {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try(BufferedReader br = new BufferedReader(new FileReader(""))) {
                fw = new FileWriter("C:\\opt\\vcs\\settlement\\encryption_backup\\multi_thread_Test.txt");
                bw = new BufferedWriter(fw);
                String line = "";
                while ((line = tt.read()) != null && !line.equals("EOF")) {
                    Thread.sleep(1);
                    if (!line.contains("*")) {
                        if (line.contains("//")) {
                            int start = line.indexOf("//");
                            line = line.substring(0, start);
                        }
                        bw.write(line);
                        bw.newLine();
                        System.out.println(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String read() {
        System.out.println("In read");
        return "read";
    }
}
