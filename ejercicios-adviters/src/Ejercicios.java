import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();

//		ejercicios.ejercicio1();
//		ejercicios.ejercicio2();
//		ejercicios.ejercicio3();
//		ejercicios.ejercicio4();
//		ejercicios.ejercicio5();
//		ejercicios.ejercicio6();
//		ejercicios.ejercicio7();
//		ejercicios.ejercicio8();
//		ejercicios.ejercicio9();
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
		int sumaDigitos = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, ingresá un numero entero");
		String numero = scanner.nextLine();

		try {
			Integer.parseInt(numero);
		} catch (Exception error) {
			System.out.println("No ingresaste un numero entero");
			return;
		}

		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) != '-')
				sumaDigitos += Character.getNumericValue(numero.charAt(i));
		}

		System.out.println("El total de sus dígitos sumados es " + sumaDigitos);
	}

	public void ejercicio7() {

		Scanner scanner = new Scanner(System.in);
		int posicionCaracter;
		System.out.println("Por favor, ingresá una frase");
		String frase = scanner.nextLine();

		System.out.println("Por favor, ingresá un carácter a buscar");
		String caracterIngresado = scanner.nextLine();

		// verifica que sea un char
		if (caracterIngresado.length() != 1) {
			System.out.println("No ingresaste un caracter");
			return;
		}

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == caracterIngresado.charAt(0)) {
				posicionCaracter = i;
				System.out.println("El carácter " + caracterIngresado + " aparece en la posición " + i + ".");
				return;
			}
		}

	}

	public void ejercicio8() {
		Scanner scanner = new Scanner(System.in);
		int totalDigitosPares = 0, totalDigitosImpares = 0;
		String nro = "1";

		while (nro.charAt(0) != '0') {
			System.out
					.println("Por favor, ingresá un numero entero positivo.\n Para frenar la ejecución, ingresá un 0");
			nro = scanner.nextLine();

			try {
				Integer.parseInt(nro);
			} catch (Exception error) {
				System.out.println("No ingresaste un número");
				continue;
			}

			if (Integer.parseInt(nro) < 0) {
				System.out.println("No ingresaste un número positivo.");
			} else {
				int contadorPares = 0, contadorImpares = 0;
				for (int i = 0; i < nro.length(); i++) {
					if (Character.getNumericValue(nro.charAt(i)) % 2 == 0) {
						contadorPares++;
					} else {
						contadorImpares++;
					}
				}
				System.out.println(nro + " contiene " + contadorPares + " digitos pares y " + contadorImpares
						+ " digitos impares.");
				totalDigitosImpares += contadorImpares;
				totalDigitosPares += contadorPares;
			}
		}

		System.out.println(
				"El total de digitos pares son " + totalDigitosPares + " y de impares son " + totalDigitosImpares);

	}

	public void ejercicio9() {
		// Escribirunprogramaquesoliciteelingresodeunacantidadindeterminadadenúmerosmayoresque1,finalizandocuandoserecibauncero.Imprimirlacantidaddenúmerosprimosingresados.
		int nroIngresado = 1, contadorPrimos =0;
		Scanner scanner = new Scanner(System.in);
		
		while (nroIngresado != 0) {
			System.out.println("ingresá un numero positivo.\nLa ejecución termina cuando ingreses un 0.");
			
			try {
			nroIngresado = Integer.parseInt(scanner.nextLine());
			} catch (Exception error) {
				System.out.println("No ingresaste un número.");
				continue;
			}
			
			if(nroIngresado < 0) {
				System.out.println("El numero no es positivo");
				continue;
			}
			
			if(esPrimo(nroIngresado)) {
				contadorPrimos++;
				System.out.println(nroIngresado + " es primo.");
			}
			
		}
		
		System.out.println("El total de números primos es " + contadorPrimos);
	}

	static boolean esPrimo(int nro) {

		if (nro <= 1)
			return false;

		for (int i = 2; i <= nro / 2; i++) {
			if ((nro % i) == 0)
				return false;
		}

		return true;

	}

}
