package lt.bit.tiekimas;

import java.util.LinkedList;
import java.util.List;

public class Tiekejas {
	  
	  private int id;
	  private String vardas;
	  private String pavarde;
	  private String elPastas;
	  private List<Integer> patiekta = new LinkedList<>();
	  	  
	  public Tiekejas(int id, String vardas, String pavarde, String elPastas) {
	    this.id = id;
	    this.vardas = vardas;
	    this.pavarde = pavarde;
	    this.elPastas = elPastas;
	  }

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVardas() {
		return vardas;
	}


	public void setVardas(String vardas) {
		this.vardas = vardas;
	}


	public String getPavarde() {
		return pavarde;
	}


	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}


	public String getElPastas() {
		return elPastas;
	}


	public void setElPastas(String elPastas) {
		this.elPastas = elPastas;
	}


	public List<Integer> getPatiekta() {
		return patiekta;
	}


	public void setPatiekta(List<Integer> patiekta) {
		this.patiekta = patiekta;
	}


	@Override
	  public String toString() {
	    return "Tiekejas [id=" + id + ", vardas=" + vardas + ", pavarde=" + pavarde + ", elPastas="
	        + elPastas + ", patiekta=" + patiekta + "]";
	  } 
}