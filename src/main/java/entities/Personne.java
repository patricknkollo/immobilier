package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personid;
	@Column(length = 255)
	private String vorname;
	@Column(length = 255)
	private String name;
	@ManyToOne
	private long adresseid;
	
	public Personne(long personid, String vorname, String name, long adressid) {
		super();
		this.personid = personid;
		this.vorname = vorname;
		this.name = name;
		this.adresseid= adressid;
	}

	public Personne(String vorname, String name, long adressid) {
		super();
		this.vorname = vorname;
		this.name = name;
		this.adresseid= adressid;
	}

	public Personne() {
		super();
	}

	public long getPersonid() {
		return personid;
	}

	public void setPersonid(long personid) {
		this.personid = personid;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public long getAdresseid() {
		return adresseid;
	}

	public void setAdresseid(long adresseid) {
		this.adresseid = adresseid;
	}

	@Override
	public String toString() {
		return "Personne [personid=" + personid + ", " + (vorname != null ? "vorname=" + vorname + ", " : "")
				+ (name != null ? "name=" + name : "") + (adresseid != 0 ? "adresseid=" + adresseid : "") + "]";
	}
	
	
	
}
