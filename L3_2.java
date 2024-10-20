import java.util.HashSet;
import java.util.Set;
public class L3_2 {

    public static int[] getUniqueElements (int[] arr) {
        Set<Intger> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
        int[] resultArray = getUniqueElements(inputArray);

        // Вывод результата
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
 }
