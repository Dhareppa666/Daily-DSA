package java.LeDurga.A;

//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ABC {
    public static void main(String[] args) throws IOException {
        String json = "{ \"color\" : \"White\", \"type\" : \"BMW\" }";
        hello(json);

    }

    public static void hello(String request) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, String> map = objectMapper.readValue(request, new TypeReference<Map<String, String>>(){});
//
//        for (String name: map.keySet()){
//            System.out.println(name + " : " + map.get(name));
//        }
    }
}
