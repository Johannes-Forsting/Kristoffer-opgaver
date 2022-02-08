package wordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {





    public static ArrayList<String> getWordsFromFile(){
        ArrayList<String> words = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/wordCount/text.txt"));
            String line;
            while((line = reader.readLine()) != null){
                String[] currentLine = line.split(" ");
                for (int i = 0; i < currentLine.length ; i++) {
                    words.add(currentLine[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

}
