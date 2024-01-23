interface E{
    void edit();
}
interface A{
    void show();
    void read();
}
interface B extends A{
    void math();
}

class myclass implements B,E{

    @Override
    public void math() {
        System.out.println("This is method show");
    }

    @Override
    public void show() {
        System.out.println("This is method show");
    }

    @Override
    public void read() {
        System.out.println("This is method read");
    }

    @Override
    public void edit() {
        System.out.println("This is edit method");
    }
    
}
public class Ifexted {
    public static void main(String[] args) {
        // TODO code application logic here
        myclass ex= new myclass();
        ex.math();
        ex.read();
        ex.show();
        ex.edit();
    }
    
}
