import java.util.Scanner;
public class ConsultaVuelos {
	
	private Scanner sc = new Scanner(System.in);
	
	public void tarifas(){
		Scanner sc = new Scanner(System.in);
		
		String[][] tarifas = {{"Primera Clase", "100.000"},{"Clase Ejecutiva", "60.000"}, {"Clase Econ�mica", "40.000"}};
		
		System.out.println("Tarifas Disponibles");
		System.out.println("--------------------");
		
		for(int i=0;i<3;i++) {
				System.out.println("Opcion "+(i+1)+".- "+tarifas[i][0] + " "+ tarifas[i][1]);
		}
		System.out.println("--------------------");
		String seleccion = "";
		
		do {
			
			System.out.println("�En qu� tarifa desea viajar?");
			
			seleccion = sc.next();
			
		switch (seleccion){
		case "1":
			 System.out.println("Elegiste primera clase");
			break;
		case "2":
			System.out.println("Elegiste ejecutiva");
			break;
		case "3":
			System.out.println("Elegiste econ�mica");
			break;
		default:
		  System.out.println("Intente con otro n�mero");
		} 
		}while(Integer.parseInt(seleccion) <1 || Integer.parseInt(seleccion)>3);
		sc.close();
	}

	
	public void informacion() {
		
		String opcion = "";
		
		
		System.out.println("Ingrese informacion de Vuelo");
		System.out.println("Si el vuelo es nacional - opcion 1");
		System.out.println("Si el vuelo es internacion - opcion 2");
		
		opcion = sc.next();
		switch(opcion){
			case "1":
				System.out.println("El vuelo se encuentra retrasado");
				break;
			case "2":
				System.out.println("Pasajero con CORONAVIRUS");
				break;
			case "3":
				System.out.println("Intente nuevamente.. dedos gordos");
				break;
		}
	}
	
	public void horarios(){
		
		String horas[][] = new String [7][4];
		horas[0] [0] = "LUNES";
		horas[0] [1] = "Ma�ana";
		horas[0] [2] = "Tarde";
		horas[0] [3] = "Noche";
		
		horas[1] [0] = "JUEVES = 16:30";
		horas[1] [1] = "DOMINGO = 20:00";
		System.out.println( horas [0] [0]  );
		System.out.println( horas [0] [1]  );
		System.out.println( horas [1] [0]  );
		System.out.println( horas [1] [1]  );
	}

}
