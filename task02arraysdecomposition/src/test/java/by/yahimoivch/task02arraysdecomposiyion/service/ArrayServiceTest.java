package by.yahimoivch.task02arraysdecomposiyion.service;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ArrayServiceTest extends DataProviderForArray {

    ArrayService service = new ArrayService();

    @Test(description = "SelectionSortTest",
            dataProvider = "dataForTestAscSort")
    public void testBubbleSort(GenericArray<Number> first, GenericArray<Number> second) {
        GenericArray<Number> array = service.bubbleSort(first);
        assertEquals(array, second);
    }

    @Test(description = "SelectionSortTest",
            dataProvider = "dataForTestAscSort")
    public void testInsertionSort(GenericArray<Number> first, GenericArray<Number> second) {
        GenericArray<Number> array = service.insertionSort(first);
        assertEquals(array, second);
    }

    @Test(description = "SelectionSortTest",
            dataProvider = "dataForTestAscSort")
    public void testSelectionSort(GenericArray<Number> first, GenericArray<Number> second) {
        GenericArray<Number> array = service.selectionSort(first);
        assertEquals(array, second);
    }

    @Test(description = "ShakerSortTest",
            dataProvider = "dataForTestAscSort")
    public void testShakerSort(GenericArray<Number> first, GenericArray<Number> second) {
        GenericArray<Number> array = service.shakerSort(first);
        assertEquals(array, second);
    }

    @Test(description = "InsertionSortTest",
            dataProvider = "dataForTestAscSort")
    public void testShellSort(GenericArray<Number> first, GenericArray<Number> second) {
        GenericArray<Number> array = service.shellSort(first);
        assertEquals(array, second);
    }

}
