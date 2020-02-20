import java.util.Scanner;
public class Funcion1 {
	
	private Scanner sc = new Scanner(System.in);
	
	public void Promedio() {
		double prom = 0;
		for(int i = 1; i<4; i++) {
		System.out.println("Ingrese numero "+i+":");
		prom = prom + sc.nextInt();
		}
		prom = prom/3;
		System.out.println("El promedio es "+ prom);
	}

}
