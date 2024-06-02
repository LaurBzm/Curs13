package org.example;

import java.util.Scanner;

class TempConversionTest{

    public static double fahrenheit = 0.0;
    public static double celsius = 0.0;

    public static double celsiusToFahrenheit(double celsius){
        return 5.0/9.0 * fahrenheit - 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return 9.0/5.0 * celsius + 32;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        fahrenheit = 0;
        celsius = 0;


        System.out.println("Enter the Degrees in Fahrenheit");
        fahrenheit = input.nextDouble();
        celsius = celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit + " degrees Fahrenheit converted to Celsius   is: " + celsius);

        System.out.println("Enter the Degrees in Celsius");
        celsius = input.nextDouble();
        fahrenheit = fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius + " degrees Celsius converted to Fahrenheit is: " + fahrenheit);
    }

}

