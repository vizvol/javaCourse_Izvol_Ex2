package ru.iteco;

import java.io.IOException;
import java.util.*;

public class FormattedOut {
    public static void main(String[] args) throws IOException {

        Scanner src = new Scanner(System.in);
        // 1: Строка - город, число - население, число - процент безработных
        /*System.out.print("Введите город: ");
        String city = src.next() ;
        System.out.print("Введите количество жителей: ");
        int peopleCount = src.nextInt() ;
        System.out.print("Введите процент безработных: ");
        float notWork = src.nextFloat();
        System.out.printf("Город - %s; население - %d; Процент безработных - %.1f", city, peopleCount, notWork );
        System.out.println();
*/
        // 2: Символ - секция на трибуне, число - место, число - стоимость билета
 /*  System.out.print("Введите секцию на трибуне: ");
        char section = (char)System.in.read() ;
        System.out.print("Введите номер места: ");
        int place = src.nextInt() ;
        System.out.print("Введите стоимость билета: ");
        float price = src.nextFloat();
        System.out.printf("Секция на трибуне - %s; место - %d; стоимость билета - %.2f", section, place, price );
        System.out.println();
*/
        // 3: Строка - имя, число - возраст, число - рост
 /*       System.out.print("Введите имя: ");
        String name = src.next() ;
        System.out.print("Введите возраст: ");
        byte age = src.nextByte() ;
        System.out.print("Введите рост: ");
        short rice = src.nextShort();
        System.out.printf("имя - %s; возраст - %d; рост - %d", name, age, rice );
        System.out.println();
*/
        // 4: Символы - буквенный номер машины, число - числовой номер машины [Итог: A000AA], число - вес автомобиля

        System.out.print("Введите три буквы номера авто: ");
        char sign1 = (char)System.in.read();
        char sign2 = (char)System.in.read();
        char sign3 = (char)System.in.read();
        System.out.print("Введите числовой номер авто: ");
        short number = src.nextShort ();
        System.out.print("Введите массу авто: ");
        short mass = src.nextShort();
        System.out.printf("Номер автомобиля: %s%d%s%s, масса автомобиля - %d", sign1, number, sign2, sign3, mass );
        System.out.println();

        // 5: Строка - название компании, число - годовой доход, число - доля на рынке
 /*     System.out.print("Введите наименование компании: ");
        String companyName = src.next();
        System.out.print("введите годовой доход: ");
        double profit = src.nextDouble();
        System.out.print("Введите долю на рынке: ");
        float part = src.nextFloat();
        System.out.printf("Компания: %s, Годовой доход: %.2f, Доля на рынке: %.2f", companyName, profit, part );
        System.out.println();
 */
        // 6: Символ - резус фактор, число - группа крови, число - доля людей с этой группой крови

        // 7: Строка - название универа, число - число студентов, число - доля отчисленных

        // 8: Символы - рейтинг фильма, число - копий продано, число - рейтинг

        // 9: Строка - название бренда, число - произведено товара, число - процент продаж

        // 10: Символ - категория товара, число - штрихкод, число - процент покупателей старше 30


        src.close();


    }
}
