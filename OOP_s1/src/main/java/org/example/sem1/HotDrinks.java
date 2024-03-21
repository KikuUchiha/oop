package org.example.sem1;

import java.math.BigDecimal;

public class HotDrinks extends Drinkables {
    private int temp;

    //Перегруженный конструктор класса горячих напитков
 
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    // Получение температуры напитка

    public int getTemp() {
        return temp;
    }

    //Переопределенный метод

    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp + "°";
    }
}
