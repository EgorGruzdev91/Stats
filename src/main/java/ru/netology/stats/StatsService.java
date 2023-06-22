package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsBellowAverageSales(long[] sales) {
        int monthsBellow = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                monthsBellow++;
            }
        }
        return monthsBellow;
    }

    public int monthAboweAverageSales(long[] sales) {
        int monthsAbowe = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                monthsAbowe++;
            }
        }
        return monthsAbowe;
    }

}
