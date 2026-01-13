package ejercicioscuentapropia;

import java.util.Scanner;

/*Realiza un programa con un cliente en el que le pidas al usuario las
notas de las 12 asignaturas del Ciclo de DAM (nombre, curso y nota)
y las envíe a un servidor que las recogerá, calculará la media de
primero, la de segundo y la media total y las devolverá al cliente,
que las mostrara.

Nota: Cada una de las asignaturas serán un objeto que se encuentra
en un arraylist, y cuyos atributos serán el nombre, el curso y la
nota.

Nota 2: Con el constructor podrás asignar directamente el nombre y
el curso de la asignatura al crear el objeto. En cambio, el atributo
nota, será el usuario quien lo introduzca mediante un método que
controle que la nota tenga un valor entre 0 y 10
*/

public class NotasAsignaturasFile {

	private String nombreAlumno;
	private String curso;
	private int nota;

	NotasAsignaturasFile(String nombreAlumno, String curso, int nota) {
		this.nombreAlumno = nombreAlumno;
		this.curso = curso;
		this.nota = definirNota();
	}

	public int definirNota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota (1 - 10): ");
		int nota = Integer.parseInt(sc.nextLine());
		while (nota < 0 || nota > 10) {
			System.out.println("Nota incorrecta, debe estar en el rango adecuado, vuelva a introducirla: ");
			nota = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		return nota;
	}

	public static void main(String[] args) {
		NotasAsignaturasFile[] notas;

	}

}
