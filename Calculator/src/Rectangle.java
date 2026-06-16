public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Default color");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (width + height);

    }

    @Override
    public String toString(){
        return super.toString() + String.format(", Width: %.2f, Height: %.2f", width, height);

    }


}