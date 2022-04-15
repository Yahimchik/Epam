package by.yahimovich.task07.builder;

import by.yahimovich.task07.entity.SubscriptionSale;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseBuilder {

    private final Set<SubscriptionSale> sales;

    public BaseBuilder() {
        sales = new HashSet<>();
    }

    public abstract void buildSales(String fileName);

    public Set<SubscriptionSale> getSales() {
        return sales;
    }
}
