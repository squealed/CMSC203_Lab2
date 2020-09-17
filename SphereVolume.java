import java.util.Scanner;

public class SphereVolume {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the diameter of the sphere:");
		double diam = sc.nextDouble();
		double radius = diam/2;
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println("The volume of the sphere is: " + volume);
		
	}
}
