package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = new ArrayList<Animal>();
	}
	
	public Zona() {
		this.animales = new ArrayList<Animal>();
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public int cantidadAnimales() {
		int cantAnim = 0;
		for(Animal animal : animales) {
			if (animal != null) {
			cantAnim += 1;
			}
		}
		return cantAnim;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	public void setAnimales(ArrayList<Animal>animales) {
		this.animales = animales;
	}
	public ArrayList<Animal> getAnimales() {
		return this.animales;
	}

}