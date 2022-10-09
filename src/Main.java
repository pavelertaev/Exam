import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача на экзамен");
        //Дан массив пар названий книг и авторов , необходимо привести каждую пару в строку вида : Название книги и И.О Автора
       String [] book = new String[2];
       book[0]= "Война и мир , Л.Толстой";
       book[1]= "Евгений Онегин , А.Пушкин";
        System.out.println(Arrays.toString(new String[]{book[0]}));
        System.out.println(Arrays.toString(new String[]{book[1]}));

    }
}