package arrayTasks;

import org.jetbrains.annotations.NotNull;

public class ArrayTask1475 {
    public int[] finalPrice(int[] prices) {
        int[] finalPrice = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            finalPrice[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    finalPrice[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return finalPrice;
    }
}
