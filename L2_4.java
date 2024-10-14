import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class L2_4 {
  
  public static void findMinMax(int[] array) {
    if (array == null || array.length == 0) {
        System.out.println("Массив пустой или null.");
        return;
    }

    
    int min = array[0];
    int max = array[0];

    
    for (int num : array) {
        if (num < min) {
            min = num;
        }
        if (num > max) {
            max = num;
        }
    }

    
    logToFile(min, max);
}


private static void logToFile(int min, int max) {
   
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    String timestamp = now.format(formatter);

    
    String logEntry = timestamp + " {min: " + min + ", max: " + max + "}\n";

    
    try (FileWriter writer = new FileWriter("log.txt", true)) {
        writer.write(logEntry);
    } catch (IOException e) {
        System.out.println("Ошибка при записи в лог-файл: " + e.getMessage());
    }
}

public static void main(String[] args) {
    
    int[] array = {7, 85, 90, 73, -2, 10};

    
    findMinMax(array);
}  
}
