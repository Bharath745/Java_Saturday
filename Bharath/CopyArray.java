public class CopyArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 4};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nElements of Array 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}