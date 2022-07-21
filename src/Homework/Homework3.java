package Homework;

import java.util.Scanner;

public class Homework3 {
    //Даны три вещественных числа a, b, c.
    //Проверить:
    //1. Является ли сумма его цифр двузначным числом
    //2. Больше ли числа а сумма его цифр
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите c");
        double c = sc.nextDouble();

        if(a<b && b<c){
            System.out.println("Неравенство a < b < c выполняется");
        }
        else if (b>a && a>c){
            System.out.println("Неравенство b > a > c выполняется");
        }
        else {
            System.out.println("Ни одно неравенство не выполняется");
        }
    }
}
