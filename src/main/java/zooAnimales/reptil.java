package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	static int cantRe;
	
	static {
		listado = new ArrayList<Reptil>();
	}

	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.cantRe++;
	}
	
	public Reptil() {
		Reptil.cantRe++;
	}
	
	public int cantidadReptiles() {
		int cantidadRe = 0;
		for (Reptil reptil : listado) {
			if (reptil != null) {
			cantidadRe++;}
		}
		return cantidadRe;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil reptil = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		listado.add(reptil);	
		iguanas++;
		return reptil;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil reptil = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		listado.add(reptil);	
		serpientes++;
		return reptil;
	}
	
	public static void setListado(ArrayList<Reptil> lista) {
		listado = lista;
	}
	public ArrayList<Reptil> getListado() {
		return listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public int getLargoCola() {
		return this.largoCola;
	}

}