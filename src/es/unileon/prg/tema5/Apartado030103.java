package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores matematicos. La clase
 * "Math"
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores matematicos - Clase <<Math>>";
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio1.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener la raiz cuadrada de 256
	 */
	public void ejercicio01() {
		cabecera("01", "Calcular la raiz cuadrada de un numero");

		// Inicio modificacion
		double numero = 256;
		double raiz = Math.sqrt(numero);
		System.out.println(raiz);
		/* Primero defino la variable dando el valor numérico del número
		* Después, defino la operación raíz
		* Pongo una línea de código para que se vea el resultado al hacer el ant
		* Termino haciendo un ant para comprobar que funcione y efectivamente funciona
		*/
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio2.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener el resultado de elevar al
	 * cubo el numero 9
	 */
	public void ejercicio02() {
		cabecera("02", "Calcular potencias");

		// Inicio modificacion
		double numero = 9;
		double resultado = Math.pow(9, 3);
		System.out.println(resultado);
		//hice lo mismo que en el anterior apartado. Aunque, añadi también System.out.p... para comprobar el resultado con ant
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio3.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para generar un numero aleatorio contenido entre 5 y 10
	 */
	public void ejercicio03() {
		cabecera("03", "Generar numeros aleatorios");

		// Inicio modificacion
		int numero = (int) (Math.random() * 6) + 5;
		System.out.println(numero);
		/* Math.random genera un número al azar entre 0.0 y 1.0
		* al añadir el * 6, Math.random genera un número al azar entre 0.0 y 6.0
		* Math.random * 6, con el (int) hace que genere un número entero (hace que desaparezca la parte decimal)
		* Por último, con el +5, se generan números al azar entre el 5 y el 10
		* no puede dar 11 porque Math.random * 6, como mucho puede dar 5.9 que acaba siendo un 10
		*/
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio4.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo necesario
	 * para conocer la superficie de un circulo de diez unidades de radio.
	 */
	public void ejercicio04() {
		cabecera("04", "Calcular la superficie de un circulo");

		// Inicio modificacion
		double radio = 10;
		double superficie = Math.PI * Math.pow(radio, 2);
		System.out.println("La superficie del círculo es: " + superficie);
		// Fin modificacion
	}
}
