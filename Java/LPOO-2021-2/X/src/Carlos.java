// Uma questão da prova

public class Carlos{
    public static void main(String args[]){
        Carlos x = new Carlos(10);
        Carlos x2 = new Carlos(x.returnSum());
        System.out.println(x2.returnSum());
    }

    static int N;
    int y;

    Carlos() {}
    Carlos(int nv)
    {
        N += ++nv;
    }

    public int returnSum()
    {
        return N++ + 2*y+7;
    }
}
