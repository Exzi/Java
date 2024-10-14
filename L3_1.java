import java.util.ArrayList;
import java.util.List;

public class L3_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 2, -3, 4, -5, 6);
        List<Integer> result = removeNegativeNumbers(numbers);
        System.out.println("Результат: " + result);
    }

    
    public static List<Integer> removeNegativeNumbers(List<Integer> list) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : list) {
            if (num >= 0) {
                positiveNumbers.add(num);
            }
        }
        return positiveNumbers;
    }
}
