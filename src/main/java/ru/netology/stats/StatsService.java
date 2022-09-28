package ru.netology.stats;

public class StatsService {
    public int getSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int getMiddleSum(int[] sales) {
        return getSum(sales) / sales.length;
    }

    public int getMinMonth(int[] sales) {
        int min = Min(sales);
        int monthCount = 0;
        int minMonth = 0;
        for (int sale : sales) {
            monthCount++;
            if (sale == min) {
                minMonth = monthCount;
            }
        }
        return minMonth;
    }

    private int Min(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public int getMaxMonth(int[] sales) {
        int max = Max(sales);
        int monthCount = 0;
        int monthWithMax = 0;
        for (int sale : sales) {
            monthCount++;
            if (sale == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }

    private int Max(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int getLowestMonths(int[] sales) {
        int middle = getMiddleSum(sales);

        int lowestMonths = 0;
        for (int sale : sales) {
            if (sale < middle) {
                lowestMonths++;
            }
        }
        return lowestMonths;
    }

    public int getBestMonths(int[] sales) {
        int middle = getMiddleSum(sales);

        int bestMonths = 0;
        for (int sale : sales) {
            if (sale > middle) {
                bestMonths++;
            }
        }
        return bestMonths;
    }
}