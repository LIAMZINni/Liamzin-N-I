/* Гостиница. Создать родительский класс «Комната»
(индефикатор ,нормер,количество человек,цена) и дочерние классы:
 «Стандартаная комната» ;
 «Комната полулюкс» ;
 «Комната люкс» (мин срок сдачи,мах срок сдачи).
Реализовать класс для хранения списка номеров с методом добавления нового
номера и методом печати списка номеров. */
package hotel;

public class Standart extends Room{
    public Standart(int id,int number,int numberofpeople,int price){
        super(id,number,numberofpeople,price);
    }
    public String tostring(){
        return "Идентификатор " + id +
                "\n Код номера- " + number +
                "\n Количество человек - " + numberofpeople +

                "\n Цена - " + price ;


    }

}
