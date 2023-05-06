package modelo;

public class Perro {

	private int idperro;
	private String raza;
	private String color;
	private float peso;

	public Perro(String raza, String color, float peso) {
		super();
		this.raza = raza;
		this.color = color;
		this.peso = peso;
	}

	public Perro(int idperro, String raza, String color, float peso) {
		super();
		this.idperro = idperro;
		this.raza = raza;
		this.color = color;
		this.peso = peso;

	}

	public int getIdperro() {
		return idperro;
	}

	public void setIdperro(int idperro) {
		this.idperro = idperro;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Perro [idperro=" + idperro + ", raza=" + raza + ", color=" + color + ", peso=" + peso + "]";
	}

}
