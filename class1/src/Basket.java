public class Basket {

    private    String items="";
    private  int totalPrice = 0;
    private int limit;
    private double totalWeight=0;

    public Basket(){
        items= "Список товаров:";
        this.limit =10000000;
    }


    public Basket(String items, int totalPrice, double totalWeight){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }







    public void add(String name, int price, int count, double weight) {
        if (contains(name)) {
            return;
        }

        if (totalPrice + count * price  >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count + "шт.-" + price +"руб" +" - " + weight + "гр";


    }


    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }



    public  boolean contains(String  name){
        return items.contains(name);
    }


    public  void print(String title){
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста");
        }
        if (totalWeight!=0){
            System.out.println("\n" + items + " - "  + totalPrice +"руб" +" - " + totalWeight + "гр");
        }
        else {
            System.out.println("\n" + items );
        }
    }
}

