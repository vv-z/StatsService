package ru.netology.stats;

public class StatsService {

    public Long sum(long[] sales) {
        long totalSale = 0;
        for (Long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }

        }

        return monthMaximum + 1;

    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        long saleMinimum = sales[0];

        for (int i = 0; i > sales.length; i++) {
            if (sales[i] >= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }

        }

        return monthMinimum + 1;

    }

    public int monthsBelowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
