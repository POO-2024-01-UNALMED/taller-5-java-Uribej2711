package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private  String colorEscamas;
	private int cantidadAletas;
	static int cantPe;
	
	static {
		listado = new ArrayList<Pez>();
	}

	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.cantPe++;
	}
	
	public Pez() {
		Pez.cantPe++;
	}
	
	public int cantidadPeces() {
		int cantidadPe = 0;
		for (Pez pez : listado) {
			if (pez != null) {
			cantidadPe++;}
		}
		return cantidadPe;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
	    Pez pez = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		listado.add(pez);	
		salmones++;
		return pez;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez pez = new Pez(nombre,edad,"oceano",genero,"gris",6);
		listado.add(pez);	
		bacalaos++;
		return pez;
	}
	
	public static void setListado(ArrayList<Pez> lista) {
		listado = lista;
	}
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}



}