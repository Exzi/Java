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
