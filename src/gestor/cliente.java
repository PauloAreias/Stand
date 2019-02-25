package src.gestor;

import java.util.ArrayList;
import java.util.Objects;

public class cliente {
	
	private String name;
	private String idade;
	private String data;
	private String adress;
	
	public cliente(){
		
		this.name=null;
		this.idade=null;
		this.data=null;
		this.adress=null;
		
	}
	
	public cliente(String name,String idade,String data, String adress) {
		
		this.name=name;
		this.idade=idade;
		this.data=data;
		this.adress=adress;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String  nome) {
		this.name=nome;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String  morada) {
		this.adress=morada;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String  age) {
		this.idade=age;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String  data) {
		this.data=data;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		cliente other = (cliente) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "cliente [name=" + name + ", idade=" + idade + ", data=" + data + ", adress=" + adress + "]";
	}
	
	
	
	
	
	
}