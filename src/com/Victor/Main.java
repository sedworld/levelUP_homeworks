package com.Victor;




import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        taskMngr(helloMenu());


    }

    public static void taskMngr(String task) {
        switch (task) {

            case "1": {
                Sqvt sqvt = new Sqvt();
                System.out.println("Введите коэфициенты a, b, c квадратного уравнения");
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                float c = scanner.nextFloat();
                Float x1 = sqvt.x1(a, b, c);
                Float x2 = sqvt.x2(a, b, c);

                if (sqvt.d < 0) {
                    System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + " не имеет корней");
                } else {
                    //System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + "имеет следующие корни: x1=" + Math.rint(100.0 * x1) / 100.0 + ", x2=" + Math.rint(100.0 * x2) / 100);
                    System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + "имеет следующие корни: x1=" + x1 + ", x2=" + x2);
                }
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

                break;

            }
            case "3": {
                System.out.println("1 - Цельсий - Фаренгейт\n2 - Фаренгейт - Цельсий");
                switch (scanner.next()) {
                    case "1": {
                        System.out.println("Ваедите температуру в Цельсиях");
                        System.out.println("" + tempCalc(scanner.nextFloat(), true) + "F");
                        break;
                    }
                    case "2": {
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
            }
            case "4": {
                System.out.println("Введите строку содержащую \"нам\"");
                //String strNam = scanner.nextLine();
                String key = "нам";
                StringBuilder strBld = new StringBuilder(scanner.next());
                int pos = strBld.indexOf(key);
                if (pos == -1) {
                    System.out.println("нет совпадений");
                } else {
                    strBld.replace(pos, pos + key.length(), "");
                    System.out.println("Строка без " + "\"" + key + "\"" + " имеет вид " + "\"" + strBld + "\"");
                }
                break;
            }

            case "5": {
                System.out.println("Введите строку содержащую \"хрю\", если \"хрю\" будет в начале строки - остальное фтопку");
                String key = "хрю";
                StringBuilder strBld = new StringBuilder(scanner.next());

                int pos = strBld.indexOf(key);
                if (pos > 0) {
                    System.out.println("хрю есть, но не в начале строки");
                } else if (pos < 0) {
                    System.out.println("совпадений нет");
                } else {
                    strBld.replace(key.length(), strBld.length(), "");
                    System.out.println("Вот что осталось от Вашей строки: " + "\"" + strBld + "\"" + ".");
                }
                break;
            }

            case "6": {
                System.out.println("Введите строку с окончанием \"па\", и я удалю 4, 5 и 6 символы абсолютно бесплатно!:)");
                System.out.println("...конечно если Вы соизволите ввести хотя-бы слово из 6 букв ;) ");
                String key = "па";
                StringBuilder strBld = new StringBuilder(scanner.next());
                int origLenInputSrt = strBld.length();
                int posKey = strBld.indexOf(key);
                int delIndex = 3;

                //its bad...
                if (origLenInputSrt >= 10) {
                    strBld.delete(3, 6);
                } else if (origLenInputSrt == 9) {
                    strBld.delete(3, 5);
                } else if (origLenInputSrt == 8) {
                    strBld.delete(3, 4);
                } else {
                    strBld.deleteCharAt(3);
                }


                System.out.println(strBld);


                break;
            }

            case "7": {
                System.out.println("Введите строку более 10 знаков для дублирования содержимого");
                StringBuilder strBld = new StringBuilder(scanner.next());
                int inputStrLen = strBld.length();
                if (inputStrLen > 10) {
                    strBld.append(strBld);
                    System.out.println(strBld);
                } else {
                    System.out.println("бооООольше. Нам нужно больше символов!!!");
                }


                break;
            }

            case "8": {
                int qestionNum = 0;
                System.out.println("Тест по пройденным лекциям");

                do {
                    qestionNum++;
                    testing(qestionNum);

                } while (qestionNum < questions.length);

                break;
            }

        }

    }

    static String questions[] = {
            "Укажите непрвильный тип переменной\n" +
                    "1. integer\t" +
                    "2. Double\t" +
                    "3. int\t" +
                    "4. char",
            "int a = 2-4*5+3/8\nПеременная \"a\" равна\n" +
                    "1. -0.875\t" +
                    "2. 12.3\t" +
                    "3. 23\t" +
                    "4. 18",
            "Каким будет значение z, если boolean z=(2)&&(5)\n" +
                    "1. TRUE\t" +
                    "2. 10\t" +
                    "3. Ошибка на этапе компиляции\t" +
                    "4. FALSE",
            "Если сделать объявление int i=11; чему будет равно значение выражения i/5?\n" +
                    "1. 2\t" +
                    "2. 2.2\t" +
                    "3. 2,2\t" +
                    "4. Ошибка компиляции",
            "Что будет на экране в результате выполнения следующего фрагмента кода?\n" +
                    "int a=3;\n" +
                    "while(3){\n" +
                    "\tif(true) break;\n" +
                    "\t\ta--;\n" +
                    "}\n" +
                    "System.out.println(a);\n" +
                    "1. 1\t" +
                    "2. 2\t" +
                    "3. 3\t" +
                    "4. Вечный цикл",



};

    static String answers[][] = {
            {"Верно", "Неверно. Double - правльный тип.", "Неверно", "Неверно"},
            {"Неверно. int - целочисленное значение", "Неверно. int - целочисленное значение", "Неверно", "Верно"},
            {"Невенро.", "Неверно. boolean может вернуть только TRUE или FALSE", "Верно", "Неверно. Аргументы могут быть только типа boolean"},
            {"Верно", "Неверно. int не может быть дробным", "Неверно. Запятая не может быть разделителем дробной части", "Неверно. Произойдет неявное преобразование к целочисленному типу. Программа выполнится"},
            {"Неверно. Цикл выпонится 1 раз. Обратите внимание на условие. В этой строке цикл завершается.", "Верно.", "Невенро. Цикл выпонится 1 раз, после чего произойдет дикремент переменной а", "Неверно. Цикл будет прерван командой break;"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"},
            {"Верно5", "Неверно51", "Неверно52", "Неверно53"}
    };

    private static void testing(int qestionNum) {
        System.out.println("Вопрос " + qestionNum +":\n"+ questions[qestionNum - 1]);
        int answer = scanner.nextInt();
        //добавить проверку ввода через regex
        switch (answer) {

            case 1:
                System.out.println(answers[qestionNum - 1][answer - 1]+"\n");
                break;
            case 2:
                System.out.println(answers[qestionNum - 1][answer - 1]+"\n");
                break;
            case 3:
                System.out.println(answers[qestionNum - 1][answer - 1]+"\n");
                break;
            case 4:
                System.out.println(answers[qestionNum - 1][answer - 1]+"\n");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }





    public static String helloMenu(){
        String m;
        System.out.println("\tДомашнее задание 1 и 2.\nВедите пункт меню");
        System.out.println("1 - решение квадратного уравнения");
        System.out.println("2 - калькулятор");
        System.out.println("3 - преобразователь температуры Цельсий <=> Фаренгейт");
        System.out.println("4 - Работа со строками введенными через консоль - замена");  //goto:19 in homework_info.txt
        System.out.println("5 - Работа со строками введенными через консоль - удаление");  //goto:22 in homework_info.txt
        System.out.println("6 - Работа со строками введенными через консоль - выборочное удаление с проверкой");  //goto:23 in homework_info.txt
        System.out.println("7 - Работа со строками введенными через консоль - добавление");  //goto:24 in homework_info.txt
        System.out.println("8 - Программа-тест по пройденному материалу");  //goto:28 in homework_info.txt


        System.out.println("0 - выход");

        m=scanner.next();
        if(m.equals("0")){
            System.out.println("Выход...");
            System.exit(0);
        }

        return m;

    }


    public static void ifNeedHelloMenu(){
        System.out.println("\tВведите Q для выхода в главное меню");
        String val = scanner.next();
        if(val.equalsIgnoreCase("q")){
            helloMenu();
        }else{

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
}
    class Sqvt {

        public float a, b, c;
        public Float x1, x2;

        float d = b * b + 4 * a * c;

        Float x1(float d, float b, float a) {
            if(d>0) {
                return ((float)(Math.sqrt((double)d) - b) / (2 * a));
            }else if (d==0) {
                return (0-b)/(2*a);
            }else return null;
        }

        Float x2 (float d, float b, float a){
            if(d>0) {
                return ((0 - b) - (float)Math.sqrt((double)d))/ (2 * a);
            }else if(d==0){
                return (0-b)/(2*a);
            }else return null;
        }



    }







