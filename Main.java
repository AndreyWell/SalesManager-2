public class Main {
    public static void main(String[] args) {
        long[] sales = {300, 400, 500, 200};

        SalesManager salesManager = new SalesManager(sales);

        long result = salesManager.max();
        System.out.println(result);
    }
}
