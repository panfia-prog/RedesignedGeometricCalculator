public class Cylinder extends Shape implements Measurable3D{
    private double radius;
    private double height;
    public Cylinder(double radius, double height, String color) {
        super(color); //alternative to this.color and calls Shape
        this.radius = radius;
        this.height = height;
    }
    public double calculateSurfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double calculateVolume(){
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Cylinder Radius: %.2f, Height: %.2f", radius, height);
    }
}
