import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();

//		ejercicios.ejercicio1();
//		ejercicios.ejercicio2();
//		ejercicios.ejercicio3();
//		ejercicios.ejercicio4();
//		ejercicios.ejercicio5();
		ejercicios.ejercicio6();

	}

	public void ejercicio1() {
		int contador = 1;
		short nroEntero;
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Ingrese un numero entero");
			nroEntero = Short.parseShort(scanner.nextLine());
		} catch (Exception error) {
			System.out.println("No ingresaste un numero entero");
			return;
		}

		if (nroEntero > 0) {
			while (contador < nroEntero) {
				System.out.println(contador);
				contador++;
			}
		} else {
			while (contador > nroEntero) {
				System.out.println(contador);
				contador--;
			}
		}

	}

	public void ejercicio2() {
		String frase;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una frase e imprimiremos sus carácteres!");
		frase = scanner.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.charAt(i));
		}
	}

	public void ejercicio3() {

		int numero;
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Ingrese un numero y imprimiremos sus divisores positivos!");
			numero = Integer.parseInt(scanner.nextLine());
		} catch (Exception error) {
			System.out.println("No ingresaste un numero");
			return;
		}

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void ejercicio4() {
		String frase, fraseInvertida = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresá una frase y te la devolveremos invertida!");
		frase = scanner.nextLine();

		for (int i = 1; i <= frase.length(); i++) {
			fraseInvertida += frase.charAt(frase.length() - i);
		}

		System.out.println("La frase invertida es " + fraseInvertida);
	}

	public void ejercicio5() {
//		como hago que el valor pueda ser evitado y no cambie el resultado final?	
		int acumuladorValores = 0;
		int valorActual = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Ingresá un numero entero. Para terminar la suma, ingresá 0:");
			try {
				valorActual = Integer.parseInt(scanner.nextLine());
			} catch (Exception error) {
				System.out.println("No ingresaste un numero");
			}
			acumuladorValores += valorActual;
		} while (valorActual != 0);

		System.out.println("El total es " + acumuladorValores);
	}
	
	public void ejercicio6() {
//		Leerunnúmeroenteropositivodesdetecladoeimprimirlasumadelosdígitosquelocomponen.
		int acumuladorValores = 0;
		int valorActual = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Ingresá un numero entero. Para terminar la suma, ingresá 0:");
			try {
				valorActual = Integer.parseInt(scanner.nextLine());
			} catch (Exception error) {
				System.out.println("No ingresaste un numero");
			}
			acumuladorValores += valorActual;
		} while (valorActual != 0);

		System.out.println("El total es " + acumuladorValores);
	}

}
