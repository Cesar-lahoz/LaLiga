
public class Entrenador {

	private String nombre;
	private int edad;
	private int numerotitulos;
	public Entrenador () {
	}
	public Entrenador(String nombre, int edad, int numerotitulos) {
		this.nombre= nombre;
		this.edad= edad;
		this.numerotitulos= numerotitulos;
	}
	public String getNombre() {return this.nombre;}
	public void setNombre(String nombre) {this.nombre=nombre;}
	public int getEdad() {return this.edad;}
	public void setEdad(int edad) {this.edad=edad;} 
	public int getNumTitulos() {return this.numerotitulos;}
	public void setNumTitulos(int numerotitulos) {this.numerotitulos=numerotitulos;}
}
