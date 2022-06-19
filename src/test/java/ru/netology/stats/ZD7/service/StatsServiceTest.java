package ru.netology.stats.ZD7.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 228,};
        StatsService service = new StatsService();
        int expected = 390;
        int actual = service.calculateSum(sales);
        //System.out.println("Sum " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        long[] sales = {8, 15, 13, 115, 17, 20, 19, 20, 7, 14, 14, 18,};
        StatsService service = new StatsService();
        int expected = 23;
        int actual = service.calcAverage(sales);
        //System.out.println("Average " + expected + " == ? == " + actual);Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxSalesMonth() {
        long[] sales = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20,};
        StatsService service = new StatsService();
        int expected = 12;
        int actual = service.maxSales(sales);
        //System.out.println("Maximum sales month: " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.minSales(sales);
        //System.out.println ("Minimum sales month: " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 15, 15, 18,};
        StatsService service = new StatsService();
        int expected = 3;
        int actual = service.belowAverageSales(sales);
        //System.out.println("Below average sales: " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverageSales() {
        long[] sales = {8, 20, 13, 20, 17, 20, 19, 20, 25, 14, 14, 9,};
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.aboveAverageSales(sales);
        //System.out.println("Above average sales: " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }
}

