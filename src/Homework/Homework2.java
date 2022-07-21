package Homework;

import java.util.Scanner;

public class Homework2 {
    //Дано двузначное число. Определить:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double unit = number%10;
        double decimal = number/10;
        System.out.println("Остаток от деления десятков на единицы - " + decimal/unit);
        System.out.println("Результат деления единиц на десятки - " + unit/decimal);
    }
}
