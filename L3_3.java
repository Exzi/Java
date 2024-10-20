import java.util.ArrayList;
import java.util.List;
public class L3_3 {
    public static String[] filterWordsByLength(String[] words) {
      
        List<String> filteredWords = new ArrayList<>();

        
        for (String word : words) {
        
            if (word.length() > 3) {
                filteredWords.add(word);
            }
        }

      
        return filteredWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] inputArray = {"cat", "elephant", "dog", "giraffe"};
        String[] resultArray = filterWordsByLength(inputArray);

       
        for (String word : resultArray) {
            System.out.println(word);
        }
    }
}
