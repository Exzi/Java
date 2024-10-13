public class L2_2 {
    
    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csvBuilder = new StringBuilder();
        
      
        csvBuilder.append(String.join(",", headers));
        csvBuilder.append("\n");
        
      
        for (String[] row : data) {
            csvBuilder.append(String.join(",", row));
            csvBuilder.append("\n");
        }
        
        return csvBuilder.toString().trim(); 
    }
    public static void main(String[] args) {
        // Пример данных
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
            {"John", "30", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
        };
        
        // Генерация CSV строки
        String csvResult = generateCSV(headers, data);
        System.out.println(csvResult);
    }
}
