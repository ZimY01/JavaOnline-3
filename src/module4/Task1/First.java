package module4.Task1;
import java.lang.*;

public class First {

    private double triangle(double a, double b){
        return (a*b)/2;
    }

    private double square(double a){
        return Math.pow(a, 2);
    }

    private double cicrle(double a){
        return 3.14*Math.pow(a, 2);
    }

    public static void main(String[] args) {

        String name = "circle";
        double a = 8, b = 3;



        if (name.equals("triangle")) {
            First triangle = new First();
            System.out.println(triangle.triangle(a, b));
        }
        if (name.equals("square")){
            First square = new First();
            System.out.println(square.square(a));
        }
        if (name.equals("circle")){
            First circle = new First();
            System.out.println(circle.cicrle(a));
        }
    }
}
