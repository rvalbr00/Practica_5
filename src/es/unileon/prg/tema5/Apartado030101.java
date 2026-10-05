package es.unileon.prg.tema5;

import java.math.BigDecimal;

/**
 * Clase con los ejercicios correspondientes a tipos de datos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030101 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Tipos de datos basicos";
	}

	/**
	 * Tipos de datos basicos - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide modificar el codigo a fin de eliminar los errores de compilacion
	 * existentes. Los errores de compilacion tienen que ver con el manejo de
	 * tipos de datos basicos.
	 */
	public void ejercicio01() {
		cabecera("01", "Correccion de errores de compilacion");

		// Inicio modificacion
		int entero = 6;
		//Int no existe es int//
		long otroEntero = 1000;
		//long 1.000 no se puede, sería double//
		long decimal = 7;
		//7.0 es double, para long sería 7//
		double otroDecimal = 7.0;
		//falla la , que debería ser un .//
		byte enteroDe8Bits = 100;
		//byte se utiliza para valores más pequeños//
		char caracter = 'a';
		//faltan las comillas simples//
		char otroCaracter = 'a';
		//char utiliza comillas simples no dobles//
		boolean booleano = true;
		//sobran las comillas en true//
		short enteroDe16Bits = 30000;
		//valor demasiado grande para short//

		byte statico = 5;
		//falla por la palabra static que está reservada//
		byte enteroInt = 3;
		//lo mismo que la anterior, int es palabra reservada//
		double otra-Variable = 2.0;
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo a fin de determinar el tipo de dato mas
	 * adecuado para cada literal.
	 */
	public void ejercicio02() {
		cabecera("02", "Definicion de tipo de datos");

		// Inicio modificacion
		int variable1 = 637;
		//utilizo int para números enteros medianos//
		long variable2 = 637L;
		//utilizo long por la L que me indica que utilice este//
		double variable3 = 6.37;
		//utilizo double para números enteros con decimales//
		float variable4 = 6.37f;
		//utilizo float por lo mismo que long, está especificado por la f del final//
		double variable5 = 6.37d;
		//utilizo double por que me lo indica la d del final de igual forma//
		char variable6 = '6';
		//utilizo char porque el 6 está entre comillas simples//
		String variable7 = "6.37";
		//utilizo String porque el número está entre comillas dobles//
		char variable8 = 'a';
		//utilizo char porque la a está entre comillas simples//
		String variable9 = "a";
		//utilizo String porque la a está entre comillas dobles//
		boolean variable10 = true;
		//utilizo boolean porque boolean es para verdadero o falso//
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide definir variables que permitan representar la informacion
	 * referida en los comentarios.
	 */
	public void ejercicio03() {
		cabecera("03", "Definicion de variables");

		// Inicio modificacion
		int numeroAsignaturas;
		//Numero de asignaturas de un curso
		//las represento con int porque son un número entero
		double notaMedia;
		//Nota media de la asignatura
		//la represento con double porque la nota media suele tener decimales
		int edad;
		//Edad de una persona
		//la represento con int porque la edad es un número entero
		double salario;
		//Salario mensual de un empleado
		//lo represento con double porque un salario suele tener decimales
		String nombreAsignatura;
		//Nombre de una asignatura
		//lo represento con String porque el nombre de una asignatura son varios caracteres
		final double PI = 3.14159;
		//Constante PI
		//la represento con final porque es una constante y con double para tener mas precisión con los decimales
		final boolean VERDADERO = true;
		//Constante VERDADERO
		//al igual que la constante de pi, la constante la represento con final y verdadero o falso con boolean
		int portal;
		//Portal de la direccion de una vivienda
		//lo represento con int porque es un número entero
		int piso;
		//Piso de la direccion de una vivienda
		//misma explicación que la anterior
		char puerta;
		//Puerta la direccion de una vivienda
		//la represento con char porque suele ser un caracter pero también se podría utilizar String

		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio4.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.txt el porque de los resultados
	 * </ul>
	 */
	public void ejercicio04() {
		cabecera("04", "Formato decimales");

		// Inicio modificacion
		double valor1 = 2.8;
		double valor2 = 1.5;

		double resultado = valor1 - valor2;
		System.out.println(valor1+" - "+valor2+" = "+resultado);
		// Fin modificacion
	}


	/**
	 * Tipos de datos basicos - Ejercicio5.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * </ul>
	 */
	public void ejercicio05() {
		cabecera("05", "La clase <<BigDecimal>>");

		// Inicio modificacion
		BigDecimal valor1 = new BigDecimal("2.8");
		BigDecimal valor2 = new BigDecimal("1.5");

		System.out.println(valor1+" - "+valor2+" = "+valor1.subtract(valor2));
		// Fin modificacion
	}
}
