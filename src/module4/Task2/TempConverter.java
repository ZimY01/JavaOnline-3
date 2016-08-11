package module4.Task2;

public class TempConverter {

    public double convertCtoF(double celsium){
        return celsium * 9 / 5 + 32;
    }

    public double convertFtoC(double fahranheit){
        return (5 / 9) * (fahranheit - 32);
    }

    public static void main(String[] args) {
        double tempC = 36.6;
        TempConverter tempConverter = new TempConverter();
        double tempF = tempConverter.convertCtoF(tempC);
        System.out.println(tempF);
        double backC = tempConverter.convertFtoC(tempF);
        System.out.println(tempC);
    }

}
