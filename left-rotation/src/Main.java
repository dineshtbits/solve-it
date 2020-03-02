public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = new int[] {1,2,3,4};
        System.out.println(leftRot(a, 2));
    }

    private static int[] leftRot(int[] a, int d) {
        int[] newArray = new int[a.length];

        for (int i = 0; i<a.length;i++) {

            int newPos = i - d;

            if (newPos < 0) {
                newPos = a.length - Math.abs(newPos);
            }
            newArray[newPos] = a[i];
        }
        return newArray;
    }
}
