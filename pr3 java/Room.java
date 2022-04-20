/*создать программу для
определения класса в некоторой предметной области. Описать свойства, конструктор,
методы геттеры/сеттеры, перекрыть метод toString() для вывода полной
информации об объекте в отформатированном виде.
гостиница */
package hotel;
public class Room {
    private int id;
    private  int codeNumbers;
    private int numberPeople;
    private  String comfortType;
    private  int price;


    public Room(int id, int codeNumbers, int numberPeople, String comfortType, int price) {
        this.id = id;
        this.codeNumbers = codeNumbers;
        this.numberPeople = numberPeople;
        this.comfortType = comfortType;
        this.price = price;

    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getcodeNumbers() {
        return codeNumbers;
    }

    public void setcodeNumbers(int codeNumbers) {
        this.codeNumbers = codeNumbers;
    }

    public int getnumberPeople() {
        return numberPeople;
    }

    public void setnumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getcomfortType() {
        return comfortType;
    }

    public void setcomfortType(String comfortType) {
        this.comfortType = comfortType;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price=price;
    }
    public String tostring(){
        return "Идентификатор " + id +
                "\n Код номера- " + codeNumbers +
                "\n Количество человек - " + numberPeople +
                "\n Комфортность - " + comfortType +
                "\n Цена - " + price ;


    }


}
