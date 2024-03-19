package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	static int cantAn;
	
	static {
		listado = new ArrayList<Anfibio>();
	}

	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.cantAn++;
	}
	
	public Anfibio() {
		Anfibio.cantAn++;
	}
	
	public int cantidadAnfibios() {
		int cantidadAn = 0;
		for (Anfibio anfibio : listado) {
			if (anfibio != null) {
			cantidadAn++;}
		}
		return cantidadAn;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
	    Anfibio anfibio = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		listado.add(anfibio);	
		ranas++;
		return anfibio;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
	    Anfibio anfibio = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		listado.add(anfibio);	
		salamandras++;
		return anfibio;
	}
	
	public void setListado(ArrayList<Anfibio> lista) {
		listado = lista;
	}
	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public boolean isVenenoso() {
		return this.venenoso;
	}



}