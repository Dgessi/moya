package Homework;

public class Homework1 {
    //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
    public static void main(String[] args) {
        int r = 2;
        int a = 1;

        if ((Math.PI*r*r) > Math.pow(a,2)){
            System.out.println("Площадь круга больше");
        }
        else {
            System.out.println("Площадь квадрата больше");
        }
    }
}
