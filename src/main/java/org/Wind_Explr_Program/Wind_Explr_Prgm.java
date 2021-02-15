package org.Wind_Explr_Program;

public class Wind_Explr_Prgm {

    private static final Long timeInMinutes = 10L; // x --> In Minutes

    private static final Long timeToRun = 1000L * 60L * timeInMinutes;

    private static final Long closeTime = 10000L; //10 Seconds

    private static final Long waitTime = 60000L; //1 mins

    public static void main(String[] args) throws Exception {

        Long startTime = System.currentTimeMillis();
        Long currentTime = System.currentTimeMillis();

        try {
            while (timeToRun >= (currentTime - startTime)) {
                Process p = Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe \"http://www.google.com\"");
                Thread.sleep(closeTime);
                p.destroy();
                System.out.println("Return value was " + p.waitFor());
                Thread.sleep(waitTime);
                currentTime = System.currentTimeMillis();
            }
        } catch (Exception e ) {
            System.out.println("The Program is Aborted.");
            throw new Exception(e);
        }
    }
}