
public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(51 , 13);
        System.out.println("Сумма чисел:" + arithmetic.sum());
        System.out.println("Произведение чисел:" + arithmetic.proizvedenie());
        System.out.println("Максимальное число:" + arithmetic.max());
        System.out.println("Минимальное число:" + arithmetic.min());


    }
}