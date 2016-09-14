package com.Victor;




import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        switch (helloMenu()) {
            case "1": {
                Sqvt sqvt = new Sqvt();
                System.out.println("Введите коэфициенты a, b, c квадратного уравнения");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                Double x1 = sqvt.x1(a, b, c);
                Double x2 = sqvt.x2(a, b, c);

                if (sqvt.d < 0) {
                    System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + " не имеет корней");
                } else {
                    System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + "имеет следующие корни: x1=" + Math.rint(100.0 * x1) / 100.0 + ", x2=" + Math.rint(100.0 * x2) / 100);
                    //System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + "имеет следующие корни: x1=" + x1+ ", x2=" + x2);
                }
                ifNeedHelloMenu();
                break;

            }
            case "2": {
                System.out.println("Введите первое число");
                float first = scanner.nextFloat();
                System.out.println("Введите оператор +, -, * /");
                String operator = scanner.next();
                System.out.println("Введите второе число");
                float second = scanner.nextFloat();
                System.out.println(calc(first, operator, second));
                ifNeedHelloMenu();
                break;

            }
            case "3":{
                System.out.println("1 - Цельсий - Фаренгейт\n2 - Фаренгейт - Цельсий");
                switch (scanner.next()) {
                    case "1":{
                        System.out.println("Ваедите температуру в Цельсиях");
                        System.out.println("" + tempCalc(scanner.nextFloat(), true) + "F");
                        break;
                    }
                    case "2":{
                        System.out.println("Ваедите температуру в Фаренгейтах");
                        System.out.println("" + tempCalc(scanner.nextFloat(), false) + "C");
                        break;
                    }
                    default: {
                        System.out.println("Неверный пункт меню");
                        helloMenu();
                        break;
                    }

                }
                ifNeedHelloMenu();
            }
            case "4": {
                System.out.println("Введите строку содержащую \"нам\"");
                //String strNam = scanner.nextLine();
                String key = "нам";
                StringBuilder strBld = new StringBuilder(scanner.next());
                int pos  = strBld.indexOf(key);
                if(pos == -1){
                    System.out.println("нет совпадений");
                }else{
                    strBld.replace(pos, pos+key.length(), "");
                    System.out.println("Строка без " + "\"" + key + "\"" + " имеет вид " + "\"" + strBld + "\"");
                }
                ifNeedHelloMenu();
                break;
            }

            case "5": {
                System.out.println("Введите строку содержащую \"хрю\", если \"хрю\" будет в начале строки - остальное фтопку");
                String key = "хрю";
                StringBuilder strBld = new StringBuilder(scanner.next());

                int pos  = strBld.indexOf(key);
                if(pos > 0){
                    System.out.println("хрю есть, но не в начале строки");
                }else if (pos < 0) {
                    System.out.println("совпадений нет");
                }else{
                    strBld.replace(key.length(), strBld.length(),"");
                    System.out.println("Вот что осталось от Вашей строки: " + "\"" + strBld + "\"" + ".");
                }
                ifNeedHelloMenu();
                break;
            }

            default: {
                System.out.println("Введен неверный пунк меню");
                helloMenu();
            }
        }




    }

    public static String helloMenu(){
        System.out.println("\tДомашнее задание 1 и 2.\nВедите пункт меню");
        System.out.println("1 - решение квадратного уравнения");
        System.out.println("2 - калькулятор");
        System.out.println("3 - преобразователь температуры Цельсий <=> Фаренгейт");
        System.out.println("4 - Работа со строками введенными через консоль");  //goto:19 in homework_info.txt
        System.out.println("5 - Работа со строками введенными через консоль");  //goto:22 in homework_info.txt

//TODO new points for next homework
        System.out.println("0 - выход");

        String m=scanner.next();
        if(m=="0"){
            System.out.println("Выход...");
            System.exit(0);
        }

        return m;

    }

    public static void ifNeedHelloMenu(){
        System.out.println("\tВведите Q для выхода в главное меню");
        String val = scanner.next();
        if(val=="q"|val=="Q"){
            helloMenu();
        }else{
            System.out.println("\t"+val+" это не совсем Q, но вот Вам главное меню :)\n\n");
            helloMenu();
        }

    }



    public static Float calc(float first, String operator, float second){
        Float res = null;
        switch (operator){
            case "+" :{
                res = first+second;
                break;
            }
            case "-" :{
                res = first+second;
                break;
            }
            case "*" :{
                res = first+second;
                break;
            }
            case "/" :{
                res = first+second;
                break;
            }
            default: {
                System.out.println("Введен неверный оператор вычисления");
                break;
            }


        }
      return res;
    }

    public static Float tempCalc(float temperature, boolean type){
        Float temp= null;
        if (type){
            temp = 1.8f*temperature+32; //C to F if type is 1
        }else{
            temp = (temperature-32)*0.5556f; //F to C if type is 0
        }
        return temp;
    }

    public static class Sqvt {

        public double a, b, c;
        public Double x1, x2;

        double d = b * b + 4 * a * c;

        Double x1(double d, double b, double a) {
            if(d>0) {
                return (Math.sqrt(d) - b) / (2 * a);
            }else if (d==0) {
                return (0-b)/(2*a);
            }else return null;

        }

        Double x2 (double d, double b, double a){
            if(d>0) {
                return ((0 - b) - Math.sqrt(d)) / (2 * a);
            }else if(d==0){
                return (float)(0-b)/(2*a);
            }else return null;
        }



    }



}



