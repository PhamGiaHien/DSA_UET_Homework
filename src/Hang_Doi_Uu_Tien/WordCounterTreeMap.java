package Hang_Doi_Uu_Tien;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class WordCounterTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String normalizedInput = input.toLowerCase();

        Map<String, Integer> wordCount = new TreeMap<>();
        String[] words = normalizedInput.split("\\s+");

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> mp : wordCount.entrySet()) {
            System.out.println(mp.getKey() + ": " + mp.getValue());
        }
    }
}