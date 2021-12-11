package modelo.mundo;

import java.util.*;

public class Empleado {
	//atributos
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private int genero; //1 Femenino 2 Masculino
	private String imagen;
	private double salario;
	
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	
	//Metodo Constructor sin parametros
	public Empleado () {
		nombreEmpleado = "";
		apellidoEmpleado = "";
		genero= 0;
		imagen = "";
		salario = 0.0;
	    fechaNacimiento = new Fecha();
		fechaIngreso = new Fecha();
	}
	//Metodo constructor con parametros
	public Empleado (String pNombreEmpleado, String pApellidoEmpleado, int pGenero, 
			String pImagen, double pSalario, Fecha pFechaNacimiento, Fecha pFechaIngreso) {
		nombreEmpleado = pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero = pGenero;
		imagen = pImagen;
		salario = pSalario; 
		fechaNacimiento = pFechaNacimiento;
		fechaIngreso = pFechaIngreso;
	}
	//metodos analizadores(permiten obtener o modificar los atributos)
	//getters (obtener) //setters (cambiar o modificar) 
	
	public String getNombre () {
		return nombreEmpleado;
	}
	
	public String getApellido () {
		return apellidoEmpleado; 
	}
	
	public int getGenero () {
		return genero;
	}
	
	public Fecha getFechaNacimiento () {
		return fechaNacimiento;
	}
	
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	
	public String getImagen () {
		return imagen;
	}
	
	public double getSalario () {
		return salario;
	}

	public Fecha darFechaActual () {
		GregorianCalendar gc = new GregorianCalendar ();
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int mes = gc.get(Calendar.MONTH) + 1;
		int anio = gc.get(Calendar.YEAR);
		
		Fecha fechaActual = new Fecha(dia, mes, anio);
		return fechaActual;
	}
	//Metodos Setters 
	
	public void setEmpleado (String pNombreEmpleado, String pApellidoEmpleado, int pGenero, 
			String pImagen, double pSalario) {
		nombreEmpleado = pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero = pGenero;
		imagen = pImagen;
		salario = pSalario; 
	}
	
	public void setSalario (double pSalario) {
		salario = pSalario;
	}
	
	//Metodos funcionales
	public int calcularAntiguedad () {
		int antiguedad = 0;
		antiguedad=fechaIngreso.darDiferenciaEnMeses(getFechaIngreso())/12;
		return antiguedad;
	}
	//metodos funciona calcular la edad 
	public int calcularEdad() {
		
		int edad = 0;
		edad= fechaNacimiento.darDiferenciaEnMeses(getFechaNacimiento())/24;
		
		return edad; 
	}

	
	//metodos funcionales prestaciones
	public double calcularPrestaciones() {
		double prestaciones = 0;
		prestaciones= ((calcularAntiguedad()* getSalario())/12);
		return prestaciones; 
	}
	
	//metodo que permite visualizar la informacion del empleado

	public void mostrarDatosEmpleado () {
		System.out.println("\nDatos del empleado ");
		System.out.println("\nNombre: " + nombreEmpleado);
		System.out.println("\nApellido: " + apellidoEmpleado);
		System.out.println("\nGenero: " + genero);
		System.out.println("\nSalario: " + salario);

	}
	public void setEmpleado(String name, String lastname, int genero2, String img, double salario2, Fecha bornDate,
			Fecha fechaIngreso2) {
		
	}
}

	  