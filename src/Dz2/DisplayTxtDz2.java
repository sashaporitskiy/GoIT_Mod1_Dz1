package Dz2;

import java.util.Scanner;

public class DisplayTxtDz2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите город:");
        String gorod = in.nextLine();
        System.out.println("Введите возраст:");
        String vozrast = in.nextLine();
        System.out.println("Введите хобби:");
        String hoby = in.nextLine();
        System.out.println("Имя:"+name);
        System.out.println("Город:"+gorod);
        System.out.println("Возраст:"+vozrast);
        System.out.println("Хобби:"+hoby);
    }
}
