//public class Cuboid extends Shape implements Measurable3D{
//    private double length;
//    private double width;
//    private double height;
//    public Cuboid(double length, double width,  double height, String color) {
//        super(color); //alternative to this.color and calls Shape
//        this.length = length;
//        this.height = height;
//    }
//
//    public double calculateSurfaceArea(){
//        return Math.PI * radius * ( radius + Math.sqrt((height * height) + (radius * radius)));
//    }
//
//    public double calculateVolume(){
//        return Math.PI * radius * radius * (height/3);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + String.format("Cuboid Radius: %.2f, Height: %.2f", radius, height);
//    }
//}
