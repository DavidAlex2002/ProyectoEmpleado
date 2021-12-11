package modelo.mundo;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	//Constructor
	public Fecha (int pDia, int pMes, int pAnio) {
		dia = pDia;
		mes = pMes;
		anio = pAnio;
		
	}
	public Fecha () {
		dia = 0;
		mes = 0;
		anio = 0;
	}
	
	//metodos analizadores
	
	public int getDia () {
		return dia;
	}
	
	public int getMes () {
		return mes;
	}
	
	public int getAnio () {
		return anio;
	}
	
	//metodos funcionales
	 public int darDiferenciaEnMeses(Fecha pFecha) {
		int numeroMeses = 0; 
		int difAnios = pFecha.getAnio() - anio * 12;
		int difMeses = 0;
		
		if (mes < pFecha.getMes()) {
			difMeses =  pFecha.getMes() - mes;
		}
		int difDias = 0;
		if (mes < pFecha.getMes()) {
			difDias = (pFecha.getDia() - dia )/ 30;
		}
		numeroMeses = difAnios + difMeses + difDias;
		return numeroMeses;
	}

	public String toString () {
		return dia + "-" + mes + "-" + anio;
	}
	


}
