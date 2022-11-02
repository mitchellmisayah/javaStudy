
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(intArray[i]);
        }
    }
}
