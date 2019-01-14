package net.simplon.jpa.domain.model.pays;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import net.simplon.jpa.domain.model.personne.Personne;


@Entity
public class Pays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	
	@NotNull
private String name;
/*	
@OneToMany(mappedBy="pays", fetch = FetchType.LAZY)
private Collection<Personne> listPersonne;*/

	protected Pays() {
	}
public Pays(@NotNull String name) {
	this.name = name;
}
public long getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


	
	



}