package wordCount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static void main(String[] args) {
        Reader.getWordsFromFile();
        addWordsToHashmap(Reader.words);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }

    public static void addWordsToHashmap(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++) {
            if (map.containsKey(words.get(i))) {
                System.out.println(map.get(words.get(i)));
                map.put(words.get(i), (map.get(words.get(i)) + 1));
            } else {
                map.put(words.get(i), 1);
            }

        }
    }
}
