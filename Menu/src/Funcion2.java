import java.util.Scanner;
public class Funcion2 {
	
	private Scanner sc = new Scanner(System.in);
	private String nombre;
	
	public void Banios() {
		boolean val;
		
		nombre = "";
		String genero = "";
		
		do {
			System.out.println("Ingrese nombre: ");
			nombre = sc.next();
			System.out.println("Ingrese genero (Masculino/Femenino): ");
			genero = sc.next();
			
			if(genero.toLowerCase().equals("femenino") || genero.toLowerCase().equals("masculino")) {
				val = true;
			}else {
				val = false;
			}
		}while(val == false);
		
		if(genero.toLowerCase().equals("femenino")) {
			System.out.println("Ir al ba�o de mujeres!");
		}else {
			System.out.println("Ir al ba�o de hombres!");
		}
		
	}
	
	public String GetNombre() {
		return nombre;
	}

}
