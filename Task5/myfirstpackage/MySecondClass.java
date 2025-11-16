package myfirstpackage;

public class MySecondClass {
    private int a, b;

    public MySecondClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int get_a(){return a;}

    public int get_b(){return b;}

    public void set_a(int a){this.a = a;}

    public void set_b(int b){this.b = b;}
    
    public int mult(){return a * b;}
}