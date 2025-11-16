class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.set_a(i);
                o.set_b(j);
                System.out.print(o.mult());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int a, b;

    public MySecondClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    int get_a(){return a;}

    int get_b(){return b;}

    void set_a(int a){this.a = a;}

    void set_b(int b){this.b = b;}
    
    int mult(){return a * b;}
}