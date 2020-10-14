package dados;

import java.util.Random;

public class Dado {
	private int valor1 = 0;
	private int valor2 = 0;
	private int valor3 = 0;
	private int valor4 = 0;
	private int valor5 = 0;
	private int valor6 = 0;

	public void lanzar() {
		Random rng = new Random();
		int numero = rng.nextInt(6) + 1;
		synchronized (this) {
			switch (numero) {
			case 1:
				valor1++;
				break;
			case 2:
				valor2++;
				break;
			case 3:
				valor3++;
				break;
			case 4:
				valor4++;
				break;
			case 5:
				valor5++;
				break;
			case 6:
				valor6++;
				break;
			default:
				break;
			}
		}

	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public int getValor4() {
		return valor4;
	}

	public int getValor5() {
		return valor5;
	}

	public int getValor6() {
		return valor6;
	}

}
