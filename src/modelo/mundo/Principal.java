package modelo.mundo;

import java.util.*;

public class Principal {
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op = 0;
		
		Empleado empleado=null;
		Fecha fecha = new Fecha();
		String name, lastname, img = null;
		int genero, day, month, year;
		double salario;
		Fecha bornDate, fechaIngreso;
		
		do {
			System.out.println("|________________________________________________________|");
			System.out.println("|           PROYECTO EMPLEADO - MENU PRINCIPAL           |");
			System.out.println("|--------------------------------------------------------|");
			System.out.println("| 1. Ingresar datos del empleado.                        |");
			System.out.println("| 2. Calcular la edad del empleado.                      |");
			System.out.println("| 3. Calcular la antiguedad del empleado en la empresa.  |");
			System.out.println("| 4. Calcular las prestaciones del empleado.             |");
			System.out.println("| 5. Visualizar la informacion del empleado              |");
			System.out.println("| 6. Salir                                               |");
			System.out.println("|--------------------------------------------------------|");
			System.out.print("=> "); op = scanner.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Ingreso de datos del empleado: ");
					
					System.out.println("Nombre: ");
					name = scanner.next();
			        
					System.out.println("Apellido: ");
			        lastname = scanner.next();
			        
			        do {
					/*System.out.println("Genero(1.Masculino / 2.Femenino): ");
					//validación (letras número =/ 1,2)
			        genero= scanner.nextInt();*/
			        	try {
			        		System.out.println("Genero(1.Masculino / 2.Femenino)");
			        		genero= scanner.nextInt();
			        	}
			        	
			        	catch (InputMismatchException e) {
			        		System.out.println("Solo se admiten los números 1 y 2");
			        		genero = 0;
			        		//e.printStackTrace;
			        		scanner.nextLine();
			        	}
			        }while (genero<1 || genero>2);
			        
					System.out.println("Salario: ");
			        salario = scanner.nextDouble();
			        
					System.out.println("Ingrese dia de nacimiento: ");
			        day = scanner.nextInt();
			        
			        System.out.println("Ingrese mes de nacimiento: ");
			        month = scanner.nextInt();
			        
			        System.out.println("Ingrese año de nacimiento: ");
			        year = scanner.nextInt();
			        
			        bornDate = new Fecha(day, month, year);
			        
			        System.out.println("Ingrese dia de ingreso: ");
			        day = scanner.nextInt();
			        
			        System.out.println("Ingrese mes de ingreso: ");
			        month = scanner.nextInt();
			        
			        System.out.println("Ingrese año de ingreso: ");
			        year = scanner.nextInt();
			        
			        fechaIngreso = new Fecha(day, month, year);
			        
			        empleado=new Empleado(name, lastname, genero, img, salario, bornDate, fechaIngreso);
			        //empleado.setEmpleado(name, lastname, genero, img, salario, bornDate, fechaIngreso);
					break;
				case 2:
					System.out.println("_______________________________________________");
					System.out.println("                                               ");
					System.out.println("Edad del empleado: " + empleado.calcularEdad());
					System.out.println("_______________________________________________");
					break;
				case 3:
					System.out.println("_______________________________________________");
					System.out.println("                                               ");
					System.out.println("Antiguedad del empleado: " + empleado.calcularAntiguedad());
					System.out.println("_______________________________________________");
					break;
				case 4:
					System.out.println("_______________________________________________");
					System.out.println("                                               ");
					System.out.println("Prestaciones del empleado: " + empleado.calcularPrestaciones());
					System.out.println("_______________________________________________");
					break;
				case 5:
					System.out.println("_______________________________________________");
					System.out.println("                                               ");
					empleado.mostrarDatosEmpleado();
					System.out.println("_______________________________________________");
					break;
				case 6:
					System.out.println("Ejecucion Terminada");
					break;
			}
		} while(op != 6);
	}
}
