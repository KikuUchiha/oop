package org.example.sem1;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс торгового автомата бутилированной воды
 */
public class VendingMachineBottle implements VendingMachine {
    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();

    //Переопределенный метод внесения продуктов в автомат

    @Override
    public void initProduct() {
    }

    /**
     * Перегруженный метод внесения бутилированной воды
     *
     * @param bottle Лист экземпляров класса бутилированной воды
     */
    public void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaterList = bottle;
    }

    //Переопределенный метод получения продуктов из автомата

    @Override
    public String getProduct() {
        return null;
    }

    //Перегруженный метод получения бутилированной воды

    public String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}
