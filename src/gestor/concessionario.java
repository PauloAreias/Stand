package gestor;

import java.util.Objects;

public class concessionario {
	
	private String distrito;
	private int pcarro;
	
	public concessionario(){
		
		this.distrito=null;
		this.pcarro=0;
		
	}
	
	public concessionario(String distrito, String carro1,int pcarro) {
		
		this.distrito=distrito;
		this.pcarro=pcarro;
		
	}
	
	public String getDistrito() {
		return distrito;
	}
	
	public void setDistrito(String  distrito) {
		this.distrito=distrito;
	}
	
	public int getPcarro() {
		
		return pcarro;
	}
	
	public void setPcarro(int pcarro1) {
		
		this.pcarro=pcarro1;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distrito == null) ? 0 : distrito.hashCode());
		result = prime * result + pcarro;
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
		if (pcarro != other.pcarro)
			return false;
		return true;
	}

	
	
	
	

}
