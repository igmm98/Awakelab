import java.util.Scanner;
public class Funcion4 {
	
	private Scanner sc = new Scanner(System.in);
	
	public void NumerosLetras() {
		int num = 0;
		do {
			
			System.out.println("Ingrese un numero entre 1 y 10:");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
			case 10:
				System.out.println("Dies");
				break;
				
			default:
				System.out.println("Ingrese nuevamente!");
				break;
			}
			
		}while(num < 1 || num > 10);
	}

}
