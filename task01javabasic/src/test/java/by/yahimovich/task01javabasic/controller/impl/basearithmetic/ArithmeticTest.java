package by.yahimovich.task01javabasic.controller.impl.basearithmetic;

import by.yahimovich.task01javabasic.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ArithmeticTest {

    ArithmeticService service = new ArithmeticService();

    @DataProvider(name = "dataForSum")
    public Object[][] createDataForSum() {
        return new Object[][]{
                {new int[]{3, 5}, 8},
                {new int[]{-3, 3}, 0},
                {new int[]{0, 0}, 0},
                {new int[]{-3, -5}, -8},
                {new int[]{-300, 200}, -100},
                {new int[]{10, 0}, 10}
        };
    }

    @DataProvider(name = "negativeDataForSum")
    public Object[][] createNegativeDataForSum() {
        return new Object[][]{
                {new int[]{3, 5}, 2},
                {new int[]{-3, 3}, 1},
                {new int[]{0, 0}, 12},
                {new int[]{-3, -5}, 8},
                {new int[]{-300, 200}, 100},
                {new int[]{10, 0}, 0}
        };
    }

    @DataProvider(name = "dataForSub")
    public Object[][] createDataForSub() {
        return new Object[][]{
                {new int[]{5, 3}, 2},
                {new int[]{-3, 3}, -6},
                {new int[]{0, 0}, 0},
                {new int[]{-3, -5}, 2},
                {new int[]{-300, 200}, -500},
                {new int[]{10, 0}, 10}
        };
    }

    @DataProvider(name = "positiveDataForMultiplication")
    public Object[][] createPositiveDataForMultiplication() {
        return new Object[][]{
                {new int[]{5, 3}, 15},
                {new int[]{-3, 3}, -9},
                {new int[]{0, 0}, 0},
                {new int[]{-3, -5}, 15},
                {new int[]{-300, 200}, -60000},
                {new int[]{10, 0}, 0}
        };
    }

    @DataProvider(name = "positiveDataForDivision")
    public Object[][] createPositiveDataForDivision() {
        return new Object[][]{
                {new int[]{10, 5}, 2},
                {new int[]{-3, 3}, -1},
                {new int[]{0, 1}, 0},
                {new int[]{-3, -10}, 0.3},
                {new int[]{-300, 200}, -1.5},
                {new int[]{10, 4}, 2.5}
        };
    }

    @DataProvider(name = "positiveDataForDegree")
    public Object[][] createPositiveDataForDegree() {
        return new Object[][]{
                {new int[]{10, -2}, 0.01},
                {new int[]{-3, 3}, -27},
                {new int[]{0, 1}, 0},
                {new int[]{2, 4}, 16},
                {new int[]{-300, 2}, 90000},
                {new int[]{10, 4}, 10000}
        };
    }

    @DataProvider(name = "positiveDataForSqrt")
    public Object[][] createPositiveDataForSqrt() {
        return new Object[][]{
                {new int[]{4}, 2},
                {new int[]{9}, 3},
                {new int[]{0}, 0},
                {new int[]{81}, 9},
                {new int[]{400}, 20},
                {new int[]{5}, 2.2360679774997896964091736687313}
        };
    }

    @DataProvider(name = "negativeDataForSqrt")
    public Object[][] createNegativeDataForSqrt() {
        return new Object[][]{
                {-4.0, 0.},
                {-100.0, 0.},
                {-0.36, 0.}
        };
    }

    //Test for sum method

    @Test(description = "Positive test sum method",
            dataProvider = "dataForSum")
    public void testSum(int[] ab, double c) {
        double actual = service.sum(ab[0], ab[1]);
        assertEquals(actual, c);
    }

    //Test for sub method

    @Test(description = "Test sub method",
            dataProvider = "dataForSub")
    public void testSub(int[] ab, double c) {
        double actual = service.sub(ab[0], ab[1]);
        assertEquals(actual, c);
    }

    //Test for multiplication method

    @Test(description = "Test multiplication method",
            dataProvider = "positiveDataForMultiplication")
    public void testMultiplication(int[] ab, double c) {
        double actual = service.multiplication(ab[0], ab[1]);
        assertEquals(actual, c);
    }

    //Test for division method

    @Test(description = "Test division method",
            dataProvider = "positiveDataForDivision")
    public void testDivision(int[] ab, double c) {
        double actual = service.division(ab[0], ab[1]);
        assertEquals(actual, c);
    }

    // Test for degree method

    @Test(description = "Positive test degree method",
            dataProvider = "positiveDataForDegree")
    public void testDegree(int[] ab, double c) {
        double actual = service.power(ab[0], ab[1]);
        assertEquals(actual, c);
    }

    //Tests for sqrt method

    @Test(description = "Positive test sqrt method",
            dataProvider = "positiveDataForSqrt")
    public void testSqrt(int[] ab, double c) {
        double actual = service.sqrt(ab[0]);
        assertEquals(actual, c);
    }

    @Test(description = "Negative test sqrt method",
            dataProvider = "negativeDataForSqrt",
            expectedExceptions = Exception.class)
    public void negativeTestSqrt(int a, double c) {
        double actual = service.sqrt(a);
        assertThrows(Exception.class, () -> service.sqrt(a));
    }
}
