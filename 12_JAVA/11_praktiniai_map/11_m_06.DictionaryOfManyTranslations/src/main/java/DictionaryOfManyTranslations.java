import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> wordTranslations = new HashMap<>();

    public DictionaryOfManyTranslations() {
    }

    public void add(String word, String translations) {
        if (!wordTranslations.containsKey(word)) {
            wordTranslations.put(word, new ArrayList<>());
        }
        ArrayList<String> translationList = wordTranslations.get(word);
        translationList.add(translations);
    }

    public ArrayList<String> translate(String word) {
        return !wordTranslations.containsKey(word) ? new ArrayList<>() : wordTranslations.get(word);
    }

    public void remove(String word) {
        wordTranslations.remove(word);
    }
}
