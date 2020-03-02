public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        int sum = -100;
        for (int i = 1; i< arr.length -1; i++ ) {
            for (int j=1; j<arr.length -1; j++) {
                int currentHourGlassSum = arr[i-1][j+1] + arr[i-1][j] + arr[i-1][j-1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] + + arr[i+1][j+1];
                if (currentHourGlassSum > sum) {
                    sum = currentHourGlassSum;
                }
            }
        }
        return sum;
    }
}
