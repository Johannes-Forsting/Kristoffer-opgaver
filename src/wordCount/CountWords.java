package wordCount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static void main(String[] args) {

        //Indlæser alle ord og sætter ind i en Arrayliste.
        Reader.getWordsFromFile();

        //Metode som tilføjer alle ord fra Arraylisten til map.
        addWordsToHashmap(Reader.words);

        //Fandt denne linje på nettet. Ved ikke helt hvordan den virker men den sortere på value og printer dem ud.
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
    //Metode som tager arraylisten med samtlige ord og indsætter dem i Hashmap
    //Hvis key allerede eksistere i Hashmappen lægger jeg 1 til value, ellers tilføjer jeg key og sætter value til 1.
    public static void addWordsToHashmap(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++) {
            if (map.containsKey(words.get(i))) {
                map.put(words.get(i), (map.get(words.get(i)) + 1));
            } else {
                map.put(words.get(i), 1);
            }

        }
    }
}
