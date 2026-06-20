public class Ellipse extends Shape{
    private double semiMajor;
    private double semiMinor;
    public Ellipse(String color, double semiMajor, double semiMinor) {
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
        return super.toString() + String.format(", SemiMajorAxis: %.2f, SemiMinorAxis: %.2f", semiMajor, semiMinor);
    }
}






