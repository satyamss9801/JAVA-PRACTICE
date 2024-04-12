import java.util.Scanner;

public strictfp class CelsiusToF {
    static void CtoF(float celcius) {

        System.out.println("IN Fahrenheit : " + (celcius * 1.8) + 32);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value In Celsius");
        float celcius = sc.nextFloat();
        CtoF(celcius);
    }

}
