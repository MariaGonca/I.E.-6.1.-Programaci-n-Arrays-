package Array35;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */
public class ArrayAgenda {

	public static void main(String[] args) {

		//Se crea array llamado listaContactos de un objeto (objeto de la clase Contactos)
		ArrayList<Contactos> listaContactos = new ArrayList<Contactos>();
		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		//Pide por pantalla la acción para hacer sobre la agenda
		//Si pulsa 5 el programa finaliza
		while (opcion != 5) {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1- Introducir los contactos");
			System.out.println("2- Eliminar contacto");
			System.out.println("3- Mostrar agenda");
			System.out.println("4- Modificar contacto");
			System.out.println("5- Salir");

			opcion = sc.nextInt();
			switch (opcion) {

			//Introduce los datos del contacto y crea un objeto contacto con esos datos.
			case 1:
				System.out.println("Introduce nombre");
				String nombre = sc.next();
				System.out.println("Introduce dirección");
				String direccion = sc.next();
				System.out.println("Introduce tlf");
				int telefono = sc.nextInt();

				Contactos contacto = new Contactos(nombre, direccion, telefono);
				listaContactos.add(contacto);
				break;
				
			//Si el arrayList no está vacío permite borrar in contacto
			//para determinar cuál es se busca su id
			case 2:
				if (listaContactos.size() == 0) {
					System.out.println("La lista está vacía");
				} else {
					System.out.println("Introduce el id del elemento a borrar: ");
					int indice = sc.nextInt();
					int posicion = 0;
					boolean encontrado = false;
					//Si se encuentra el id encontrado pasa a ser true (corresponde a un contacto)
					for (int i = 0; i < listaContactos.size(); i++) {
						if (indice == listaContactos.get(i).getId()) {
							System.out.println("Elemento a borrar: " + listaContactos.get(i).getId());
							posicion = i;
							encontrado = true;
						}
					}//Si es true se usa .remove para eliminar ese objeto del array
					if (encontrado == true) {
						listaContactos.remove(posicion);
					} else { //Si el id introducido no corresponde a ningún objeto no se realiza ninguna acción
						System.out.println("No se encontro el elemento a borrar");
					}

				}

				break;
				
				
			//Si listaContactos no tiene elementos no se realiza ninguna acción
			//De otro modo se imprime por pantalla el array mediante un for	
			case 3:

				if (listaContactos.size() == 0) {
					System.out.println("La lista está vacía");
				} else {			
				for (int i = 0; i < listaContactos.size(); i++) {
					Contactos contactoA = listaContactos.get(i);
					System.out.println("Id: " + contactoA.getId() + " - Nombre: " + contactoA.getNombre()
							+ " - Direccion: " + contactoA.getDireccion() + "  - Telefono: " + contactoA.getTelefono());
				}
				}
				break;
				
				
			//Si listaContactos no tiene elementos no se realiza ninguna acción
			//De otro modo pide el id, busca el objeto al que corresponde 
			//Si no encuentra correlación entre el número introducido y el id de un objeto no hace nada
			//muestra por pantalla "contacto no encontrado"
			//Si lo encuentra la variable encontrado pasa a ser true y pide nuevamente los datos
			case 4:
				
				if (listaContactos.size() == 0) {
					System.out.println("La lista está vacía");
				} else {
				
				System.out.println("Introduce el identificador(Id) del elemento a modificar: ");
				int identificador = sc.nextInt();
				boolean encontrado = false;
				int posicion = 0;
				Contactos aux;
				for (int i = 0; i < listaContactos.size() && encontrado == false; i++) {
					aux = listaContactos.get(i);
					if (aux.getId() == identificador) {
						encontrado = true;
						posicion = i;
					}
				}
				if (encontrado == true) {
					aux = listaContactos.get(posicion);
					System.out.println("Introduce el nuevo nombre: ");
					String nuevoNombre = sc.next();
					System.out.println("Introduce la nueva direccion: ");
					String nuevaDireccion = sc.next();
					System.out.println("Introduce el nuevo numero de telefono: ");
					int nuevoTelefono = sc.nextInt();
					aux.setDireccion(nuevaDireccion);
					aux.setNombre(nuevoNombre);
					aux.setTelefono(nuevoTelefono);
				}else{System.out.println("No se ha encontrado el contacto");
					}
				}

				break;

			default:
				System.out.println("Opción escogida no válida");
			}

		}

		sc.close();
	}

}
