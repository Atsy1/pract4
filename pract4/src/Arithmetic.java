public class Arithmetic {

    private int num1;
    private int num2;

    public Arithmetic(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int sum(){
        return num1 + num2;
    }

    public int proizvedenie(){
        return num1 * num2;
    }

    public int max(){
        if(num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }

    public int min(){
        if(num1 < num2){
            return num1;
        }else {
            return num2;
        }
    }







}
