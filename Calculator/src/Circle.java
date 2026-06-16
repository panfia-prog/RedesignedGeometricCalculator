public class Circle extends Shape{
    private double radius;
    public Circle(double radius, String color) {
        super(color); //alternative to this.color and calls Shape and must ALWAYS be FIRST
        this.radius = radius;
    }


    @Override
    public double calculateArea(){
        return Math.PI*(radius * radius);
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

    // super keyword can also be used to call overridden method from parent class:
    @Override
    public String toString(){
        // call parent's toString() and append additional info
        return super.toString() + String.format("Circle Radius: %.2f", radius);
    }
}



