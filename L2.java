public class L2 {
    public static String buildUrl(String baseUrl, String params) {
        // Разделяем строку на пары ключ-значение
        String[] paramPairs = params.split("&");
        
        // Строим строку с корректными параметрами
        StringBuilder url = new StringBuilder(baseUrl);
        boolean firstParam = true;
        
        for (String pair : paramPairs) {
            // Проверяем, что значение не "null"
            if (!pair.endsWith("null")) {
                if (!firstParam) {
                    url.append("&");
                }
                url.append(pair);
                firstParam = false; // После первого параметра добавляем &
            }
        }
        
        return url.toString();
    }

    public static void main(String[] args) {
        String baseUrl = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        
        String result = buildUrl(baseUrl, params);
        System.out.println(result);
    }
}