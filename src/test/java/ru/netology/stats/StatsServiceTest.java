package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void ShouldCalculateSum() {
        assertEquals(180, service.getSum(sales));
    }

    @Test
    void ShouldCalculateMiddleSum() {
        assertEquals(15, service.getMiddleSum(sales));
    }

    @Test
    void ShouldCalculateMinMonth() {
        assertEquals(9, service.getMinMonth(sales));
    }

    @Test
    void ShouldCalculateMaxMonth() {
        assertEquals(8, service.getMaxMonth(sales));
    }

    @Test
    void ShouldCalculateLowestMonths() {
        assertEquals(5, service.getLowestMonths(sales));
    }

    @Test
    void ShouldCalculateBestMonths() {
        assertEquals(5, service.getBestMonths(sales));
    }
}