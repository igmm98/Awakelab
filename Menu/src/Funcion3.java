import java.util.Scanner;
public class Funcion3 {
	
	private Scanner sc = new Scanner(System.in);
	
	public void SelBanios(String nombre) {
		String sel = "";
		do {
		System.out.println("--- Seleccione ---\n"+
						   "1. Ba�o"+
						   "2. Duchas");
		sel = sc.next();
		}while(Integer.parseInt(sel) < 0 && Integer.parseInt(sel) > 3);
		
		if(sel.equals("1")) {
			System.out.println(nombre+" debes pagar $250");
		}else {
			System.out.println(nombre+" debes pagar $2500");
		}
	}

}
