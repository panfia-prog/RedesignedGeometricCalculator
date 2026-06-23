import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Geometry Calculator!");
        System.out.println("This program calculates the area/perimeter");
        System.out.println("and surface area/volume for 3D shapes.");

        int choice, choice2D, choice3D; // FIXED: Declared outside the loop so 'while' can see it
        String inputColor;
        double inputValue1,inputValue2,inputValue3;

        do {
            System.out.println("====================================");
            System.out.println("         GEOMETRY CALCULATOR       ");
            System.out.println("====================================");
            System.out.println("1. 2D Shapes Calculator");
            System.out.println("2. 3D Solids Calculator");;
            System.out.println("3. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt(); // FIXED: Removed 'int' keyword here

            switch (choice) {
                case 1:
                    do{
                        System.out.println("====================================");
                        System.out.println("         2D SHAPES CALCULATOR      ");
                        System.out.println("====================================");
                        System.out.println("1. Square");
                        System.out.println("2. Rectangle");
                        System.out.println("3. Circle");
                        System.out.println("4. Ellipse");
                        System.out.println("5. Return to Main Menu"); // Adjusted choices
                        System.out.println("====================================");
                        System.out.print("Enter your choice (1-6): ");
                        choice2D = scanner.nextInt();
                        switch(choice2D){
                            case 1:
                                inputValue1 = Double.parseDouble(IO.readln("Enter the side: "));
                                inputColor = IO.readln("Enter the color: ");
                                Square mySquare = new Square(inputValue1, inputColor);
                                System.out.println("Area: " + mySquare.calculateArea());
                                System.out.println("Perimeter: " + mySquare.calculatePerimeter());
                                IO.println(mySquare.toString());
                                break;
                            case 2:
                                System.out.print("Enter width of Rectangle: ");
                                inputValue1 = scanner.nextDouble();
                                System.out.print("Enter height of Rectangle: ");
                                inputValue2 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Rectangle myRect = new Rectangle(inputValue1, inputValue2, inputColor);
                                System.out.println("Area: " + myRect.calculateArea());
                                System.out.println("Perimeter: " + myRect.calculatePerimeter());
                                IO.println(myRect.toString());
                                break;
                            case 3:
                                System.out.print("Enter radius of Circle: ");
                                inputValue1 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Circle myCircle = new Circle(inputValue1, inputColor);
                                System.out.println("Area: " +myCircle.calculateArea());
                                System.out.println("Perimeter: " +myCircle.calculatePerimeter());
                                IO.println(myCircle.toString());
                                break;
                            case 4:
                                System.out.print("Enter semi-major axis: ");
                                inputValue1 = scanner.nextDouble();
                                System.out.print("Enter semi-minor axis: ");
                                inputValue2 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Ellipse myEllipse = new Ellipse(inputValue1, inputValue2, inputColor);
                                System.out.println("Area: " +myEllipse.calculateArea());
                                System.out.println("Perimeter: " +myEllipse.calculatePerimeter());
                                IO.println(myEllipse.toString());
                                break;
                            default:
                                System.out.println("Invalid selection! Please input 1-5.");

                        }
                    } while (choice2D != 5);
                    break;
                case 2:
                    do {
                        System.out.println("====================================");
                        System.out.println("        3D SOLIDS CALCULTOR        ");
                        System.out.println("====================================");
                        System.out.println("1. Cube");
                        System.out.println("2. Cuboid (Rectangular Box)");
                        System.out.println("3. Sphere");
                        System.out.println("4. Right Circular Cone");
                        System.out.println("5. Right Circular Cylinder");
                        System.out.println("6. Return to Main Menu"); // Adjusted choices
                        System.out.println("====================================");
                        System.out.print("Enter your choice (1-6): ");
                        choice3D = scanner.nextInt();
                        switch(choice3D){
                            case 1:
                                System.out.print("Enter side length: ");
                                inputValue1 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Cube myCube = new Cube(inputValue1, inputColor);
                                System.out.println("Area: " + myCube.calculateSurfaceArea());
                                System.out.println("Volume: " + myCube.calculateVolume());
                                IO.println(myCube.toString());
                                break;
                            case 2:
                                System.out.print("Enter length: ");
                                inputValue1 = scanner.nextDouble();
                                System.out.print("Enter width: ");
                                inputValue2 = scanner.nextDouble();
                                System.out.print("Enter height: ");
                                inputValue3 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Cuboid myCuboid = new Cuboid(inputValue1, inputValue2, inputValue3, inputColor);
                                System.out.println("Area: " + myCuboid.calculateSurfaceArea());
                                System.out.println("Volume: " + myCuboid.calculateVolume());
                                IO.println(myCuboid.toString());
                                break;
                            case 3:
                                inputValue1 = Double.parseDouble(IO.readln("Enter the radius: "));
                                inputColor = IO.readln("Enter the color: ");
                                Sphere mySphere = new Sphere(inputValue1, inputColor);
                                System.out.println("Area: " + mySphere.calculateSurfaceArea());
                                System.out.println("Volume: " + mySphere.calculateVolume());
                                IO.println(mySphere.toString());
                                break;
                            case 4:
                                System.out.println("RIGHT CIRCULAR CONE: ");
                                System.out.print("Enter base radius: ");
                                inputValue1 = scanner.nextDouble();
                                System.out.print("Enter height: ");
                                inputValue2 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Cone myCone = new Cone(inputValue1,inputValue2,inputColor);
                                System.out.println("Area: " + String.format("%.2f",myCone.calculateSurfaceArea()));
                                System.out.println("Volume: " + String.format("%.2f",myCone.calculateVolume()));
                                IO.println(myCone.toString());
                                break;
                            case 5:
                                System.out.println("RIGHT CIRCULAR CYLINDER: ");
                                System.out.print("Enter base radius: ");
                                inputValue1 = scanner.nextDouble();
                                System.out.print("Enter height: ");
                                inputValue2 = scanner.nextDouble();
                                inputColor = IO.readln("Enter the color: ");
                                Cylinder myCylinder = new Cylinder(inputValue1,inputValue2,inputColor);
                                System.out.println("Area: " + String.format("%.2f",myCylinder.calculateSurfaceArea()));
                                System.out.println("Volume: " + String.format("%.2f",myCylinder.calculateVolume()));
                                IO.println(myCylinder.toString());
                                break;
                            default:
                        }
                    } while (choice3D != 6);
                    break;
                case 3:
                    System.out.println("Exiting App. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection! Please input 1-6.");
                    break;
            }
            System.out.println();
        } while (choice != 3);
        scanner.close();
    }
}