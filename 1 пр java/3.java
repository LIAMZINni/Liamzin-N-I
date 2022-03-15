public class java {
    public static void main(String[] args) {
        int n = args.length;
        if (n != 2) {
            System.out.println(“Неверное количество параметров ”);
        } else {
            System.out.println(args[0] +"+"+args[1]+"="+((Integer.parseInt(args[0])+(Integer.parseInt(args[1])))));
        }
    }
}
/*Передавать в качестве параметров два целочисленных числа. Вывести на
экран как сами значения? так и их сумму (“3 + 2 = 5”). Если количество параметров
не равно 2, вывести сообщение “Неверное количество параметров”.*/
