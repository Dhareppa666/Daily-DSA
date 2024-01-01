package main.intvs.int2021_22.Recro;

import java.util.List;
import java.util.stream.Collectors;

public class Sample02 {

    public static void main(String[] args) {
        List<String> list = List.of("saahil", "Sahil", "shil");
        List<String> result = list.stream().filter(s->s.startsWith("Sa")).collect(Collectors.toList());
        System.out.println(result);
    }
}
