public class Circle extends Shape implements Measurable2D{
    private double radius;
    public Circle(double radius, String color) {
        super(color); //alternative to this.color and calls Shape and must ALWAYS be FIRST
        this.radius = radius;
    }

    public double calculateArea(){return Math.PI*(radius * radius);}

    public double calculatePerimeter(){return 2*Math.PI*radius;}

    // super keyword can also be used to call overridden method from parent class:
    @Override
    public String toString(){
        // call parent's toString() and append additional info
        return super.toString() + String.format("Circle Radius: %.2f", radius);
    }
}

//used to check if each shape works as intended
//void main(){
//    double inputRadius = Double.parseDouble(IO.readln("Enter the radius: "));
//    String inputColor = IO.readln("Enter the color: ");
//    Circle circle = new Circle(inputRadius, inputColor);
//    IO.println("Area: " + circle.calculateArea());
//    IO.println("Perimeter " + circle.calculatePerimeter());
//    IO.println("Color: " + circle.getColor());
//    IO.println(circle.toString());
//}

