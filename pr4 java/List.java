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
    private final ArrayList<Room> fileOfnumbers;
    public List(ArrayList<Room> ListOfnumbers){

        this.fileOfnumbers = ListOfnumbers;
    }

    public void addnumber(Room rooms){
        fileOfnumbers.add(rooms);
    }
    public void print(){
        for(int i=0; i<fileOfnumbers.size();i++){
            System.out.println(i+1 + ") комната ");
            System.out.println(fileOfnumbers.get(i).tostring());
            System.out.println();
        }
    }







}
