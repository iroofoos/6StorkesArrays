package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindsumSales() {

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSales() {

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {

        long expectedMonth = 6;
        long actualMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinSales() {

        long expectedMonth = 9;
        long actualMonth = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesUnderAverageTest() {

        long expected = 5;
        long actual = service.salesUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesOverAverageTest() {

        long expected = 5;
        long actual = service.salesOverAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
