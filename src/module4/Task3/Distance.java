package module4.Task3;
import java.lang.*;

public class Distance {

    private double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double x1 = -1,y1 = 3,x2 = 4,y2 = -6;
        Distance distance = new Distance();
        System.out.println(distance.distance(x1, y1, x2, y2));
    }



}
