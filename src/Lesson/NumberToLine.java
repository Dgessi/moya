package Lesson;

public class NumberToLine {
    //���������� ����� ����� ��������� �������:
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    public static void main(String[] args) {
        print5(4);
    }

    public static void print5(int n){
        for (int i = 0; i < n; i++){ //i++ �� �� ����� i = i + 1
            System.out.println("555555");
        }
    }
}
