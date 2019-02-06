package gestor;

public class dadosC {

	private concessionario lista[]= new concessionario[18];
	private int contador;
	
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
			lista[pos].setPcarro(0);
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
	
	
	
	
	
	
	
}
