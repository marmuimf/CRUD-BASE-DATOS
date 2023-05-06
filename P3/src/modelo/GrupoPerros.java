package modelo;

import java.util.ArrayList;

public class GrupoPerros {

	// atributos
	private String id;
	private ArrayList<Perro> listaPerros = new ArrayList<Perro>();

	// Constructor, no inicializo la lista pq ya la tengo arriba
	public GrupoPerros(String id) {
		super();
		this.id = id;
	}

	// Getters and S
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Perro> getListaPerros() {
		return listaPerros;
	}

	public void setlistaPerros(ArrayList<Perro> listaPerros) {
		this.listaPerros = listaPerros;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", listaPerros=" + listaPerros + "]";
	}

	// metodos

	// metodo para mostrar el contenido de la lista

	public void mostrarPerro() {

		// bucle para recorrer la lista
		for (Perro item : listaPerros) {
			System.out.println("Raza: " + item.getRaza());
			System.out.println("Color: " + item.getColor());
			System.out.println("Peso: " + item.getPeso());
			System.out.println("----------------------");
		}
	}
	
	public void addPerro(Perro item) {

		listaPerros.add(item);
		
	}
	
	public void modificarPerro(Perro item, String nombre) {

		int posicion = buscarRazaPerro(nombre);
		if (posicion > -1) { // si el valor q rebice es mayor a -1 si q lo ha encontrado
			// si lo ha encontrado, modificamos:
			listaPerros.get(posicion).setRaza(item.getRaza());
			listaPerros.get(posicion).setColor(item.getColor());
			listaPerros.get(posicion).setPeso(item.getPeso());
		} else {
			System.out.println("Producto no encontrado");
		}
	}

	public void eliminarPerro(String nombre) {

		int posicion = buscarRazaPerro(nombre);

		if (posicion > -1) { // si el valor q rebice es mayor a -1 sig q lo ha encontrado
			// si lo ha encontrado, eliminamos:
			listaPerros.remove(posicion);

		} else {
			System.out.println("Producto no encontrado");
		}
	}

	// metodo para saber en que posicion de la lista esta el metodo
	public int buscarRazaPerro(String nombre) {
		int posicion = 0;
		int contador = 0;

		boolean encontrado = false;

		while (contador < listaPerros.size() && !encontrado) {
			// accedo a la pos del contador+capturo el nombre y comparo:
			if (listaPerros.get(contador).getRaza().equals(nombre)) {
				posicion = contador;// anoto la posicion del valor de contador
				encontrado = true;
			} else {// si no se cumple, miro en la siguiente posicion aumentando el contador
				contador++;
			}

		}
		return posicion;// devuelve una posicion o -1 si no hay
	}

	public void listarRaza(String raza) {

		// bucle para recorrer la lista
		for (Perro item : listaPerros) {
			if (item.getRaza().equals(raza)) {
				System.out.println("Raza: " + item.getRaza());
				System.out.println("Color: " + item.getColor());
				System.out.println("Peso: " + item.getPeso());
				System.out.println("----------------------");
			}
		}
	}

	public void listarColor(String color) {

		// bucle para recorrer la lista
		for (Perro item : listaPerros) {
			if (item.getColor().equals(color)) {
				System.out.println("Raza: " + item.getRaza());
				System.out.println("Color: " + item.getColor());
				System.out.println("Peso: " + item.getPeso());
				System.out.println("----------------------");
			}
		}
	}

	public void listarPeso(float peso) {

		// bucle para recorrer la lista
		for (Perro item : listaPerros) {
			if (item.getPeso() == peso) {
				System.out.println("Raza: " + item.getRaza());
				System.out.println("Color: " + item.getColor());
				System.out.println("Peso: " + item.getPeso());
				System.out.println("----------------------");
			}
		}
	}
}
