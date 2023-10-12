package arrayTasks;

import org.testng.annotations.Test;

public class ArrayTask1475Test {

    @Test
    public void testFinalPrice() {
        ArrayTask1475 arrayTask1475 = new ArrayTask1475();
        int[] first = {8,4,6,2,3};
        int[] second = {4,2,4,2,3};
        System.out.println("first: ");
        printArray(first);
        System.out.println("final: ");
        printArray(arrayTask1475.finalPrice(first));
        System.out.println("Expected: ");
        printArray(second);
//        System.out.println("final :" + arrayTask1475.finalPrice(first));
//        System.out.println("Expected" + second);
//        System.out.println(first);
//
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

}