package src.gestor;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public static void Criar(dadosC dados) {
		
		int n,i=0,pc;
		concessionario c1 = new concessionario();
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Distrito: ");
		c1.setDistrito(read.nextLine());
		
		
		System.out.print("Quantos carros tem o concessionario? ");
		n= read.nextInt();
		
		while (i<n) {
			System.out.print("Potencia do Carro "+(i+1)+": ");
			pc=read.nextInt();
			
			list.add(pc);
			
			c1.setPcarro(list);
			
			
			i++;
			
			
		}
		
		
		
		dados.addConcessionario(c1);
		
		
		
		
		System.out.println(c1.getDistrito());
		System.out.println("Potencia dos carros "+c1.getPcarro());
		
		}
	
	public static int Consulta(dadosC dados) {
		
		 int pos=0;
	        Scanner read= new Scanner(System.in);
	        concessionario c1 =new concessionario();
	        
	        
	        
	        System.out.print("Distrito: ");
	        c1.setDistrito(read.nextLine());
	        pos=dados.existe(c1);
	        if (pos==-1)
	        {
	            System.out.println("esse nome não existe");
	            return(-1);
	        }
	        else
	        {
	            c1=dados.getDados(pos);
	            System.out.println(c1.toString());
	            return(pos); 
	        }
	}
	
			
	
	
	
	public static void main(String[] args) {
		
		int opc;
		Scanner read = new Scanner(System.in);
		
		dadosC newdados = new dadosC();
		
		do {
			
			menu();
			opc = read.nextInt();
			
			switch (opc) {
			case 1:
				Criar(newdados);
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				Consulta(newdados);
				break;
			case 5:
				break;
			case 6:
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
