package com.atatarko;

public class Main {
    /*  task1 -
    1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
    Есть 4 типа юнитов: башня, забор, содат и танк.
    Забор ничего не делает и может быть разрушен
    Башня ничего не делает и беcсмертна
    Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
    Танк умеет то же что и солдат, плюс еще у него есть метод reload()
    Создать классы которые соотвествует каждому юниту и использовать extends если это целесообразно.
    Может быть больше классов чем перечилено в задаче если нужно.
    Создать список в котором есть юниты всех типов.
         task2 -
    Задана строка из английских слов через пробел.
    Написать метод который возвращает те же слова в обратном порядке.
    При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.
    */

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
    }

    private static void task1() {
        GameBoard gb = new GameBoard();
        gb.createUnits();
        gb.printUnitList();
        gb.checkUnitTasks();
    }

    private static void task2() {
        String myStr = "Mum is washes the dishes now";
        System.out.println(myStr + " <--> " + reverseString(myStr));
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        String words[] = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            char c = words[i].charAt(0);
            int index = sb.length();
            sb.append(words[i] + " ");
            sb.setCharAt(index, Character.toUpperCase(c));
        }

        return sb.toString().trim();
    }
}