package by.yahimovich.task07.builder;

import by.yahimovich.task07.entity.SubscriptionSale;

import java.util.Set;

public class Parser {
    public static Set<SubscriptionSale> createSubscriptionSale(BaseBuilder builder, String fileName) {
        builder.buildSales(fileName);
        return builder.getSales();
    }
}
