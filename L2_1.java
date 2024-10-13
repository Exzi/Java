public class L2_1 {
    public static String buildUrl(String baseUrl, String params) {
        String[] paramPairs = params.split("&");
        
        StringBuilder url = new StringBuilder(baseUrl);
        boolean firstParam = true;
        
        for (String pair : paramPairs) {
            if (!pair.endsWith("null")) {
                if (!firstParam) {
                    url.append("&");
                }
                url.append(pair);
                firstParam = false; 
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