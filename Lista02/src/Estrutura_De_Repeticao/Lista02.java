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

	}

	// ####################################################################
	public static void Questao04() {
		
	}

	// ####################################################################
	public static void Questao05() {
		
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
		
	}
}
