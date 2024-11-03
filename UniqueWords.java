import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        // Создаем массив с набором слов
        String[] words = {
                "apple", "banana", "orange", "apple", "kiwi",
                "banana", "grape", "orange", "kiwi", "peach",
                "apple", "grape", "banana", "kiwi", "watermelon"
        };

        // Используем HashMap для подсчета уникальных слов
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их количество
        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}