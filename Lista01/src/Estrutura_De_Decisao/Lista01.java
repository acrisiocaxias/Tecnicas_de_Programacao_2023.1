package Estrutura_De_Decisao;
import java.util.Scanner;
public class Lista01 {
	public static void main(String[] args) {
		
		Menu();
		
	}
	
	public static void Menu() {
		System.out.println("Informe a quest�o que deseja execultar :");
		Scanner ler = new Scanner(System.in);
		int questao = ler.nextInt();
		
		if(questao == 1) {
			Questao01();
			Menu();
		}
		if(questao == 2) {
			Questao02();
			Menu();
		}
		if(questao == 3) {
			Questao03();
			Menu();
		}
		if(questao == 4) {
			Questao04();
			Menu();
		}
		if(questao == 5) {
			Questao05();
			Menu();
		}
		if(questao == 6) {
			Questao06();
			Menu();
		}
		if(questao == 7) {
			Questao07();
			Menu();
		}
		if(questao == 8) {
			Questao08();
			Menu();
		}
		if(questao == 9) {
			Questao09();
			Menu();
		}
		if(questao == 10) {
			Questao10();
			Menu();
		}
		if(questao == 11) {
			Questao11();
			Menu();
		}
		if(questao == 12) {
			Questao12();
			Menu();
		}
		if(questao == 13) {
			Questao13();
			Menu();
		}


	}
	
//####################################################################
	public static void Questao01() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// Inicio estrutura
		if (A > 10) {
			System.out.println("A>B");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("Numero n�o valido !!!");
			}
		}
	}

	// ####################################################################
	public static void Questao02() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();



		// Inicio estrutura
		if (A < 10) {
			System.out.println("A < 10");
			if (A + B == 20) {
				System.out.println("A + B == 20");
			}
		} else {
			System.out.println("Numero n�o v�lido !!!");
		}

	}

	// ####################################################################
	public static void Questao03() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 

		if (A == 10) {
			System.out.println("A == 10");
			if ((A + B) == 20) {
				System.out.println("A + B == 20");
			}
		}
		if (B == 10) {
			System.out.println("B == 10");
		}
	}

	// ####################################################################
	public static void Questao04() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 

		if (A > 10 || (A + B) == 20) {

			System.out.println("N�mero Valido !!!");
		} else if (A == B) {
			System.out.println("A � igual B; A e B s�o\r\n" + "diferentes de 10; A � menor Que 10");
		} else {
			System.out.println("Numero Invalido !!!");
		}
	}

	// ####################################################################
	public static void Questao05() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		
//Inicio estrutura		 
		if (A > 10 || (A + B) == 20) {
			System.out.println("N�meros Validos !!!");
		}
		if (A < 10 || (A + B) != 20) {
			System.out.println("N�meros n�o validos !!!");
		}
	}

	// ####################################################################
	public static void Questao06() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 
		if (A > 10) {
			System.out.println("A>10");
		} else {
			System.out.println("A <= 10");
		}
		if (A + B == 20) {
			System.out.println("A + B = 20");
		} else {
			System.out.println("A + B != 20");
		}
	}

	// ####################################################################
	public static void Questao07() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura	

		if (A > 10 || A + B == 20) {
			System.out.println("Numeros Validos !!");
		} else {
			System.out.println("Numeros n�o validos !!!");
		}

	}

	// ####################################################################
	public static void Questao08() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 

		if (A > 10) {

			System.out.println("A > 10");
			if (A + B == 20) {
				System.out.println("A + B == 20");
			}
		} else {
			System.out.println("Numero Invalido");
		}
	}

	// ####################################################################
	public static void Questao09() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 
		if (A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero n�o valido !!!");
		}
	}

	// ####################################################################
	public static void Questao10() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 
		if (A > 10) {

		} else {
			System.out.println("N�mero menor Que 10");
		}
		if (A + B == 20) {

		} else {
			System.out.println("N�mero diferente de 20");
		}
	}

	// ####################################################################
	public static void Questao11() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		

//Inicio estrutura		 
		if (A > 10) {

		} else if (A + B == 20) {
			System.out.println("A+B==20");
		}
		if (A < 10 && A + B != 20) {
			System.out.println("N�mero n�o valido !!!");
		}
	}

	// ####################################################################
	public static void Questao12() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		
//Inicio estrutura	
		if (A > 10) {
			System.out.println("A>10");
		} else if (A + B == 20) {
			System.out.println("A+B==20");
		} else {
			System.out.println("Numeros n�o validos !!!");
		}

		System.out.println("Sejam bem vindos a disciplina de tecnicas de programa��o");
	}

	// ####################################################################
	public static void Questao13() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		
//Inicio estrutura		
		if (A > 10) {
			System.out.println("A>10");
			if (A + B == 20) {
				System.out.println("A+B==20");
			}
		} else {
			System.out.println("N�meros n�o validos !!!");
		}
	}
}
