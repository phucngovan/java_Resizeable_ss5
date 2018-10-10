public class Square extends Shape implements Resizeable {
    double side;
    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        this.side = side;
    }
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + super.toString() + " "+ "area:"+getArea();
    }
    @Override
    public void resize(double percent) {
        this.setSide(this.side*percent/100);
    }
}
