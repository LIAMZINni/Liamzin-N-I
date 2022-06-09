package hotel;

/* Гостиница. Создать родительский класс «Комната»
(индефикатор ,нормер,количество человек,цена) и дочерние классы:
 «Стандартаная комната» ;
 «Комната полулюкс» ;
 «Комната люкс» (мин срок сдачи,мах срок сдачи).
Реализовать класс для хранения списка номеров с методом добавления нового
номера и методом печати списка номеров. */
public class Lucs extends Room{
    int min_arenda;
    int max_arenda;
    public Lucs(int id,int number,int numberofpeople,int price,int min_arenda,int max_arenda){
        super(id,number,numberofpeople,price);
        this.min_arenda=min_arenda;
        this.max_arenda=max_arenda;

    }
    public int getMin_arenda(){
        return min_arenda;
    }
    public void setMin_arenda(int id){
        this.min_arenda=min_arenda;
    }
    public int getMax_arenda(){
        return max_arenda;
    }
    public void setMax_arenda(int id){
        this.max_arenda=max_arenda;
    }
    public String tostring(){
        return "Идентификатор " + id +
                "\n Код номера- " + number +
                "\n Количество человек - " + numberofpeople +
                "\n Цена - " + price +
                "\n min arenda-"+min_arenda+
                "\n max arenda-"+max_arenda;


    }



}
