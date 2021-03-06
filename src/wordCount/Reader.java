package wordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {


    static ArrayList<String> words = new ArrayList<String>();


    //Indlæser alle linje og splitter dem ved mellemrum og sætter alle orderne ind i en arrayliste.
    public static void getWordsFromFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/wordCount/MobyDick.txt"));
            String line;
            while((line = reader.readLine()) != null){
                String[] currentLine = line.split(" ");
                currentLine = makeWordsAlike(currentLine);
                for (int i = 0; i < currentLine.length ; i++) {
                    if (currentLine[i].equals("") == false) {
                        words.add(currentLine[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metode som fjerner alle specialtegn og sætter alle bogstaver til små så der ikke kommer duplikater i listen.
    private static String[] makeWordsAlike(String[] curentWords){
        for (int i = 0; i < curentWords.length; i++) {
            curentWords[i] = curentWords[i].replaceAll("[^a-zA-Z]", "");
            curentWords[i] = curentWords[i].toLowerCase();
        }
        return curentWords;
    }

}
