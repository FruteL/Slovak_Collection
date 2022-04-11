package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<IProfit> saleslist = new ArrayList<>();
        saleslist.add(new Order(randomListOrder(), randomCost()));
        saleslist.add(new Order(randomListOrder(), randomCost()));
        saleslist.add(new Order(randomListOrder(), randomCost()));
        saleslist.add(new Order(randomListOrder(), randomCost()));
        saleslist.add(new Order(randomListOrder(), randomCost()));
        saleslist.add(new Lunch("Business", 12));
        saleslist.add(new Lunch("Standard", 10));
        saleslist.add(new Lunch("Baby", 5));
        saleslist.add(new Lunch("BabyXL", 6));
        saleslist.add(new Lunch("Standard", 10));

        //СУММА ВСЕХ ЗАКАЗОВ
        double sum = saleslist.stream().mapToDouble(em -> em.getProfit()).sum();
        System.out.println("SUM = " + sum);

        //МИНИМАЛЬНАЯ ПРИБЫЛЬ СОСТАВИЛА
        double min = saleslist.stream().mapToDouble(em -> em.getProfit()).min().orElse(0);
        System.out.println("MIN = " + min);
        System.out.println("С продукта: " + saleslist.stream().filter(el -> el.getProfit() == min).findAny().get());

        //МАКСИМАЛЬНАЯ ПРИБЫЛЬ СОСТАВИЛА
        double max = saleslist.stream().mapToDouble(em -> em.getProfit()).max().orElse(0);
        System.out.println("MAX = " + max);
        System.out.println("С продукта: " + saleslist.stream().filter(el -> el.getProfit() == max).findAny().get());

        //СРЕДНЯЯ ПРИБЫЛЬ СОСТАВИЛА
        double avg = saleslist.stream().mapToDouble(em -> em.getProfit()).sum() / saleslist.size();
        System.out.println("AVG = " + avg);

        //ПРИБЫЛЬ С ЗАКАЗОВ И ЛАНЧЕВ (ТАК КАК ИХ ОДИНАКОВОЕ КОЛИЧЕСВТО ТО ПРОСТО СУММА, ТАК ТО НАДО НАЙТИ СРЕДНЕЕ КАЖДОГО И СРАВНИТЬ)
        double sumOrder = saleslist.stream().filter(el -> el instanceof Order).mapToDouble(el -> el.getProfit()).sum();
        double sumLunch = saleslist.stream().filter(el -> el instanceof Lunch).mapToDouble(el -> el.getProfit()).sum();
        System.out.println("Profit by Orders = " + sumOrder);
        System.out.println("Profit by Lunch = " + sumLunch);

    }


    // Ниже рандомизация данных для класса Заказы, так как мне лень было вручную создавать все списки заказов
    public static List<String> randomListOrder(){
        Random random = new Random();
        List<String> l = new ArrayList<>();
        int a;
        for (int i = 0; i < 3; i++) {
            a = random.nextInt(5);
            switch (a){
                case (0): l.add("Burger");
                break;
                case (1): l.add("french fries");
                break;
                case(2): l.add("Village potato");
                break;
                case(3): l.add("Cola");
                break;
                case(4): l.add("Pepsi");
                break;
            }
        }
        return l;
    }
    public static List<Double> randomCost(){
        Random random = new Random();
        List<Double> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(1 + (5-1) * random.nextDouble());
        }
        return l;
    }
}
