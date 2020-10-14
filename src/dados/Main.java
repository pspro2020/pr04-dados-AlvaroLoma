package dados;

public class Main {

	public static void main(String[] args) {
		Dado dado = new Dado();
		Thread hilos[] = new Thread[3];
		for (int i = 0; i < hilos.length; i++) {
			hilos[i] = new Thread(new Tarea(dado));
		}
		for (int i = 0; i < hilos.length; i++) {
			hilos[i].start();
		}
		for (int i = 0; i < hilos.length; i++) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

		System.out.printf("Numero 1: %d \n", dado.getValor1());
		System.out.printf("Numero 2: %d \n", dado.getValor2());
		System.out.printf("Numero 3: %d \n", dado.getValor3());
		System.out.printf("Numero 4: %d \n", dado.getValor4());
		System.out.printf("Numero 5: %d \n", dado.getValor5());
		System.out.printf("Numero 6: %d \n", dado.getValor6());
		System.out.printf("Total de veces: %d + %d + %d + %d + %d + %d = %d ", dado.getValor1(), dado.getValor2(),
				dado.getValor3(), dado.getValor4(), dado.getValor5(), dado.getValor6(),
				(dado.getValor1() + dado.getValor2() + dado.getValor3() + dado.getValor4() + dado.getValor5()
						+ dado.getValor6()));

	}

}
