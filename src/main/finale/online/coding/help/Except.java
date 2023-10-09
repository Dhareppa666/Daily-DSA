package main.finale.online.coding.help;

public class Except {
    public static boolean checkArgs(String[] args) throws Exception {
        if (args.length != 2) {
            throw new NullPointerException();
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            Except.checkArgs(args);
        } catch (NullPointerException b) {
            System.out.println("Bad arguments");
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("Unknown exception");
            System.exit(-2);
        }
        System.out.println("Success");
    }
}
