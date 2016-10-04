package com.Victor.Box;

/**
 * Created by Victor on 26.09.2016.
 * берем код с прошлого занятия.  Пронаследоваться от Box и сделать BigBox. Пронаследоваться от Cat классом FatCat.
 *  xСделать так чтобы объекты типа FatCat могли помещаться в большую коробку, а обычные коты в любую.
 *
 */
public class Cat {

    public static final String TAG = Cat.class.getSimpleName();

    public int age = 6;

    private static int countOfCats = 0;

    public Cat() {
        incrCountOfCats();
    }

    public static int getCountOfCats() {
        return countOfCats;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meowww");
    }

    private void incrCountOfCats(){
        countOfCats++;
    }



}
