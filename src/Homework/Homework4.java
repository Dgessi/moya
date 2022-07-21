package Homework;

import java.util.Scanner;

public class Homework4 {
    //ƒаны два числа. ≈сли квадратный корень из второго числа меньше первого числа,
    //то увеличить второе число в п€ть раз.
    //1. выполн€етс€ ли неравенство a < b < c;
    //2. выполн€етс€ ли неравенство b > a > c.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите a");
        int a = sc.nextInt();
        System.out.println("¬ведите b");
        int b = sc.nextInt();

        if (Math.sqrt(b) < a){
            b *= 5; //b = b * 5
        }

        System.out.printf("ѕервое число - %d, второе число - %d", a, b);
        System.out.println("ѕервое чивло - " + a + " второе число - " + b);
        System.out.print("ѕервое число - " + a + " второе число - " + b);
    }
}
