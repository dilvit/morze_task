package com.epam.morze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("morse.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("а", ".-");
        map.put("б", "-...");
        map.put("в", ".--");
        map.put("г", "--.");
        map.put("д", "-..");
        map.put("е", ".");
        map.put("ж", " ...-");
        map.put("з", "--..");
        map.put("и", "..");
        map.put("к", "-.-.");
        map.put("л", ".-..");
        map.put("м", "--");
        map.put("н", "-.");
        map.put("о", "---");
        map.put("п", ".--.");
        map.put("р", ".-.");
        map.put("с", "...");
        map.put("т", "-");
        map.put("у", "..-.");
        map.put("ф", " ..-.");
        map.put("х", "....");
        map.put("ц", "-.-.");
        map.put("ч", "---.");
        map.put("ш", "----");
        map.put("щ", "--.-");
        map.put("э", "..-..");
        map.put("ю", "..--");
        map.put("я", ".-.-");
        map.put("ь", "-..-");
        map.put("ы", "-.-");
        map.put("й", ".---");

        try {
            bw = new BufferedWriter(new FileWriter("morseTwo.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder sb = new StringBuilder();

                String[] words = line.split(" ");

                for (String word : words) {
                    for (int i = 0; i < word.length(); i++) {
                        sb.append(map.get(String.valueOf(word.charAt(i)).toLowerCase()));
                    }
                    sb.append(" ");
                }

                bw.write(new String(sb));

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
            bw.close();
        }

    }

}
