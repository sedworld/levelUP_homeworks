package com.Victor.Car;

/**
 * Created by Victor on 01.10.2016.
 * 2) Создать базовый класс Саг, характеризуемый торговой маркой (строка), весом, мощностью. Определить методы
 *      переназначения и изменения мощности.
 */
public class Car {
    private  String tradeMark;
    private int weight;
    private  int power;

    public Car(String tm, int wght, int pwr) {
        tradeMark = tm;
        weight = wght;
        power = pwr;
    }

    //изменение мощности
    public void setPower(int power) {
        this.power = power;
    }

    //назначене этой можности другому объекту
    public void goPowerTo (Car c){
        c.power = this.power;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }
}
