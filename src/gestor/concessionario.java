package src.gestor;

import java.util.ArrayList;
import java.util.Objects;

public class concessionario {
	
	private String distrito;
	private ArrayList <String> marca;
	private ArrayList<Integer> pcarro;
	
	public concessionario(){
		
		this.distrito=null;
		this.pcarro=null;
		this.marca=null;
		
	}
	
	public concessionario(String distrito,ArrayList<Integer> pcarro,ArrayList<String> marca) {
		
		this.distrito=distrito;
		this.pcarro=pcarro;
		this.marca= marca;
	}
	
	public String getDistrito() {
		return distrito;
	}
	
	public void setDistrito(String  distrito) {
		this.distrito=distrito;
	}
	
	public ArrayList<Integer> getPcarro() {
		
		return pcarro;
	}
	
	public void setPcarro(ArrayList<Integer> pcarro1) {
		
		this.pcarro=pcarro1;
		
	}
	
public ArrayList<String> getMarca() {
		
		return marca;
	}
	
	public void setMarca(ArrayList<String> marca) {
		
		this.marca=marca;
		
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distrito == null) ? 0 : distrito.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		concessionario other = (concessionario) obj;
		if (distrito == null) {
			if (other.distrito != null)
				return false;
		} else if (!distrito.equals(other.distrito))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Concessionario: " + distrito + " Marcas: " + marca + ", Potencia dos Carros = " + pcarro ;
	}

	

	
	
	
	
	

}
