import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("xyz.txt"));
            StringBuilder inputText = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                inputText.append(line).append("\n");
            }
            reader.close();

            String text = inputText.toString();
            String[] words = text.split("[\\s\\p{Punct}]+"); // Split by space or punctuation

            int totalWordCount = words.length;
            System.out.println("Total word count: " + totalWordCount);

            // Additional features
            // You can implement more features here, like ignoring common words or providing statistics

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
