package com.org.util;

public class masking_Using_SB {

    private static char maskConstant = 'X';

    static String accNumber01 = "1234567891234567";
    static String accNumber02 = "12345678912345678";
    static String accNumber03 = "123456789123456789";
    static String accNumber04 = "123456789123456789123456";
    static String accNumber05 = "1234567834567834567896456789987659123456789123456";

    public static void main(String[] args) {
        call(accNumber01);
        call(accNumber02);
        call(accNumber03);
        call(accNumber04);
        call(accNumber05);
    }

    private static void call(String accNumber) {
        int length = accNumber.length();
        StringBuilder mask_Const = createSpecificMaskConstant(length);
        mask_Const.append(accNumber, length - 2, length);
        System.out.println(mask_Const);
    }

    private static StringBuilder createSpecificMaskConstant(int length) {
        StringBuilder sb = new StringBuilder();
        while ((length - 2) > sb.length()) {
            sb.append(maskConstant);
        }
        return sb;
    }
}
