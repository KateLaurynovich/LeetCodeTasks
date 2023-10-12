package arrayTasks;

import org.jetbrains.annotations.NotNull;

public class ArrayTask1475 {
    public int[] finalPrice (int @NotNull [] prices ) {
        int[] finalPrice = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("i = " + i);
            for (int j = i +1; j < prices.length; j++) {
                System.out.println("j = " + j);
                if (prices[j] < prices[i] & i<j) {
                    finalPrice[i] = prices[i] - prices[j];
                    System.out.println("prices["+i+"] = " + prices[i] + " - prices["+j+"]" + - prices[j]);
                    System.out.println("final["+i+"] = " + finalPrice[i]);
                   break;
                }
                else {

                    if (j > prices.length){
                        finalPrice[i] = prices[i];
                        System.out.println("ELSE final["+i+"] = " + finalPrice[i]);
                    }

//
//                    break;

                }
            }

        }

        return finalPrice;
    }

}
