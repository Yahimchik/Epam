//package by.yahimoivch.task02arraysdecomposiyion.service;
//
//import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
//
//public class DataProviderForArray {
//
//    @DataProvider(name = "dataForTestAscSort")
//    public static Object[][] createDataForAscSort() {
//        GenericArray<Number> array = new GenericArray<>(4);
//        GenericArray<Number> array1 = new GenericArray<>(4);
//        GenericArray<Number> array2 = new GenericArray<>(4);
//        GenericArray<Number> array3 = new GenericArray<>(4);
//        GenericArray<Number> array4 = new GenericArray<>(4);
//        GenericArray<Number> array5 = new GenericArray<>(4);
//        GenericArray<Number> array6 = new GenericArray<>(4);
//        GenericArray<Number> array7 = new GenericArray<>(4);
//        GenericArray<Number> array8 = new GenericArray<>(4);
//        GenericArray<Number> array9 = new GenericArray<>(4);
//        GenericArray<Number> array10 = new GenericArray<>(4);
//        GenericArray<Number> array11 = new GenericArray<>(4);
//        GenericArray<Number> array12 = new GenericArray<>(4);
//        GenericArray<Number> array13 = new GenericArray<>(4);
//        GenericArray<Number> array14 = new GenericArray<>(4);
//        GenericArray<Number> array15 = new GenericArray<>(4);
//        GenericArray<Number> array16 = new GenericArray<>(4);
//        GenericArray<Number> array17 = new GenericArray<>(4);
//        GenericArray<Number> array18 = new GenericArray<>(4);
//        GenericArray<Number> array19 = new GenericArray<>(4);
//        GenericArray<Number> array20 = new GenericArray<>(4);
//        GenericArray<Number> array21 = new GenericArray<>(4);
//        GenericArray<Number> array22 = new GenericArray<>(4);
//        GenericArray<Number> array23 = new GenericArray<>(4);
//        GenericArray<Number> array24 = new GenericArray<>(4);
//        GenericArray<Number> array25 = new GenericArray<>(4);
//        GenericArray<Number> array26 = new GenericArray<>(4);
//        GenericArray<Number> array27 = new GenericArray<>(4);
//        GenericArray<Number> array28 = new GenericArray<>(4);
//        GenericArray<Number> array29 = new GenericArray<>(4);
//        GenericArray<Number> array30 = new GenericArray<>(4);
//        GenericArray<Number> array31 = new GenericArray<>(4);
//        GenericArray<Number> array32 = new GenericArray<>(4);
//        GenericArray<Number> array33 = new GenericArray<>(4);
//        GenericArray<Number> array34 = new GenericArray<>(4);
//        GenericArray<Number> array35 = new GenericArray<>(4);
//
//
//        GenericArray<Number> arrayAsc = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc1 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc2 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc3 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc4 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc5 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc6 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc7 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc8 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc9 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc10 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc11 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc12 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc13 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc14 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc15 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc16 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc17 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc18 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc19 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc20 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc21 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc22 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc23 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc24 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc25 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc26 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc27 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc28 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc29 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc30 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc31 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc32 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc33 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc34 = new GenericArray<>(4);
//        GenericArray<Number> arrayAsc35 = new GenericArray<>(4);
//
//
//        array.setArray(new Integer[]{3, 5, 9, 12});
//        array1.setArray(new Integer[]{5, 3});
//        array2.setArray(new Integer[]{12, 9, 5, 3});
//        array3.setArray(new Integer[]{3, 3, 3});
//        array4.setArray(new Integer[]{0, 0, 0, 0});
//        array5.setArray(new Integer[]{21, 19, 20, -7, 23});
//        array6.setArray(new Integer[]{0});
//        array7.setArray(new Integer[]{3, 5});
//        array8.setArray(new Integer[]{2, 2});
//        array9.setArray(new Double[]{3.0, 5.0, 9.0, 12.0});
//        array10.setArray(new Double[]{5.0, 3.0});
//        array11.setArray(new Double[]{12.0, 9.0, 5.0, 3.0});
//        array12.setArray(new Double[]{3.0, 3.0, 3.0});
//        array13.setArray(new Double[]{0.0, 0.0, 0.0, 0.0});
//        array14.setArray(new Double[]{21.0, 19.0, 20.0, -7.0, 23.0});
//        array15.setArray(new Double[]{0.0});
//        array16.setArray(new Double[]{3.0, 5.0});
//        array17.setArray(new Double[]{2.0, 2.0});
//        array18.setArray(new Float[]{3.0f, 5.0f, 9.0f, 12.0f});
//        array19.setArray(new Float[]{5.0f, 3.0f});
//        array20.setArray(new Float[]{12.0f, 9.0f, 5.0f, 3.0f});
//        array21.setArray(new Float[]{3.0f, 3.0f, 3.0f});
//        array22.setArray(new Float[]{0.0f, 0.0f, 0.0f, 0.0f});
//        array23.setArray(new Float[]{21.0f, 19.0f, 20.0f, -7.0f, 23.0f});
//        array24.setArray(new Float[]{0.0f});
//        array25.setArray(new Float[]{3.0f, 5.0f});
//        array26.setArray(new Float[]{2.0f, 2.0f});
//        array27.setArray(new Long[]{3l, 5l, 9l, 12l});
//        array28.setArray(new Long[]{5l, 3l});
//        array29.setArray(new Long[]{12l, 9l, 5l, 3l});
//        array30.setArray(new Long[]{3l, 3l, 3l});
//        array31.setArray(new Long[]{0l, 0l, 0l, 0l});
//        array32.setArray(new Long[]{21l, 19l, 20l, -7l, 23l});
//        array33.setArray(new Long[]{0l});
//        array34.setArray(new Long[]{3l, 5l});
//        array35.setArray(new Long[]{2l, 2l});
//
//        arrayAsc.setArray(new Integer[]{3, 5, 9, 12});
//        arrayAsc1.setArray(new Integer[]{3, 5});
//        arrayAsc2.setArray(new Integer[]{3, 5, 9, 12});
//        arrayAsc3.setArray(new Integer[]{3, 3, 3});
//        arrayAsc4.setArray(new Integer[]{0, 0, 0, 0});
//        arrayAsc5.setArray(new Integer[]{-7, 19, 20, 21, 23});
//        arrayAsc6.setArray(new Integer[]{0});
//        arrayAsc7.setArray(new Integer[]{3, 5});
//        arrayAsc8.setArray(new Integer[]{2, 2});
//        arrayAsc9.setArray(new Double[]{3.0, 5.0, 9.0, 12.0});
//        arrayAsc10.setArray(new Double[]{3.0, 5.0});
//        arrayAsc11.setArray(new Double[]{3.0, 5.0, 9.0, 12.0});
//        arrayAsc12.setArray(new Double[]{3.0, 3.0, 3.0});
//        arrayAsc13.setArray(new Double[]{0.0, 0.0, 0.0, 0.0});
//        arrayAsc14.setArray(new Double[]{-7.0, 19.0, 20.0, 21.0, 23.0});
//        arrayAsc15.setArray(new Double[]{0.0});
//        arrayAsc16.setArray(new Double[]{3.0, 5.0});
//        arrayAsc17.setArray(new Double[]{2.0, 2.0});
//        arrayAsc18.setArray(new Float[]{3.0f, 5.0f, 9.0f, 12.0f});
//        arrayAsc19.setArray(new Float[]{3.0f, 5.0f});
//        arrayAsc20.setArray(new Float[]{3.0f, 5.0f, 9.0f, 12.0f});
//        arrayAsc21.setArray(new Float[]{3.0f, 3.0f, 3.0f});
//        arrayAsc22.setArray(new Float[]{0.0f, 0.0f, 0.0f, 0.0f});
//        arrayAsc23.setArray(new Float[]{-7.0f, 19.0f, 20.0f, 21.0f, 23.0f});
//        arrayAsc24.setArray(new Float[]{0.0f});
//        arrayAsc25.setArray(new Float[]{3.0f, 5.0f});
//        arrayAsc26.setArray(new Float[]{2.0f, 2.0f});
//        arrayAsc27.setArray(new Long[]{3L, 5L, 9L, 12L});
//        arrayAsc28.setArray(new Long[]{3l, 5l});
//        arrayAsc29.setArray(new Long[]{3l, 5l, 9l, 12l});
//        arrayAsc30.setArray(new Long[]{3l, 3l, 3l});
//        arrayAsc31.setArray(new Long[]{0l, 0l, 0l, 0l});
//        arrayAsc32.setArray(new Long[]{-7l, 19l, 20l, 21l, 23l});
//        arrayAsc33.setArray(new Long[]{0l});
//        arrayAsc34.setArray(new Long[]{3l, 5l});
//        arrayAsc35.setArray(new Long[]{2l, 2l});
//
//        return new Object[][]{
//                {array, arrayAsc},
//                {array1, arrayAsc1},
//                {array2, arrayAsc2},
//                {array3, arrayAsc3},
//                {array4, arrayAsc4},
//                {array5, arrayAsc5},
//                {array6, arrayAsc6},
//                {array7, arrayAsc7},
//                {array8, arrayAsc8},
//                {array9, arrayAsc9},
//                {array10, arrayAsc10},
//                {array11, arrayAsc11},
//                {array12, arrayAsc12},
//                {array13, arrayAsc13},
//                {array14, arrayAsc14},
//                {array15, arrayAsc15},
//                {array16, arrayAsc16},
//                {array17, arrayAsc17},
//                {array18, arrayAsc18},
//                {array19, arrayAsc19},
//                {array20, arrayAsc20},
//                {array21, arrayAsc21},
//                {array22, arrayAsc22},
//                {array23, arrayAsc23},
//                {array24, arrayAsc24},
//                {array25, arrayAsc25},
//                {array26, arrayAsc26},
//                {array27, arrayAsc27},
//                {array28, arrayAsc28},
//                {array29, arrayAsc29},
//                {array30, arrayAsc30},
//                {array31, arrayAsc31},
//                {array32, arrayAsc32},
//                {array33, arrayAsc33},
//                {array34, arrayAsc34},
//                {array35, arrayAsc35}};
//    }
//
//    @DataProvider(name = "dataForTestDescSort")
//    public static Object[][] createDataForDescSort() {
//        Array array = new Array();
//        Array array1 = new Array();
//        Array array2 = new Array();
//        Array array3 = new Array();
//        Array array4 = new Array();
//        Array array5 = new Array();
//        Array array6 = new Array();
//        Array array7 = new Array();
//        Array array8 = new Array();
//        Array array9 = new Array();
//        Array array10 = new Array();
//        Array array11 = new Array();
//        Array array12 = new Array();
//        Array array13 = new Array();
//        Array array14 = new Array();
//        Array array15 = new Array();
//        Array array16 = new Array();
//        Array array17 = new Array();
//        Array array18 = new Array();
//        Array array19 = new Array();
//        Array array20 = new Array();
//        Array array21 = new Array();
//        Array array22 = new Array();
//        Array array23 = new Array();
//        Array array24 = new Array();
//        Array array25 = new Array();
//        Array array26 = new Array();
//        Array array27 = new Array();
//        Array array28 = new Array();
//        Array array29 = new Array();
//        Array array30 = new Array();
//        Array array31 = new Array();
//        Array array32 = new Array();
//        Array array33 = new Array();
//        Array array34 = new Array();
//        Array array35 = new Array();
//
//        Array arrayDesc = new Array();
//        Array arrayDesc1 = new Array();
//        Array arrayDesc2 = new Array();
//        Array arrayDesc3 = new Array();
//        Array arrayDesc4 = new Array();
//        Array arrayDesc5 = new Array();
//        Array arrayDesc6 = new Array();
//        Array arrayDesc7 = new Array();
//        Array arrayDesc8 = new Array();
//        Array arrayDesc9 = new Array();
//        Array arrayDesc10 = new Array();
//        Array arrayDesc11 = new Array();
//        Array arrayDesc12 = new Array();
//        Array arrayDesc13 = new Array();
//        Array arrayDesc14 = new Array();
//        Array arrayDesc15 = new Array();
//        Array arrayDesc16 = new Array();
//        Array arrayDesc17 = new Array();
//        Array arrayDesc18 = new Array();
//        Array arrayDesc19 = new Array();
//        Array arrayDesc20 = new Array();
//        Array arrayDesc21 = new Array();
//        Array arrayDesc22 = new Array();
//        Array arrayDesc23 = new Array();
//        Array arrayDesc24 = new Array();
//        Array arrayDesc25 = new Array();
//        Array arrayDesc26 = new Array();
//        Array arrayDesc27 = new Array();
//        Array arrayDesc28 = new Array();
//        Array arrayDesc29 = new Array();
//        Array arrayDesc30 = new Array();
//        Array arrayDesc31 = new Array();
//        Array arrayDesc32 = new Array();
//        Array arrayDesc33 = new Array();
//        Array arrayDesc34 = new Array();
//        Array arrayDesc35 = new Array();
//
//        array.setArray(new Integer[]{3, 5, 9, 12});
//        array1.setArray(new Integer[]{5, 3});
//        array2.setArray(new Integer[]{12, 9, 5, 3});
//        array3.setArray(new Integer[]{3, 3, 3});
//        array4.setArray(new Integer[]{0, 0, 0, 0});
//        array5.setArray(new Integer[]{21, 19, 20, -7, 23});
//        array6.setArray(new Integer[]{0});
//        array7.setArray(new Integer[]{3, 5});
//        array8.setArray(new Integer[]{2, 2});
//        array9.setArray(new Double[]{3.0, 5.0, 9.0, 12.0});
//        array10.setArray(new Double[]{5.0, 3.0});
//        array11.setArray(new Double[]{12.0, 9.0, 5.0, 3.0});
//        array12.setArray(new Double[]{3.0, 3.0, 3.0});
//        array13.setArray(new Double[]{0.0, 0.0, 0.0, 0.0});
//        array14.setArray(new Double[]{21.0, 19.0, 20.0, -7.0, 23.0});
//        array15.setArray(new Double[]{0.0});
//        array16.setArray(new Double[]{3.0, 5.0});
//        array17.setArray(new Double[]{2.0, 2.0});
//        array18.setArray(new Float[]{3.0f, 5.0f, 9.0f, 12.0f});
//        array19.setArray(new Float[]{5.0f, 3.0f});
//        array20.setArray(new Float[]{12.0f, 9.0f, 5.0f, 3.0f});
//        array21.setArray(new Float[]{3.0f, 3.0f, 3.0f});
//        array22.setArray(new Float[]{0.0f, 0.0f, 0.0f, 0.0f});
//        array23.setArray(new Float[]{21.0f, 19.0f, 20.0f, -7.0f, 23.0f});
//        array24.setArray(new Float[]{0.0f});
//        array25.setArray(new Float[]{3.0f, 5.0f});
//        array26.setArray(new Float[]{2.0f, 2.0f});
//        array27.setArray(new Long[]{3l, 5l, 9l, 12l});
//        array28.setArray(new Long[]{5l, 3l});
//        array29.setArray(new Long[]{12l, 9l, 5l, 3l});
//        array30.setArray(new Long[]{3l, 3l, 3l});
//        array31.setArray(new Long[]{0l, 0l, 0l, 0l});
//        array32.setArray(new Long[]{21l, 19l, 20l, -7l, 23l});
//        array33.setArray(new Long[]{0l});
//        array34.setArray(new Long[]{3l, 5l});
//        array35.setArray(new Long[]{2l, 2l});
//
//        arrayDesc.setArray(new Integer[]{12, 9, 5, 3});
//        arrayDesc1.setArray(new Integer[]{5, 3});
//        arrayDesc2.setArray(new Integer[]{12, 9, 5, 3});
//        arrayDesc3.setArray(new Integer[]{3, 3, 3});
//        arrayDesc4.setArray(new Integer[]{0, 0, 0, 0});
//        arrayDesc5.setArray(new Integer[]{23, 21, 20, 19, -7});
//        arrayDesc6.setArray(new Integer[]{0});
//        arrayDesc7.setArray(new Integer[]{5, 3});
//        arrayDesc8.setArray(new Integer[]{2, 2});
//        arrayDesc9.setArray(new Double[]{12.0, 9.0, 5.0, 3.0});
//        arrayDesc10.setArray(new Double[]{5.0, 3.0});
//        arrayDesc11.setArray(new Double[]{12.0, 9.0, 5.0, 3.0});
//        arrayDesc12.setArray(new Double[]{3.0, 3.0, 3.0});
//        arrayDesc13.setArray(new Double[]{0.0, 0.0, 0.0, 0.0});
//        arrayDesc14.setArray(new Double[]{23.0, 21.0, 20.0, 19.0, -7.0});
//        arrayDesc15.setArray(new Double[]{0.0});
//        arrayDesc16.setArray(new Double[]{5.0, 3.0});
//        arrayDesc17.setArray(new Double[]{2.0, 2.0});
//        arrayDesc18.setArray(new Float[]{12.0f, 9.0f, 5.0f, 3.0f});
//        arrayDesc19.setArray(new Float[]{5.0f, 3.0f});
//        arrayDesc20.setArray(new Float[]{12.0f, 9.0f, 5.0f, 3.0f});
//        arrayDesc21.setArray(new Float[]{3.0f, 3.0f, 3.0f});
//        arrayDesc22.setArray(new Float[]{0.0f, 0.0f, 0.0f, 0.0f});
//        arrayDesc23.setArray(new Float[]{23.0f, 21.0f, 20.0f, 19.0f, -7.0f});
//        arrayDesc24.setArray(new Float[]{0.0f});
//        arrayDesc25.setArray(new Float[]{5.0f, 3.0f});
//        arrayDesc26.setArray(new Float[]{2.0f, 2.0f});
//        arrayDesc27.setArray(new Long[]{12l, 9l, 5l, 3l});
//        arrayDesc28.setArray(new Long[]{5l, 3l});
//        arrayDesc29.setArray(new Long[]{12l, 9l, 5l, 3l});
//        arrayDesc30.setArray(new Long[]{3l, 3l, 3l});
//        arrayDesc31.setArray(new Long[]{0l, 0l, 0l, 0l});
//        arrayDesc32.setArray(new Long[]{23l, 21l, 20l, 19l, -7l});
//        arrayDesc33.setArray(new Long[]{0l});
//        arrayDesc34.setArray(new Long[]{5l, 3l});
//        arrayDesc35.setArray(new Long[]{2l, 2l});
//
//        return new Object[][]{
//                {array, arrayDesc},
//                {array1, arrayDesc1},
//                {array2, arrayDesc2},
//                {array3, arrayDesc3},
//                {array4, arrayDesc4},
//                {array5, arrayDesc5},
//                {array6, arrayDesc6},
//                {array7, arrayDesc7},
//                {array8, arrayDesc8},
//                {array9, arrayDesc9},
//                {array10, arrayDesc10},
//                {array11, arrayDesc11},
//                {array12, arrayDesc12},
//                {array13, arrayDesc13},
//                {array14, arrayDesc14},
//                {array15, arrayDesc15},
//                {array16, arrayDesc16},
//                {array17, arrayDesc17},
//                {array18, arrayDesc18},
//                {array19, arrayDesc19},
//                {array20, arrayDesc20},
//                {array21, arrayDesc21},
//                {array22, arrayDesc22},
//                {array23, arrayDesc23},
//                {array24, arrayDesc24},
//                {array25, arrayDesc25},
//                {array26, arrayDesc26},
//                {array27, arrayDesc27},
//                {array28, arrayDesc28},
//                {array29, arrayDesc29},
//                {array30, arrayDesc30},
//                {array31, arrayDesc31},
//                {array32, arrayDesc32},
//                {array33, arrayDesc33},
//                {array34, arrayDesc34},
//                {array35, arrayDesc35}};
//    }
//}
