package com.org.LeDurga.zzz1;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class class1 {

    public static void main(String[] args) throws ParseException {
        //008530030110095400402990105500503
        //0056012300648456700630 123
        Map<String, String> myMap = parseAdditionalData("0085200301000853003011034809088b7bcab13412a97255d999d3059a200630 123",30);
        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        if (Objects.nonNull(myMap.get("31"))){
            System.out.println("Success...");
        }
        System.out.println("done..");
    }

    public static Map<String, String> parseAdditionalData(String field, int fieldNumber) throws ParseException {
        try {
            Map<String, String> map = new HashMap<>();
            String currentField = "";
            while (!field.isEmpty()) {
                int length = Integer.parseInt(field.substring(0,3));
                currentField = field.substring(3, length + 3);
                field = field.substring(3 + currentField.length());
                map.put(currentField.substring(0, 2), currentField.substring(2));
            }
            return map;
        } catch (Exception e) {
            throw new ParseException(" Error while parsing Additional data {}", Integer.parseInt(field));
        }
    }
}
