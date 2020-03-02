public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,0,1,0,0,1};

        int noOfJumps = 0;

        for (int i =0; i < arr.length -2; i++) {
            if(arr[i] == 0 && arr[i] != arr[i+1]) {
                noOfJumps = noOfJumps + 1;
            }
        }
    }
}
