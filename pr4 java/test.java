/* Гостиница. Создать родительский класс «Комната»
(индефикатор ,нормер,количество человек,цена) и дочерние классы:
 «Стандартаная комната» ;
 «Комната полулюкс» ;
 «Комната люкс» (мин срок сдачи,мах срок сдачи).
Реализовать класс для хранения списка номеров с методом добавления нового
номера и методом печати списка номеров. */
package hotel;
import java.util.ArrayList;

public class test {
    public static void main(String[] args){


        int id,number,numberofpeople,price;
        ArrayList<Room> numbers = new ArrayList<>();
        List allnumbers = new List(numbers);
        Room cheep=new Room(1,12,2,1000);

        allnumbers.addnumber(cheep);
        Room norm=new Room(3,54,4,1500);
        allnumbers.addnumber(norm);

        Lucs premium=new Lucs(2,3,5,3000,1,15);
        allnumbers.addnumber(premium);
        allnumbers.print();






}}
