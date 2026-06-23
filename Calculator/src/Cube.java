public class Cube extends Shape implements Measurable3D{
    private double side;
    public Cube(double side, String color) {
        super(color); //alternative to this.color and calls Shape
        this.side = side;
    }

    public double calculateSurfaceArea(){
        return 6*side*side;
    }

    public double calculateVolume(){
        return side*side*side;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Cuboid Side: %.2f,", side);
    }
}

//void main(){
//    double inputSide = Double.parseDouble(IO.readln("Enter the side: "));
//    String inputColor = IO.readln("Enter the color: ");
//    Cube shape = new Cube(inputSide, inputColor);
//    IO.println("Cube Surface Area: " + shape.calculateSurfaceArea());
//    IO.println("Cube Volume " + shape.calculateVolume());
//    IO.println("Cube Color: " + shape.getColor());
//    IO.println(shape.toString());
//}