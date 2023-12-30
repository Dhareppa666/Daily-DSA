package main.finale.Java.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.lang.System.setIn;

public class Solution {

    private static final Map<String, String> countryMap = new HashMap<>();

    public static void main(String[] args) {
        fotmat();

        List<Student> list = List.of(new Student(1, "Arun"), new Student(2, "Singh"), new Student(3, "Seema"));

        List<String> nameStartsWith_S = list.stream().map(Student::getName).filter(str-> str.startsWith("S")).collect(Collectors.toList());

        out.println("------------------------");
        List<Integer> newList = list.stream().map(Student::getId).filter(x -> x<2).collect(Collectors.toList());
        newList.stream().forEach(x-> out.println(x));
    }

    private static void fotmat() {
        String countryValues = "ZRZ:Zairean Zaire (1971–1993)|ZMW:Zambian Kwacha|ZMK:Zambian Kwacha (1968–2012)|ZWD:Zimbabwean Dollar (1980–2008)|\n" +
                "ZWR:Zimbabwean Dollar (2008)|ZWL:Zimbabwean Dollar (2009)|AFN:Afghan Afghani|ALL:Albanian Lek|\n" +
                "ALK:Albanian Lek (1946–1965)|DZD:Algerian Dinar|ADP:Andorran Peseta|AOA:Angolan Kwanza|\n" +
                "AOK:Angolan Kwanza (1977–1991)|AON:Angolan New Kwanza (1990–2000)|AOR:Angolan Readjusted Kwanza (1995–1999)|\n" +
                "BSD:Bahamian Dollar|TJR:Tajikistani Ruble|TJS:Tajikistani Somoni|TZS:Tanzanian Shilling|THB:Thai Baht|\n" +
                "TPE:Timorese Escudo|TOP:Tongan Paʻanga|TTD:Trinidad & Tobago Dollar|UAH:Ukrainian Hryvnia|UAK:Ukrainian Karbovanets|\n" +
                "AED:United Arab Emirates Dirham|USD:US Dollar|ZRN:Zairean New Zaire (1993–1998)|USN:US Dollar (Next day)|\n" +
                "USS:US Dollar (Same day)|UZS:Uzbekistani Som|VUV:Vanuatu Vatu|VES:Venezuelan Bolívar|VEB:Venezuelan Bolívar (1871–2008)|\n" +
                "XOF:West African CFA Franc|CHE:WIR Euro|CHW:WIR Franc|YDD:Yemeni Dinar|YER:Yemeni Rial|YUN:Yugoslavian Convertible Dinar (1990–1992)|\n" +
                "YUR:Yugoslavian Reformed Dinar (1992–1993)";

        String[] arr = countryValues.split("\\|");
        List<String> list = List.of(arr);
        list.stream().map(x -> x.split(":"))
                .map(x -> countryMap.put(x[0], x[1]));//.collect(Collectors.toList());
        out.println(countryMap);
    }
}
