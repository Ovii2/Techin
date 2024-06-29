package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> dictionary = new HashMap<>();
    private String file;


    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.file = file;
    }


    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }


    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        if (dictionary.containsValue(word)) {
            return dictionary.entrySet()
                    .stream()
                    .filter(entry -> word.equals(entry.getValue()))
                    .map(Map.Entry::getKey).findFirst().orElse(null);
        }
        return null;
    }

    public void delete(String word) {
        dictionary.remove(word);
        if (dictionary.containsValue(word)) {
            dictionary.values().remove(word);
        }
    }

    public boolean load() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            for (String line : lines) {
                String[] parts = line.split(":");
                String word = parts[0].trim();
                String translation = parts[1].trim();
                dictionary.put(word, translation);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean save() {
        try (FileWriter writer = new FileWriter(file)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + System.lineSeparator());
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> s : dictionary.entrySet()) {
            sb.append(String.format("%s : %s%n", s.getKey(), s.getValue()));
        }
        return sb.toString();
    }
}
