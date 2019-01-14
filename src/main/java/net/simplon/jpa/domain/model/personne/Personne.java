package net.simplon.jpa.domain.model.personne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import net.simplon.jpa.domain.model.pays.Pays;

/*	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
    @Size(min=2, max=30)
	private String libelle;*/

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String name;

	@NotNull
	private String surname;

	@NotNull
	@ManyToOne
	// @JoinColumn(name="CodePays")
	private Pays pays;

	protected Personne() {
	}

	public Personne(@NotNull String name, @NotNull String surname, @NotNull Pays pays) {
		this.name = name;
		this.surname = surname;
		this.pays = pays;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
