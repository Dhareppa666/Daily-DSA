package main.intvs.int2021_22.nokia;

import java.io.IOException;

public class TestException2 {

    public static void main(String[] args) {
        try {
            foo();
        } catch (IOException e) {
            e.printStackTrace();
        } /*catch (JAXBException e) {
            e.printStackTrace();
        }*/ catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void foo() throws IOException {

    }
}