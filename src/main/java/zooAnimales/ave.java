package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	static int cantAv;
	
	static {
		listado = new ArrayList<Ave>();
	}

	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.cantAv++;
	}
	
	public Ave() {
		Ave.cantAv++;
	}
	
	public int cantidadAves() {
		int cantidadAv = 0;
		for (Ave ave : listado) {
			if (ave != null) {
			cantidadAv++;}
		}
		return cantidadAv;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave ave = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		listado.add(ave);	
		halcones++;
		return ave;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
	    Ave ave = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		listado.add(ave);	
		aguilas++;
		return ave;
	}
	
	public static void setListado(ArrayList<Ave> lista) {
		listado = lista;
	}
	public ArrayList<Ave> getListado() {
		return listado;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	

}