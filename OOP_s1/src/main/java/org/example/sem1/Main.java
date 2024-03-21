package org.example.sem1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("    ХОЛОДНЫЕ НАПИТКИ");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(80), 0.5),
                new BottleOfWater(prod.ColdTea.toString(), new BigDecimal(70), 0.45),
                new BottleOfWater(prod.Juise.toString(), new BigDecimal(75), 0.43),
                new BottleOfWater("Aqua", new BigDecimal(70), 0.8)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Cola"));

        System.out.println("    ГОРЯЧИЕ НАПИТКИ");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(60), 0.3, 90),
                new HotDrinks("Tea", new BigDecimal(50), 0.4, 80),
                new HotDrinks("HotChoclate", new BigDecimal(55), 0.5, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(70)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Cola,
        ColdTea,
        Juise,
    }
}
