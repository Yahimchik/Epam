package by.yahimovich.task07.builder;

import by.yahimovich.task07.entity.SubscriptionSale;

import java.util.Set;

public abstract class BaseBuilder {

    public abstract void buildSales(String fileName);

    public abstract Set<SubscriptionSale> getSales();
}
