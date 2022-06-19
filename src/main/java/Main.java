import ru.netology.stats.ZD7.service.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 20, 13, 20, 17, 20, 19, 20, 25, 14, 14, 18,};

        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.calculateSum(sales);
        System.out.println("Sum " + expected + " == ? == " + actual);

        expected = 15;
        actual = service.calcAverage(sales);
        System.out.println("Average " + expected + " == ? == " + actual);

        expected = 9;
        actual = service.maxSales(sales);
        System.out.println("Maximum sales month: " + expected + " == ? == " + actual);

        expected = 8;
        actual = service.minSales(sales);
        System.out.println ("Minimum sales month: " + expected + " == ? == " + actual);


        expected = 5;
        actual = service.belowAverageSales(sales);
        System.out.println("Below average sales: " + expected + " == ? == " + actual);


        actual = service.aboveAverageSales(sales);
        System.out.println("Above average sales: " + expected + " == ? == " + actual);

    }
}



