public class L3_4 {
    public static int calculateAverage(int[] arr) {
        
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

       
        double average = (double) sum / arr.length;

        
        int roundedAverage = (int) Math.round(average);

        return roundedAverage;
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 2, 7, 5, 1};
        int result = calculateAverage(inputArray);

       
        System.out.println(result); 
    } 
}
