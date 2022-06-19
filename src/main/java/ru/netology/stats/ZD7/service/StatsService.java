package ru.netology.stats.ZD7.service;

public class StatsService {
    public int calculateSum(long[] sales) {
        int allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }

        return allSales;
    }

    public int calcAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int badSalesMonths = 0; // кол -во месяцев плохих продаж (ниже среднего)
        int average = calcAverage(sales);

        for (long sale : sales) {
            if (sale < average) {
                badSalesMonths++;
            }
        }

        return badSalesMonths;
    }

    public int aboveAverageSales(long[] sales) {
        int bestSalesMonths = 0; // кол -во месяцев хороших продаж (выше среднего)
        int average = calcAverage(sales);

        for (long sale : sales) {
            if (sale > average) {
                bestSalesMonths++;
            }
        }

        return bestSalesMonths;
    }
}
