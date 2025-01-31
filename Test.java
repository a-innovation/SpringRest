import java.util.Arrays;

public class Test {
    /**
     * Main method to demonstrate array sorting
     * @param args command line arguments
     */
    public static void main (String args[]) {
        System.out.print("abc");
        Test test = new Test();
        int[] array = {5, 3, 8, 1, 2};
        test.sortAndPrintArray(array);
    }

    /**
     * Returns a test name
     * @return test name string
     */
    public void getName() {
        System.out.println("test");
    }

    /**
     * Returns username
     * @return username string
     */
    public void getUserName() {
        System.out.println("username");
    }

    /**
     * Sorts array in ascending order and prints values
     * @param array input array to be sorted
     * @return sorted array
     * @throws IllegalArgumentException if array is null
     */
    public int[] sortAndPrintArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        Arrays.sort(array);
        for (int value : array) {
            System.out.println(value);
        }
        return array;
    }
}
