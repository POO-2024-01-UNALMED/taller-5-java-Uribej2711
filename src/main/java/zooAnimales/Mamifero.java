package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	static int cantMa;
	
	static {
		listado = new ArrayList<Mamifero>();
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.cantMa++;
	}
	
	public Mamifero() {
		Mamifero.cantMa++;
	}
	
	public int cantidadMamiferos() {
		int cantidadMa = 0;
		for (Mamifero mamifero : listado) {
			if (mamifero != null) {
			cantidadMa += 1;}
		}
		return cantidadMa;
	}
	
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
	    Mamifero mamifero = new Mamifero(nombre,edad,"prado",genero,true,4);
		listado.add(mamifero);	
		caballos++;
		return mamifero;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
	    Mamifero mamifero = new Mamifero(nombre,edad,"selva",genero,true,4);
		listado.add(mamifero);	
		leones++;
		return mamifero;
	}
	
	public void setListado(ArrayList<Mamifero> lista) {
		listado = lista;
	}
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean isPelaje() {
		return this.pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas() {
		return this.patas;
	}
}