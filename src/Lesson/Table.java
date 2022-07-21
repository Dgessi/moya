package Lesson;

public class Table {
    //Напечатать полную таблицу сложения ввиде:
    // 1 + 1 = 2     1 + 2 = 3  ... 1 + 9 = 10
    // 2 + 1 = 3     2 + 2 = 4  ... 2 + 9 = 11
    // ...
    // 9 + 1 = 10   9 + 2 = 11  ... 9 + 9 = 18
    public static void main(String[] args) {
        for (int i = 1; i<10; i++){ //1, 2, 3, 4, 5, 6, 7, 8, 9
            for (int j = 1; j<10; j++){
                System.out.print(i+"+"+j+" ");
            }
            System.out.println();
        }
    }
}