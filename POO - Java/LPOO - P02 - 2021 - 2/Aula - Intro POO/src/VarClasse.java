public class VarClasse {
    static int count = 0;
    void increment(){
        count++;
    }

    public static void main(String[] args) {
        VarClasse obj1 = new VarClasse();
        VarClasse obj2 = new VarClasse();

        obj1.increment();
        obj2.increment();

        System.out.println("Obj1: count " + obj1.count);
        System.out.println("Obj2: count " + obj2.count);
        System.out.println("Obj: count " + VarClasse.count);
    }
}
