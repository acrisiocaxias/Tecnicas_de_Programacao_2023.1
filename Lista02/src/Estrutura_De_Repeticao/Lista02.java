package Estrutura_De_Repeticao;
import java.util.Scanner;
public class Lista02 {
	public static void main(String[] args) {
		
		Menu();
		
	}
	
	public static void Menu() {
		System.out.println("Informe a questao que deseja execultar 1 a 10:");
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
		

	}
	
//####################################################################
	public static void Questao01() {
        System.out.println("Os numeros pares entre 1 a 100 sao :");
		for(int i=1;i<=101/2;i++) {
			
				System.out.println(i*2);
			
		}

		}
	

	// ####################################################################
	public static void Questao02() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor :");
		int soma=0;
	
		for(int i =1;i>0;i++) {
			int Cont = ler.nextInt();
			
			if(Cont>0 && Cont !=0) {
				soma += Cont;
				
			}else {
				System.out.println("Parece que você inseriu um numero negativo !");
				System.out.println("A soma dos números positivos inseridos e :"+soma);
				
				
				i = -1;
			}
			
		}
		
		
		
	}

	// ####################################################################
	public static void Questao03() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Adivinhe um numero entre 1 e 100 :");
		int numero = 20 ;
	
		for(int i =1;i>0;i++) {
			int cont = ler.nextInt();
			
			if(cont==numero) {
				System.out.println("Parabéns, você acertou o número ! ");
				i = -1;
			}else {
				System.out.println("Parece que você inseriu um número diferente, tente novamente :");
				if(cont > numero) {
					System.out.println("O número a ser adivinhado é menor que o informado ! ");
				}else if (cont<numero) {
					System.out.println("O número a ser adivinhado é maior que o informado ! ");
				}
				}
				
				
			}
			
		}

	

	// ####################################################################
	public static void Questao04() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um numero para construcao da tabela de multiplicação :");
		int algarismo = ler.nextInt();
		
		int cont =1 ;
		
		int i =10;
		while (cont<11) {
            System.out.println( cont + " x "+ algarismo+ " = "+ (cont*algarismo));
            cont++;
        }
	}

	// ####################################################################
	public static void Questao05() {
		for (int i = 0; i < 4; i++) {
			int x = 0;
			for (int j = 0; j < 5; j++) {

				System.out.println(i + " - " + j);

				
			}
		}
	}

	// ####################################################################
	public static void Questao06() {
		
	}

	// ####################################################################
	public static void Questao07() {
		

	}

	// ####################################################################
	public static void Questao08() {
		
	}

	// ####################################################################
	public static void Questao09() {
		
	}

	// ####################################################################
	public static void Questao10() {
		Scanner ler = new Scanner(System.in);
		int nlinhas, ncolunas;
		System.out.println("Informe o n�mero de linhas:");
		nlinhas = ler.nextInt();

		System.out.println("Informe o n�mero de colunas:");
		ncolunas = ler.nextInt();

		System.out.println("\n\n Forma do item A: ");
		for (int i = 0; i < nlinhas; i++) {
			for (int j = 0; j < ncolunas; j++) {

				if (i >= j) {
					System.out.print(" * ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
