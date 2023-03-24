
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    
        B b = new B();
        b.methodA();
        b.methodB();

        A a2 = new B();
        a2.methodA();

        A a3 = new B(); //we don't have access to methodB()
        a3.methodA();
        B b2 = (B) a3;
        b2.methodB(); //downcasting

        B b3 = (B) new A();
    }
}
