package Array35;
/**
 * 
 * @author mcgca
 *
 */
public class Contactos {
/**Clase para crear objetos Contactos
 * 
 */
	private String nombre;
	private String direccion;
	private int telefono;
	private int id;
	static private int contador=0;
	/**
	 * 
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	public Contactos(String nombre, String direccion, int telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.id = contador;
		Contactos.contador++;
		//Cada objeto que se crea tiene un id diferente ya que se suma 1 al crearlo
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

	
}
