package com.Victor.Box;

/**
 * Created by Victor on 26.09.2016.
 * + берем код с прошлого занятия.  Пронаследоваться от Box и сделать BigBox. Пронаследоваться от Cat классом FatCat.
 *  Сделать так чтобы объекты типа FatCat могли помещаться в большую коробку, а обычные коты в любую.
 *
 */

public class Box {

    //public
    //protected
    //private
    //

    public Box() {
        width = 7;
        height = 8;
    }

    public Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    public final int width;
    public final int height;
    private Cat cat =null;




    public void setBoxOpen(){
        System.out.println("Box is open");
    }

    private int calculateVolumeBox(){
        int result = width * width * height;
        return result;
    }
    public void showInfo(){
        System.out.println("volume is = " + calculateVolumeBox());
    }

    public void setCat(Cat cat) {
        this.cat = cat;
        cat.meow();
        cat.getAge();
        System.out.println("setCat with age: " + cat.getAge());
    }


//    public int getWidth() {
//        return width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
}