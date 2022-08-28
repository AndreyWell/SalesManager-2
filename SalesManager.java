import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int result = 0;
        Arrays.sort(sales);
        for (int i = 1; i < sales.length - 1; i++) {
            result += sales[i];
        }
        return result / (sales.length - 2);
    }
}
