package src.gestor;

import java.util.ArrayList;

public class dadosC {

	private concessionario lista[]= new concessionario[18];
	private int contador;
	private ArrayList <cliente> lista2 = new ArrayList<>();
	//private cliente lista2[]= new cliente[100];
	private int contador2;
	
	public dadosC(){
		
		this.contador=0;
		this.contador2=0;
		
		
	}
	
	public dadosC(ArrayList <cliente> dados2) {
		this.contador2=0;
		this.lista2=dados2;
	}
	
	/*public dadosC(cliente[] dados2) {
		this.contador2=0;
		this.lista2=dados2;
	}*/
	
	
	public dadosC(concessionario[] dados) {
		this.contador=0;
		this.lista=dados;
	}
	
	public int existe(concessionario c) {
		
		int enc=0,i=0;
		while(enc==0 && i<contador){
			if(lista[i].equals(c)) {
				enc=1;
			}
			else {
				i++;
			}
		}
		
		if (enc==1) {
			return i;
		}
		else {
			return -1;
		}
		
	}
	
	public void addConcessionario(concessionario dealer) {
		if (existe(dealer)==-1) {
			this.lista[contador]=dealer;
			contador++;
		}
		else {
			System.out.println("Concessionario já existe!");
			
		}
		
	}
	
	public void eliminarC(concessionario con) {
		int pos,i;
		pos=existe(con);
		
		if(pos==contador-1) {
			lista[pos].setDistrito(null);
			lista[pos].setPcarro(null);
		}
		
		else {
			for(i=pos;i<contador-1;i++) {
				lista[pos]=lista[pos+1];
			}
		}
		
		contador--;
	}
	
	public void atualizarC(int pos, concessionario con) {
		if (contador>=pos) {
			lista[pos]=con;
		}
	}
	
	public concessionario getDados(int pos) {
		
		if(contador>=pos) {
			return (this.lista[pos]);
		}
		else {
			return null;
		}

		
	}
	
	
	public int getNumeroC() {
		return contador;
	}
	
	
	
	
	
	
public int existe2(cliente cl) {
		
		int enc=0,i=0;
		while(enc==0 && i<contador2){
			if(lista2.get(i).equals(cl)) {
				enc=1;
			}
			else {
				i++;
			}
		}
		
		if (enc==1) {
			return i;
		}
		else {
			return -1;
		}
		
	}
	
	public void addCliente(cliente conta) {
		if (existe2(conta)==-1) {
			this.lista2.add(conta);
			contador2++;
		}
		else {
			System.out.println("Concessionario já existe!");
			
		}
		
	}
	
	public void eliminarCl(cliente cli) {
		int pos,i;
		pos=existe2(cli);
		
		if(pos==contador2-1) {
			lista2.get(pos).setName(null);
			lista2.get(pos).setData(null);
			lista2.get(pos).setAdress(null);
			lista2.get(pos).setIdade(null);
		}
		
		else {
			for(i=pos;i<contador2-1;i++) {
				cliente x,y;
				x=lista2.get(pos);
				y=lista2.get(pos+1);
			
			}
		}
		
		contador--;
	}
	
	public void atualizarCli(int pos, cliente con) {
		if (contador2>=pos) {
			con=lista2.get(pos);
		}
	}
	
	public cliente getDados2(int pos) {
		
		if(contador2>=pos) {
			return (this.lista2.get(pos));
		}
		else {
			return null;
		}

		
	}
	
	
	public int getNumeroC2() {
		return contador2;
	}
	
	
	
	
	
	
	
}
