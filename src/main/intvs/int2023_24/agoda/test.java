package main.intvs.int2023_24.agoda;

import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
import java.net.*;
//        import org.json.simple.*;
//        import org.json.simple.parser.*;
//        import java.net.http.*;
//        import java.net.URI;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import com.google.gson.*;
//
//        import org.json.JSONArray;
//import org.json.JSONObject;
//class Result {
//
//    /*
//     * Complete the 'bestUniversityByCountry' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING country as parameter.
//     * Base URL for copy/paste: https://jsonmock.hackerrank.com/api/universities
//     */
//
//    private static final String URL = "https://jsonmock.hackerrank.com/api/universities";
//
//    public static String bestUniversityByCountry(String country) {
//        int currPage = 1;
//        int totalPages = 1;
//        int rank = Integer.MAX_VALUE;
//        String finalName = "";
//        while(currPage<=totalPages) {
//            try{
//                String currUrl = URL + "?page="+currPage;
//                HttpURLConnection conn = (HttpURLConnection) new URL(currUrl).openConnection();
//                conn.setRequestMethod("GET");
//                conn.setConnectTimeout(3500);
//                conn.setReadTimeout(3500);
//
//                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//                String line;
//                StringBuilder res = new StringBuilder();
//
//                while((line = br.readLine()) !=null) {
//                    res.append(line);
//                    System.out.println(line);
//                }
//                br.close();
//
//                JSONObject jsonResponse = new JSONObject(res.toString());
//
//                totalPages = jsonResponse.getInt("total_pages");
//                currPage++;
//
//                JSONArray data = jsonResponse.getJSONArray("data");
//
//                for(int i=0; i < data.length(); i++) {
//                    System.out.println("Test");
//                    JSONObject uni = data.getJSONObject(i);
//                    String uniName= uni.getString("university");
//                    Integer currRank= Integer.parseInt(uni.getString("rank_display"));
//                    // System.out.println(uniName + ":");
//
//                    JSONObject loc= uni.getJSONObject("location");
//                    String currCountry = loc.getString("country");
//
//                    // System.out.println(uniName + ":" + currRank);
//                    if(currCountry.equalsIgnoreCase(country)) {
//                        if(rank > currRank) {
//                            finalName = uniName;
//                            rank = currRank;
//                        }
//                    }
//                }
//
//            } catch(Exception e) {
//
//            }
//        }
//        return finalName;
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String country = bufferedReader.readLine();
//
//        String result = Result.bestUniversityByCountry(country);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

