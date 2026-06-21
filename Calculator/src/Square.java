public class Square extends Rectangle{
    private double side;
    public Square (double side, String color){
        super(side, side, color);
        this.side = side;

    }

    public double calculateArea(){
        return side*side;

    }

    public double calculatePerimeter(){
        return 4*side;

    }

    @Override
    public String toString(){
        return String.format("Square Side: %.2f, Color %s", side, getColor());
    }
    }

void main(){
    double inputSide = Double.parseDouble(IO.readln("Enter the side: "));
    double inputWidth = Double.parseDouble(IO.readln("Enter the width: "));
    double inputHeight = Double.parseDouble(IO.readln("Enter the height: "));
    String inputColor = IO.readln("Enter the color: ");
    String inputColor2 = IO.readln("Enter the color: ");
    Square shape = new Square(inputSide, inputColor);
    Rectangle rectangle = new Rectangle(inputWidth,inputHeight,inputColor2);
    IO.println("Square Area: " + shape.calculateArea());
    IO.println("Square Perimeter " + shape.calculatePerimeter());
    IO.println("Square Color: " + shape.getColor());
    IO.println("Rectangle Area: " + rectangle.calculateArea());
    IO.println("Rectangle Perimeter " + rectangle.calculatePerimeter());
    IO.println("Rectangle Color: " + rectangle.getColor());
    IO.println(shape.toString());
    IO.println(rectangle.toString());
}

