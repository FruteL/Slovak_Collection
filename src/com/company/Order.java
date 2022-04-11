package com.company;

import java.util.List;

public class Order implements IProfit {
    private List<String> names;
    private List<Double> costs;

    public Order(List<String> names, List<Double> costs) {
        this.names = names;
        this.costs = costs;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Double> getCosts() {
        return costs;
    }

    public void setCosts(List<Double> costs) {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "Order{" +
                "names=" + names +
                ", costs=" + costs +
                '}';
    }

    @Override
    public double getProfit() {
        return getCosts().stream().mapToDouble(em -> em.doubleValue()).sum();
    }
}
