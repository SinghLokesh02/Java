class Data implements Cloneable{
    public int a;
    public int b;
    public void printData(){
        System.out.println("a: " + a + " b: " + b);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public  class Object_Cloning {
    public static void main(String[] args) {
//         Shallow Copy
//        Data d = new Data();
//        d.a = 10;
//        d.b = 20;
//
//
//        Data b = d;
//        b.a = 100;
//        b.b = 987;
//        b.printData();
//        d.printData();

//      Deep Copy
//        Data d = new Data();
//        d.a = 10;
//        d.b = 20;
//
//
//        Data b = new Data();
//        b.a = 100;
//        b.b = 987;
//        b.printData();
//        d.printData();

//        Clone
        //      Deep Copy
        Data d = new Data();
        d.a = 10;
        d.b = 20;

        try{
            Data b = (Data)d.clone();
            b.a = 100;
            b.b = 987;
            b.printData();
            d.printData();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}