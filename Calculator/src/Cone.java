public class Cone extends Shape implements Measurable3D{
    private double radius;
    private double height;
    public Cone(double radius, double height,  String color) {
        super(color); //alternative to this.color and calls Shape
        this.radius = radius;
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return Math.PI * radius * ( radius + Math.sqrt((height * height) + (radius * radius)));
    }

    public double calculateVolume(){
        return Math.PI * radius * radius * (height/3);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Cone Radius: %.2f, Height: %.2f", radius, height);
    }
}

//void main(){
//    double inputRadius = Double.parseDouble(IO.readln("Enter the radius: "));
//    double inputHeight = Double.parseDouble(IO.readln("Enter the height: "));
//    String inputColor = IO.readln("Enter the color: ");
//    Cone cone = new Cone(inputRadius,  inputHeight, inputColor);
//    IO.println("Surface Area: " + cone.calculateSurfaceArea());
//    IO.println("Volume: " + cone.calculateVolume());
//    IO.println("Color: " + cone.getColor());
//    IO.println(cone.toString());
//}
