package it.antonio.rubrica;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contatto {


	  @Id
	  private String id;
	  private String firstName;
	  private String lastName;

	  public Contatto() {}

	  public Contatto(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }


	  public String getId() {
	    return id;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }
	  

	  public void setId(String string) {
		this.id = string;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	  public String toString() {
	    return String.format(
	        "Contatto[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  
		
	}
	}

