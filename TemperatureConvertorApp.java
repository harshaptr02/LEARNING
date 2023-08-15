package student;

import java.util.Scanner;

public class TemperatureConvertorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("convert temperature fahrenheit to celsius ");
		double fahrenheit=scan.nextDouble();
		TemperatureConvertor temperatureConvertor=new TemperatureConvertor();
		double t1=temperatureConvertor.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(t1);
	}

}
