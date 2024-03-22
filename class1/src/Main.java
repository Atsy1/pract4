
public class Main {
    public static void main(String[] args) {

        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко",80,1,214);
        vasyaBasket.add("Хлеб", 40,1,100);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Лопата", 280,1,2000);
        petyaBasket.add("Бочка", 2900,1,7000);

        Basket mashaBasket = new Basket("Стол",10000,5500);


        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина Пети:");
        mashaBasket.print("Корзина Маши:");








    }
}