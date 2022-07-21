package Lesson;

public class Recurcion {
    public static void main(String[] args) {
        String phrase = recFunction("Word");
        System.out.print(phrase);
    }

    public static String recFunction(String word){
        if (word == "Word"){
            recFunction("Hello ");
        }
        return word;
    }
}
