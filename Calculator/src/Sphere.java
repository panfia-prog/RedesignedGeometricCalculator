public class Sphere extends Shape implements Measurable3D{
    private double radius;
    public Sphere(double radius, String color) {
        super(color); //alternative to this.color and calls Shape
        this.radius = radius;
    }

    public double calculateSurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }

    public double calculateVolume(){
        return (4/3) * Math.PI * (radius * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Cylinder Radius: %.2f", radius);
    }
}

void main(){
    double inputRadius = Double.parseDouble(IO.readln("Enter the radius: "));
    String inputColor = IO.readln("Enter the color: ");
    Sphere circle = new Sphere(inputRadius, inputColor);
    IO.println("Area: " + circle.calculateSurfaceArea());
    IO.println("Perimeter " + circle.calculateVolume());
    IO.println("Color: " + circle.getColor());
    IO.println(circle.toString());
}