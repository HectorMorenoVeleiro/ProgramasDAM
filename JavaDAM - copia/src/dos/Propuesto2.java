package dos;

import java.util.Objects;

//clase que genere el doble/triple/cuadruple de un numero
public class Propuesto2 {

	int num;

	Propuesto2(int n) {
		this.num = n;
	}

	Propuesto2(Propuesto2 obj) {
		this.num = obj.num;
		System.out.println("hemos creado una copia de: " + obj.toString());
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int n) {
		this.num = n;
	}

	public int calcularDoble() {
		return 2 * this.num;
	}

	public int calcularTriple() {
		return 3 * this.num;
	}

	public int calcularCuadruple() {
		return 4 * this.num;
	}

	@Override
	public String toString() {
		return "Propuesto2 [num=" + num + ", calcularDoble()=" + calcularDoble() + ", calcularTriple()="
				+ calcularTriple() + ", calcularCuadruple()=" + calcularCuadruple() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		// OJO DECIDE QUE SON IGUALES NO QUE SEAN EL MISMO OBJETO
		Propuesto2 other = (Propuesto2) obj;
		return num == other.num;
	}	
}
