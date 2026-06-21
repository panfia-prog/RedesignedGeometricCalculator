public class Cuboid extends Shape implements Measurable3D{
    private double length, width, height;
    public Cuboid(double length, double width,  double height, String color) {
        super(color); //alternative to this.color and calls Shape
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    public double calculateVolume(){
        return length * width * height;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Cuboid Length: %.2f, Width: %.2f , Height: %.2f", length,width, height);
    }
}

//void main(){
//    double inputLength = Double.parseDouble(IO.readln("Enter the length: "));
//    double inputWidth = Double.parseDouble(IO.readln("Enter the width: "));
//    double inputHeight = Double.parseDouble(IO.readln("Enter the height: "));
//    String inputColor = IO.readln("Enter the color: ");
//    Cuboid cuboid = new Cuboid(inputLength,  inputWidth, inputHeight, inputColor);
//    IO.println("Surface Area: " + cuboid.calculateSurfaceArea());
//    IO.println("Volume: " + cuboid.calculateVolume());
//    IO.println("Color: " + cuboid.getColor());
//    IO.println(cuboid.toString());
//}
