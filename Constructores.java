import java.util.Scanner;

/* Utilizar un constructor que pida obligatoriamente nombre y DNI.*/

class empleados {
	String nombre;
	String dni;
	double sueldo;
	
	empleados(String aux_nombre, String aux_dni){
		nombre = aux_nombre;
		dni = aux_dni;
	}
	
	public double sueldoNeto() {
		double neto;
		neto = sueldo * 0.85;
		return neto;
	}
}

public class Constructores {
	public static void main(String args[]) {
		empleados empleado_actual = new empleados("alex", "DNI12345");
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el sueldo del empleado: ");
		empleado_actual.sueldo = sc.nextDouble();
		sc.close();
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nombre: " + empleado_actual.nombre);
		System.out.println("DNI: " + empleado_actual.dni);
		System.out.println("Sueldo neto: " + empleado_actual.sueldoNeto());	
	}
}
	