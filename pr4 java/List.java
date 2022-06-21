/* Гостиница. Создать родительский класс «Комната»
(индефикатор ,нормер,количество человек,цена) и дочерние классы:
 «Стандартаная комната» ;
 «Комната полулюкс» ;
 «Комната люкс» (мин срок сдачи,мах срок сдачи).
Реализовать класс для хранения списка номеров с методом добавления нового
номера и методом печати списка номеров. */
package hotel;
import java.util.ArrayList;
public class List  {
    private final ArrayList<Room> numbers;
    public List(ArrayList<Room> numbers){

        this.numbers = numbers;
    }

    public void addnumber(Room rooms){
        numbers.add(rooms);
    }
    public void print(){
        for(int i=0; i<numbers.size();i++){
            System.out.println(i+1 + " комната ");
            System.out.println(numbers.get(i).tostring());
            
        }
    }







}
