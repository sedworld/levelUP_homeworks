package com.Victor.Car;

/**
 * Created by Victor on 01.10.2016.
 * Создать производный класс Lorry (грузовик), характеризуемый также
 * грузоподъемностью кузова. Определить для него функции переназначения марки и изменения грузоподъемности.
 */
public class Lorry extends Car {
    private String maxWeight;

    public Lorry(String tm, int wght, int pwr, String maxWeight) {
        super(tm, wght, pwr);
        this.maxWeight = maxWeight;
    }

    @Override
    public void setTradeMark(String tradeMark) {
        super.setTradeMark(tradeMark);
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }
}
