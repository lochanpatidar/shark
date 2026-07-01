public class CountOccurrences {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 20, 30, 40};
        int key = 20;
        int count = 0;

        for (int value : arr) {
            if (value == key) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}
