public class ResponseChecker {

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int result = calculateElement(responseTimes);
        System.out.println(result);  
    }

    public static int calculateElement(int[] responseTime) {
        int count = 0;
        double sum = responseTime[0];

        for (int i = 1; i < responseTime.length; i++) {
            double avg = sum / i;

            if (responseTime[i] > avg) {
                count++;
            }

            sum += responseTime[i];
        }

        return count;
    }
}
