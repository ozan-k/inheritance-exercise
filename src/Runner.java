public class Runner{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();
        r.draw();
        c.print();
        t.print();
        t.draw();
        t.clear();
    }
}
