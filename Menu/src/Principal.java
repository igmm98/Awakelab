import java.util.Scanner;
public class Principal {
	
	public static Funcion1 f1 = new Funcion1();
	public static Funcion2 f2 = new Funcion2();
	public static Funcion3 f3 = new Funcion3();
	public static Funcion4 f4 = new Funcion4();
	public static Funcion5 f5 = new Funcion5();
	public static Funcion6 f6 = new Funcion6();
	public static Funcion7 f7 = new Funcion7();
	public static Funcion8 f8 = new Funcion8();
	public static Funcion9 f9 = new Funcion9();
	
	public static void main(String[] args) {
		
		Menu();

	}
	
	public static void Menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Menu ---\n"+
						   "1. Secuencial\n"+
						   "2. Condicional if\n"+
						   "3. Condicional 2.0\n"+
						   "4. Condicional Switch\n"+
						   "5. While\n"+
						   "6. Do while\n"+
						   "7. For\n"+
						   "8. Arreglo simple\n"+
						   "9. Arreglo Bidimensional\n"+
						   "10. Salir\n"+
						   "-------------"
				);
		int sel = sc.nextInt();
		Seleccion(sel);
		sc.close();
	}
	
	public static void Seleccion(int sel) {
		
		switch(sel) {
			case 1:
				f1.Promedio();
				Menu();
				
			case 2:
				f2.Banios();
				Menu();
				
			case 3:
				f3.SelBanios(f2.GetNombre());
				Menu();
				
			case 4:
				f4.NumerosLetras();
				Menu();
				
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				
			case 10:
				break;
				
			default:
				break;
		}
		
	}

}
