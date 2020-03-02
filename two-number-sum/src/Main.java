import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.");

        int[] arr = new int[] {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(arr, 9)));

    }

    private static int[] twoSum(int[] arr, int tatget) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i =0; i<arr.length; i++) {
            int complement = tatget - arr[i];
            if(map.containsKey(complement)) {
                result[0] = i;
                result[1] = map.get(complement);
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        return result;
    }
}
