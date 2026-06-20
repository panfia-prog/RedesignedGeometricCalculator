public abstract class Shape {
    // '#' in UML: protected meaning color is only accessible to those who inherit shape
    protected String color;

    //constructor of abstract class
    public Shape(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    //String returns shape color
    @Override
    public String toString(){
        return String.format("Shape color: %s ", color);
    }
}
