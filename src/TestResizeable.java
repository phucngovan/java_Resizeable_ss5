import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(5);
        for (Shape shape : shapes) {
            if(shape instanceof Resizeable){
                ((Resizeable) shape).resize(40);
                System.out.println(shape.toString());
            }
        }
    }
}
