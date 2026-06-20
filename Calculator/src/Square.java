public class Square extends Rectangle{
    private double side;
    public Square (double side){
        super(side, side);
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
        return super.toString() + String.format(", Square Side: %.2f", side);

    }
    }


