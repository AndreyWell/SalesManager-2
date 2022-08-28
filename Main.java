public class Main {
    public static void main(String[] args) {
        int[] sales = {300, 400, 500, 200};

        SalesManager salesManager = new SalesManager(sales);

        int result = salesManager.max();
        System.out.println(result);
    }
}
