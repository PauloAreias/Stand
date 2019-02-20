package gestor;

import java.util.ArrayList;
import java.util.Scanner;

public class gestor {
	
	public static void menu() {
		
		System.out.println( "========== GESTOR DE AUTOMOVEIS ==========" ) ;  
        System.out.println( "Menu: " ) ;  
        System.out.println( "1 - Registar Concessionario" ) ;  
        System.out.println( "2 - Registar Cliente " ) ;  
        System.out.println( "3 - Registar Carro de demonstração " ) ; 
        System.out.println( "4 - Consultar Concessionario" ) ;  
        System.out.println( "5 - Consultar Cliente " ) ;  
        System.out.println( "6 - Consultar Carros de demonstração");
        System.out.println( "0 - Sair" ) ; 
       
        
        
        System.out.print( "Digite a opção pretendida: " );
		
	}
	
	public static void Criar() {
		
		String n ;
		concessionario c1 = new concessionario();
		Scanner read = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		System.out.print("Distrito: ");
		n= read.nextLine();
		c1.setDistrito(n);
		
		list.add(n);
		
		
		
		System.out.println("1) "+ list);
		
		}
	
	
			
	
	
	
	public static void main(String[] args) {
		
		int opc;
		Scanner read = new Scanner(System.in);
		
		do {
			
			menu();
			opc = read.nextInt();
			
			switch (opc) {
			case 1:
				Criar();
				
				break;
			case 2:
				break;
			case 0:
				break;
			default:		
				
				System.out.println( " " ) ;
                System.out.println( "Erro! Opção escolhida não existe!" ) ;  
                System.out.println( " " ) ;
                break ;  
			}
			
		}while(opc!=0);
		
	}

}
