public class Valor {
    int x;
    int y;

    Valor(int n){
        this.y = n;
    }
    int devolveSoma(){
        return  this.x + this.y;
}
public static void main(String[] args){
        int i = 12;
        Valor v = new Valor(i++);
        System.out.println(v.devolveSoma());
    }
}
