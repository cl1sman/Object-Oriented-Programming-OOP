public class StaticDemo2 {
    int x = 10;
    static  int count = 0;
    void increment(){
        count++;
    }
    static void decrement(){
        count-;
    }
    public static void main(String args[]){
        StaticDemo2 obj1 = new StaticDemo2();
        obj1.increment();
        StaticDemo2.increment(); //ERRO: tentando acessar um método da instância
        obj1.decrement();
        StaticDemo2.decrement();
    }
}
