package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class PhoneNumber {
    public static String getPhoneNumbers(String country, String phoneNumber) throws Exception {
        String urlStr = "https://jsonmock.hackerrank.com/api/countries?name=" + URLEncoder.encode(country, "UTF-8");
        URL url = new URL(urlStr);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Parse the JSON response and extract the calling code(s)
        String callingCode = null;
        int callingCodeIndex = -1;
        int highestIndex = -1;
        for (int i = 0; i < response.length() - 1; i++) {
            if (response.charAt(i) == '[' && response.charAt(i + 1) == '{') {
                int endIndex = response.indexOf("}", i + 1) + 1;
                String jsonStr = response.substring(i, endIndex);
                if (jsonStr.contains("\"callingCodes\":")) {
                    int callingCodeStartIndex = jsonStr.indexOf("\"callingCodes\":") + 16;
                    int callingCodeEndIndex = jsonStr.indexOf("]", callingCodeStartIndex);
                    String callingCodesStr = jsonStr.substring(callingCodeStartIndex, callingCodeEndIndex);
                    String[] callingCodes = callingCodesStr.split(",");
                    callingCodeIndex = callingCodes.length - 1;
                    if (callingCodeIndex > highestIndex) {
                        highestIndex = callingCodeIndex;
                        callingCode = callingCodes[highestIndex].replaceAll("[^0-9]", "");
                    }
                }
            }
        }

        if (callingCode == null) {
            return "-1";
        } else {
            return "+" + callingCode + " " + phoneNumber;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getPhoneNumbers("Afghanistan", "656445445"));
        System.out.println(getPhoneNumbers("Puerto Rico", "564593986"));
        System.out.println(getPhoneNumbers("Oceania", "987574876"));
        System.out.println(getPhoneNumbers("Nigeria", "987574876"));
    }

}
