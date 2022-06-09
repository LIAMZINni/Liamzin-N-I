/* Гостиница. Создать родительский класс «Комната»
(индефикатор ,нормер,количество человек,цена) и дочерние классы:
 «Стандартаная комната» ;
 «Комната полулюкс» ;
 «Комната люкс» (мин срок сдачи,мах срок сдачи).
Реализовать класс для хранения списка номеров с методом добавления нового
номера и методом печати списка номеров. */
package hotel;
public class Room {
     int id;
     int number;
     int numberofpeople;
     int price;
    public Room(int id,int number,int numberofpeople,int price){
        this.id = id;
        this.number=number;
        this.numberofpeople= numberofpeople;
        this.price = price;

    }
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getcodenumber() {
        return number;
    }

    public void setcodenumber(int codeNumbers) {
        this.number = codeNumbers;
    }

    public int getnumberPeople() {
        return numberofpeople;
    }

    public void setnumberPeople(int numberPeople) {
        this.numberofpeople = numberPeople;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price) {
        this.price = price;
    }
    public String tostring(){
        return "Идентификатор " + id +
                "\n Код номера- " + number +
                "\n Количество человек - " + numberofpeople +

                "\n Цена - " + price +"\n";


    }



}