import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int n = 9;
        int[] intArray = new int[]{ 10,20,20,10,10,30,50,10,20 };
        System.out.println(sockMerchant(n,intArray));

    }

    private static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> pairs = new HashSet<>();
        int noOfPairs = 0;

        for(int a: ar) {
            if(!pairs.contains(a)) {
                pairs.add(a);
            } else {
                noOfPairs++;
                pairs.remove(a);
            }
        }
        return noOfPairs;
    }
}
