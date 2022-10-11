package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum);

    }

    public long averageSales(long[] sales) {
        return (sumSales(sales) / sales.length);
    }

    public long maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > sales[maxMonth]) {
                maxMonth = (int) i;
            }

        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int salesUnderAverage(long[] sales) {
        long avg = averageSales(sales);
        int count = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < avg) {
                count++;
            }

        }
        return count;
    }

    public int salesOverAverage(long[] sales) {
        long avg = averageSales(sales);
        int count = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > avg) {
                count++;
            }

        }
        return count;
    }
}