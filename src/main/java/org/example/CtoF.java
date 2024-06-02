import java.util.Scanner;

public class CtoF {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Grade in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " grade Fahrenheit egal cu " + celsius + " in Celsius");
    }
}

public static void main(String[] Strings) {

    Scanner input = new Scanner(System.in);

    System.out.print("Grade in Celsius: ");
    double celsius = input.nextDouble();

    double  fahrenheit =(( celsius * 9/5 ) + 32.0);
    System.out.println(celsius + " grade Celsius egal cu " + fahrenheit + " in Fahrenheit");
}
}
