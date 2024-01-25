package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaPerimeterVolume_TSA_CSA {

    public static void main(String[] args) {
        System.out.println("---------- Area, Perimeter, Volume, TSA & CSA Calculator ----------");
    	Scanner s = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("What you want to find? ");
            System.out.println("1 ---> Area");
            System.out.println("2 ---> Perimeter");
            System.out.println("3 ---> Volume");
            System.out.println("4 ---> Total Surface Area");
            System.out.println("5 ---> Curved Surface Area");
            System.out.println("6 ---> Exit Loop");
            System.out.println();
            try {
            	int cat = s.nextInt();
                System.out.println();
                String category = "";
                if (cat == 1)
                    category = "Area";
                else if (cat == 2)
                    category = "Perimeter";
                else if (cat == 3)
                    category = "Volume";
                else if (cat == 4)
                    category = "Total Surface Area";
                else if (cat == 5)
                    category = "Curved Surface Area";
                if (cat == 1 || cat == 2 || cat == 3 || cat == 4 || cat == 5) {
                	System.out.println(category + " of what? ");
                }
                switch (cat) {
                    case 1: {
                        System.out.println("1 ---> Circle");
                        System.out.println("2 ---> Triangle");
                        System.out.println("3 ---> Rectangle");
                        System.out.println("4 ---> Isosceles Triangle");
                        System.out.println("5 ---> Parallelogram");
                        System.out.println("6 ---> Rhombus");
                        System.out.println("7 ---> Equilateral Triangle");
                        System.out.println();
                        int shape = s.nextInt();
                        switch (shape) {
                            case 1: {
                                System.out.print("radius? (in cm) ");
                                double rad = s.nextDouble();
                                double result = Math.PI * Math.pow(rad, 2);
                                System.out.println("Area of a Circle is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.print("base? (in cm) ");
                                double b = s.nextDouble();
                                System.out.print("height (in cm) ");
                                double h = s.nextDouble();
                                double result = 0.5 * b * h;
                                System.out.println("Area of a Triangle is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.print("length? (in cm) ");
                                double l = s.nextDouble();
                                System.out.print("breath? (in cm) ");
                                double b = s.nextDouble();
                                double result = l * b;
                                System.out.println("Area of a Rectangle is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            case 4: {
                                System.out.print("base (a)? ");
                                double a = s.nextDouble();
                                System.out.print("length of each equal side (b)? ");
                                double b = s.nextDouble();
                                if (a >= (2 * b)) {
                                    System.err.println("Invalid input!!! Please ensure a < 2b for a valid Isosceles Triangle.");
                                    System.out.println();
                                } else {
                                    double result = 0.25 * Math.sqrt(4 * Math.pow(b, 2) - Math.pow(a, 2)) * Math.pow(a, 2);
                                    System.out.println("Area of an Isosceles Triangle is " + result + "cm\u00B2");
                                    System.out.println();
                                }
                                break;
                            }
                            case 5: {
                                System.out.print("base? ");
                                double b = s.nextDouble();
                                System.out.print("height? ");
                                double h = s.nextDouble();
                                double result = b * h;
                                System.out.println("Area of a Parallelogram is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            case 6: {
                                System.out.print("diagonal d1? ");
                                double d1 = s.nextDouble();
                                System.out.print("diagonal d2? ");
                                double d2 = s.nextDouble();
                                double result = (d1 * d2) / 2;
                                System.out.println("Area of a Rhombus is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            case 7: {
                                System.out.print("side? ");
                                double a = s.nextDouble();
                                double result = (Math.sqrt(3) / 4) * Math.pow(a, 2);
                                System.out.println("Area of an Equilateral Triangle is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            default:
                                System.err.println("Invalid Input!!! ");
                                System.out.println();
                                break;
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("1 ---> Circle");
                        System.out.println("2 ---> Equilateral Triangle");
                        System.out.println("3 ---> Parallelogram");
                        System.out.println("4 ---> Rectangle");
                        System.out.println("5 ---> Square");
                        System.out.println("6 ---> Rhombus");
                        System.out.println();
                        int shape = s.nextInt();
                        switch (shape) {
                            case 1: {
                                System.out.print("radius? (in cm) ");
                                double rad = s.nextDouble();
                                double result = 2 * Math.PI * rad;
                                System.out.println("Perimeter of a Circle is " + result + "cm");
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.print("side? (in cm) ");
                                double a = s.nextDouble();
                                double result = 3 * a;
                                System.out.println("Perimeter of an Equilateral Triangle is " + result + "cm");
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.print("length? (in cm) ");
                                double l = s.nextDouble();
                                System.out.print("breath? (in cm) ");
                                double b = s.nextDouble();
                                double result = 2 * (l + b);
                                System.out.println("Perimeter of a Parallelogram is " + result + "cm");
                                System.out.println();
                                break;
                            }
                            case 4: {
                                System.out.print("length? (in cm) ");
                                double l = s.nextDouble();
                                System.out.print("breath? (in cm) ");
                                double b = s.nextDouble();
                                double result = 2 * (l + b);
                                System.out.println("Perimeter of a Rectangle is " + result + "cm");
                                System.out.println();
                                break;
                            }
                            case 5: {
                                System.out.print("side? ");
                                double a = s.nextDouble();
                                double result = 4 * a;
                                System.out.println("Perimeter of a Square is " + result + "cm");
                                System.out.println();
                                break;
                            }
                            case 6: {
                                System.out.print("side? ");
                                double a = s.nextDouble();
                                double result = 4 * a;
                                System.out.println("Perimeter of a Rhombus is " + result + "cm");
                                System.out.println();
                                break;
                            }
                            default:
                                System.err.println("Invalid Input!!! ");
                        }
                        break;
                    }
                    case 3: {
                        // Volume calculations
                        System.out.println("1 ---> Cone");
                        System.out.println("2 ---> Prism");
                        System.out.println("3 ---> Cylinder");
                        System.out.println("4 ---> Sphere");
                        System.out.println("5 ---> Pyramid");
                        System.out.println();
                        int shape = s.nextInt();
                        switch (shape) {
                            case 1: {
                                // Volume of Cone
                                System.out.print("Radius of the base? ");
                                double radius = s.nextDouble();
                                System.out.print("Height of the cone? ");
                                double height = s.nextDouble();
                                double result = (Math.PI * Math.pow(radius, 2) * height) / 3;
                                System.out.println("Volume of Cone is " + result + "cm\u00B3");
                                System.out.println();
                                break;
                            }
                            case 2: {
                                // Volume of Prism
                            	System.out.print("Base area of the prism? ");
                                double baseArea = s.nextDouble();
                                System.out.print("Height of the prism? ");
                                double height = s.nextDouble();
                                double result = baseArea * height;
                                System.out.println("Volume of Prism is " + result + "cm\u00B3");
                                System.out.println();
                                break;
                            }
                            case 3: {
                                // Volume of Cylinder
                            	System.out.print("Radius of the base? ");
                                double radius = s.nextDouble();
                                System.out.print("Height of the cylinder? ");
                                double height = s.nextDouble();
                                double baseArea = Math.PI * Math.pow(radius, 2);
                                double result = baseArea * height;
                                System.out.println("Volume of Cylinder is " + result + "cm\u00B3");
                                System.out.println();
                                break;
                            }
                            case 4: {
                                // Volume of Sphere
                            	System.out.print("Radius of the sphere? ");
                                double radius = s.nextDouble();
                                double result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                                System.out.println("Volume of Sphere is " + result + "cm\u00B3");
                                System.out.println();
                                break;
                            }
                            case 5: {
                                // Volume of Pyramid
                            	System.out.println("Choose the base shape of the pyramid:");
                                System.out.println("1 ---> Square");
                                System.out.println("2 ---> Triangle");
                                System.out.println("3 ---> Circle");
                                System.out.print("Enter the number corresponding to the base shape: ");
                                int baseShape = s.nextInt();

                                double baseArea = 0.0;

                                switch (baseShape) {
                                    case 1: {
                                        // Square base
                                        System.out.print("Side length of the square base? ");
                                        double sideLength = s.nextDouble();
                                        baseArea = Math.pow(sideLength, 2);
                                        break;
                                    }
                                    case 2: {
                                        // Triangle base
                                        System.out.print("Base length of the triangle base? ");
                                        double baseLength = s.nextDouble();
                                        System.out.print("Height of the triangle base? ");
                                        double baseHeight = s.nextDouble();
                                        baseArea = 0.5 * baseLength * baseHeight;
                                        break;
                                    }
                                    case 3: {
                                        // Circle base
                                        System.out.print("Radius of the circle base? ");
                                        double radius = s.nextDouble();
                                        baseArea = Math.PI * Math.pow(radius, 2);
                                        break;
                                    }
                                    default:
                                        System.err.println("Invalid base shape selection!");
                                        System.out.println();
                                        return; // Exit the case if an invalid selection is made
                                }

                                System.out.print("Height of the pyramid? ");
                                double height = s.nextDouble();
                                
                                double result = (1.0 / 3.0) * baseArea * height;
                                System.out.println("Volume of Pyramid is " + result + "cm\u00B3");
                                System.out.println();
                                break;
                            }
                            default:
                                System.err.println("Invalid Input!!! ");
                                System.out.println();
                                break;
                        }
                        break;
                    }
                    case 4: {
                        // Total Surface Area calculations
                        System.out.println("1 ---> Cube");
                        System.out.println();
                        int shape = s.nextInt();
                        switch (shape) {
                            case 1: {
                                // Total Surface Area of Cube
                                System.out.print("Side length of the cube? ");
                                double sideLength = s.nextDouble();
                                double result = 6 * Math.pow(sideLength, 2);
                                System.out.println("Total Surface Area of Cube is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            default:
                                System.err.println("Invalid shape selection!");
                                System.out.println();
                                break;
                        }
                        break;
                    }
                    case 5: {
                        // Curved Surface Area calculations
                        System.out.println("1 ---> Cylinder");
                        System.out.println();
                        int shape = s.nextInt();
                        switch (shape) {
                            case 1: {
                                // Curved Surface Area of Cylinder
                                System.out.print("Radius of the base? ");
                                double radius = s.nextDouble();
                                System.out.print("Height of the cylinder? ");
                                double height = s.nextDouble();
                                double result = 2 * Math.PI * radius * height;
                                System.out.println("Curved Surface Area of Cylinder is " + result + "cm\u00B2");
                                System.out.println();
                                break;
                            }
                            default:
                                System.err.println("Invalid shape selection!");
                                System.out.println();
                                break;
                        }
                        break;
                    }
                    case 6: {
                        // Exit Loop
                        loop = false;
                        System.out.println("Exiting the program. Thank you!");
                        break;
                    }
                    default: 
                    	System.err.println("Invalid Input!!!");
                }
            }catch (InputMismatchException e) {
                // Handle the exception
                System.err.println("Invalid input!!! Please enter a numeric value.");
                s.next(); // Consume the invalid input to avoid an infinite loop
            }
            
        }
    }
}
