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
        System.out.println( "3 - Consultar Concessionario" ) ;  
        System.out.println( "4 - Consultar Cliente " ) ;  
        System.out.println( "5 - Test Drive");
        System.out.println( "0 - Sair" ) ; 
       
        
        
        System.out.print( "Digite a opção pretendida: " );
		
	}
	
	public static void Criar(dadosC dados) {
		
		int n,i=0,pc;
		String m;
		concessionario c1 = new concessionario();
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList <String> list2 = new ArrayList<>();
		
		System.out.print("Digite o Distrito onde vai criar o concessionario: ");
		c1.setDistrito(read.nextLine());
		
		System.out.print("Quantos carros de Test Drive vai ter? (máx: 5): ");
		n= read.nextInt();
		if (n<=5 || n>0) {
			while (i<n) {
				System.out.println("Marcas dos carros sem espaços (ex:. Land-Rover)");
				System.out.print("Marca do Carro "+(i+1)+": ");
				m=read.next();
				list2.add(m);
				c1.setMarca(list2);
				
				System.out.print("Potencia do Carro "+(i+1)+": ");
				pc=read.nextInt();
				
				list.add(pc);
				
				c1.setPcarro(list);
				
				
				i++;
				
				
			}
			
			dados.addConcessionario(c1);
			
			System.out.println("Criado com Sucesso!");
		}
		else {
			System.out.println("OPÇÃO INVALIDA");
		}
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(c1.getDistrito());
		System.out.println("Marca dos carros "+c1.getMarca());
		System.out.println("Potencia dos carros "+c1.getPcarro());*/
		
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
	            System.out.println("esse distrito não existe");
	            return(-1);
	        }
	        else
	        {
	            c1=dados.getDados(pos);
	            System.out.println(c1.toString());
	            c1.listaTodosConcessionario();
	            return (0);
	        }
	}
	
	
	public static void CriarCliente(dadosC dados2) {
		
		cliente c1 = new cliente();
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o seu primiero e ultimo Nome: ");
		c1.setName(read.nextLine());
		
		
		System.out.print("Digite a sua Idade: ");
		c1.setIdade(read.nextLine());
		
		System.out.print("Digite a sua morada: ");
		c1.setAdress(read.nextLine());
		
		System.out.print("Data de Nascimento (ex:. 10-02-1997) ");
		c1.setData(read.nextLine());
		
		
		dados2.addCliente(c1);
		
		
		
		System.out.println("Criado com Sucesso!");
		
		}
	
	
	public static int ConsultaCliente(dadosC dados2) {
		
		 int pos=0;
	        Scanner read= new Scanner(System.in);
	        cliente c1 =new cliente();
	        
	        
	        
	        System.out.print("Nome: ");
	        c1.setName(read.nextLine());
	        pos=dados2.existe2(c1);
	        if (pos==-1)
	        {
	            System.out.println("esse nome não existe");
	            return(-1);
	        }
	        else
	        {
	            c1=dados2.getDados2(pos);
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
				CriarCliente(newdados);
				break;
			case 3:
				Consulta(newdados);
				break;
			case 4:
				ConsultaCliente(newdados);
				break;
			case 5:
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
