package by.yahimovich.task05treads.service.comparator;

import java.util.Comparator;

public class CompareNumberObject implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        if (o1 instanceof Double && o2 instanceof Double) {
            return Double.compare(o1.doubleValue(), o2.doubleValue());
        }
        if (o1 instanceof Integer && o2 instanceof Integer) {
            return Integer.compare(o1.intValue(), o2.intValue());
        }
        if (o1 instanceof Long && o2 instanceof Long) {
            return Long.compare(o1.longValue(), o2.longValue());
        }
        return Float.compare(o1.floatValue(), o2.floatValue());
    }
}
