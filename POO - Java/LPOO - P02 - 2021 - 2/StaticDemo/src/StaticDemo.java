public class StaticDemo {
    static int count = 0;
    void increment(){
        count++;
    }
    public static void main(String args[]){
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.increment();
        obj2.increment();

        System.out.println("Obj1: count "+ obj1.count);
        System.out.println("Obj2: count "+ obj2.count);
        System.out.println("Obj: count "+ StaticDemo.count);
    }
}
