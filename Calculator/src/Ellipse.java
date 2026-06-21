public class Ellipse extends Shape implements Measurable2D{
    private double semiMajor;
    private double semiMinor;
    public Ellipse(double semiMajor, double semiMinor, String color) {
        super(color); //alternative to this.color and calls Shape
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }

    public double calculateArea(){
        return Math.PI*semiMajor*semiMinor;
    }

    public double calculatePerimeter(){
        double p;
        // [UNDERSTAND] Declared the 'h' value as the formula shown
        double h = ((semiMajor-semiMinor)*(semiMajor-semiMinor))/((semiMajor+semiMinor)*(semiMajor+semiMinor));
        // [UNDERSTAND] Set the formula for the perimeter of the ellipse
        p = Math.PI*(semiMajor + semiMinor)*(1.0 + (3.0 * h)/(10.0+Math.sqrt(4.0-3.0*h)));
        // [UNDERSTAND] Returned a double value
        return p;
    }

    @Override
    public String toString(){
        // call parent's toString() and append additional info
        return super.toString() + String.format("Ellipse SemiMajorAxis: %.2f, SemiMinorAxis: %.2f", semiMajor, semiMinor);
    }
}

//void main(){
//    double inputSemiMajor = Double.parseDouble(IO.readln("Enter the Semi Major: "));
//    double inputSemiMinor = Double.parseDouble(IO.readln("Enter the Semi Minor: "));
//    String inputColor = IO.readln("Enter the color: ");
//    Ellipse shape = new Ellipse(inputSemiMajor, inputSemiMinor, inputColor);
//    IO.println("Surface Area: " + shape.calculateArea());
//    IO.println("Volume: " + shape.calculatePerimeter());
//    IO.println("Color: " + shape.getColor());
//    IO.println(shape.toString());
//}







