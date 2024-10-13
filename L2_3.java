public class L2_3 {
    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");

        StringBuilder result = new StringBuilder();

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                result.append(line).append("\n");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String text = "line1\n\nline2\n\n\nline3\n"; 

        String cleanedText = removeEmptyLines(text);
        System.out.println(cleanedText);
    }
}
