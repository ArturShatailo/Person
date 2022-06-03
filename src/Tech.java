import java.util.Scanner;

public class Tech {

    public static int GetInputFunction(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static Integer getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static Double getRandomDouble(double min, double max) {
        return roundMet((Math.random() * (max - min)) + min);
    }

    public static double roundMet(double a){
        double b = Math.pow(10, 2);
        return Math.ceil(a * b) / b;
    }

}

