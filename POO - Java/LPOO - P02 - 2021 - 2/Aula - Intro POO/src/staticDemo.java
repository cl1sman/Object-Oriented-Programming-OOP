public class staticDemo {
    static int count = 0;
    int index;

    staticDemo(){ // construct
        increment();
    }

    staticDemo(int i){ // para ter o indice de cada objeto
        index = i;
    }

    void increment(){
        count++;
    }
}

class countObject {
    public static void main(String[] args) {
        staticDemo obj1 = new staticDemo(); // todas as vezes que um objeto for criado, o count vai ser acrescentado
        System.out.println(staticDemo.count);
    }
}
