import java.util.Scanner;

public class Principal {
	 
	public static Universidade [] universidades = null;
	
	 public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Mec m = new Mec();	
		int opcao = 0;
		
		 while(opcao != 3) {
			 menuGeral();
			 opcao = input.nextInt();
			 limpaBuffer(input);
			 
			 switch(opcao){
			 
			 	case 1:
			 		universidades = CadastraUniversidade();
			 	     break;
			 	     
			 	case 2:
			 		
			 		while(opcao != 4) {
			 			menuInfo();
			 			opcao = input.nextInt();
			 			limpaBuffer(input);
			 			
				 		if(universidades != null) {
					 		switch(opcao) {
						 		
						 		case 1:	
						 			m.imprimeUniversidades(universidades);
						 			break;
		
						 		case 2:
						 			m.maisCara(universidades);
						 			break; 
						 			
						 		case 3:
						 			m.universidadesDoSul(universidades);
						 			break;
						 			
						 		case 4:
						 			break;
						 			
						 		default:
						 			System.out.println("Digite uma opcao valida");
						 			break;
						 			
					 		}
					 	}
				 		else
			 				System.out.println("Primeiramente cadastre uma universidade!");			 			
			 		}
				 		break;
							
			 	case 3:
			 		
			 		System.out.println("Obrigado por usar nosso aplicativo!");
			 		System.out.println("Encerrando o aplicativo...");
			 		break;
			 		
			 	default:
			 		System.out.println("Digite uma opcao valida");
			 		
			 }
			 
		 }
	 }
	 
	 
	 public static void menuGeral() {
			
		 System.out.println("=============================== MENU GERAL ==================================");
		 System.out.println("-----------------------------------------------------------------------------");
		 System.out.println("1. Cadastrar Universidade(s)");
		 System.out.println("2. Exibir informacoes da(s) Universidade(s)");
		 System.out.println("3. Sair");
		 System.out.println("-----------------------------------------------------------------------------");
		 System.out.println("Digite uma opcao:");
		 
	}
	
	public static void menuInfo() {
		
		System.out.println("========================== MENU DE INFORMACOES ==============================");
 		System.out.println("-----------------------------------------------------------------------------");
 		System.out.println("Digite a opcao que desejar:");
 		System.out.println("1 - Exibir todas as informacoes das universidades cadastradas");
 		System.out.println("2 - Exibir as informacoes da universidade privada mais cara cadastrada");
 		System.out.println("3 - Exibir as informacoes das universidade publicas cadastradas da regiao sul");
 		System.out.println("4 - Retornar para o menu inicial");
 		System.out.println("-----------------------------------------------------------------------------");
	}
	 
	 
	//metodo que realiza toda a opcao 1 switch case : cadastro da universidade publica e privada dentro do array de universidade	 
	public static Universidade[] CadastraUniversidade() {
		int tamanho, resposta, qA, qP;
		String n, e, c;
		double vM;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de universidade voce deseja cadastrar:");
		tamanho = input.nextInt();
		Universidade universidades [] = new Universidade[tamanho];
		
		for(int i = 0; i<universidades.length; i++) {
			System.out.println("Gostaria de cadastrar universidade privada ou publica? 1- Publica  2- Privada" );
			resposta = input.nextInt();
			limpaBuffer(input);
			
			if (resposta == 1) {
				
				System.out.println("Digite o nome da universidade:");
				n = input.nextLine();
				System.out.println("Digite a quantidade total de alunos:");
				qA = input.nextInt();
				limpaBuffer(input);
				System.out.println("Digite a quantidade total de professores:");
				qP = input.nextInt();
				limpaBuffer(input);
				System.out.println("Digite o estado (UF):");
				e = input.nextLine().toUpperCase();
				System.out.println("Digite a cidade:");
				c = input.nextLine();
				
				universidades [i] = new Publica(n, qA, qP, e, c);
			}
			
			else if (resposta ==2) {
			
				System.out.println("Digite o nome da universidade:");
				n = input.nextLine();
				System.out.println("Digite a quantidade total de alunos:");
				qA = input.nextInt();
				limpaBuffer(input);
				System.out.println("Digite a quantidade total de professores:");
				qP = input.nextInt();
				limpaBuffer(input);
				System.out.println("Digite o valor da mensalidade:");
				vM = input.nextDouble();
				limpaBuffer(input);
					
				universidades [i] = new Privada(n, qA, qP, vM);	
		    }	
			
			else {
				System.out.println("Digite uma opção válida!");
				i--;
			}
		}
		return universidades;	
	}
	
	
	public static void limpaBuffer(Scanner input) {
		
            input.nextLine();
    }
	
	
}
