package src.gestor;

import java.util.ArrayList;
import java.util.Objects;

public class concessionario {
	
	private String distrito;
	private ArrayList<Integer> pcarro;
	
	public concessionario(){
		
		this.distrito=null;
		this.pcarro=null;
		
	}
	
	public concessionario(String distrito,ArrayList<Integer> pcarro) {
		
		this.distrito=distrito;
		this.pcarro=pcarro;
		
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
		return "Concessionario: " + distrito + ", Potencia dos Carros = " + pcarro ;
	}

	

	
	
	
	
	

}
