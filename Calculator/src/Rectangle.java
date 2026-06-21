public class Rectangle extends Shape implements Measurable2D{
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){return 2 * (width + height);}

    @Override
    public String toString(){
        return super.toString() + String.format("Rectangle Width: %.2f, Height: %.2f", width, height);
    }

}

