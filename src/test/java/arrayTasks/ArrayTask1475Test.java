package arrayTasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ArrayTask1475Test {

    @Test (dataProvider = "Arrays")
    public void testFinalPrice(int [] first, int [] second) {
        ArrayTask1475 arrayTask1475 = new ArrayTask1475();
        System.out.print("first: ");
        printArray(first);
        System.out.print("final: ");
        printArray(arrayTask1475.finalPrice(first));
        System.out.print("Expected: ");
        printArray(second);
        assertEquals(second, arrayTask1475.finalPrice(first));
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.println("]");
    }

    @DataProvider (name = "Arrays")
    public static Object[][] evenArrays() {
        int [] f1 = {8,4,6,2,3};
        int [] f2 = {4,2,4,2,3};
        int [] s1 = {1,2,3,4,5};
        int [] s2 = {1,2,3,4,5};
        int [] t1 = {10,1,1,6};
        int [] t2 = {9,0,1,6};
        return new Object[][]{  {f1, f2 },
                                {s1, s2 },
                                {t1, t2}};
    }
}