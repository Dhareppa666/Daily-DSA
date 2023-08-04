package org.util;

public class masking {
    public static void main(String[] args) {
        String request = "123456789123456";
        System.out.println("The request  is: " + request);
        System.out.println("The response is: " + maskIt(request));
    }

    private static String maskIt(String requestPAN) {
        int length = requestPAN.length();
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i >= 3 && i < length-3) {
                response.append('*');
            } else {
                response.append(requestPAN.charAt(i));
            }
        }
        return response.toString();
    }
}
