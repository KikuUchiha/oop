package org.example.sem1;

import java.math.BigDecimal;

public class Drinkables extends Product {
    private Double volume;

    //Переопределенный конструктор напитков
 
    public Drinkables(String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    //Получение объема напитка

    public Double getVolume() {
        return volume;
    }

    //Переопределенный метод

    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " л ";
    }

    //Задание объема напитка с проверкой на некорректное значение

    public void setVolume(Double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем напитка должен быть больше нуля!");
    }
}
