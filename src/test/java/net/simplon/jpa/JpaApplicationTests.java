package net.simplon.jpa;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.simplon.jpa.domain.model.pays.IPaysRepository;
import net.simplon.jpa.domain.model.pays.Pays;
import net.simplon.jpa.domain.model.personne.IPersonneRepository;
import net.simplon.jpa.domain.model.personne.Personne;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
	@Autowired
	IPaysRepository pays;
	
	@Autowired
	IPersonneRepository personnes;
	
	@Before
	public void setUp() {
		personnes.deleteAll();
		pays.deleteAll();
	}
	
	
	
	@Test
	public void createPays() {
		Pays Maroc = new Pays ("maroc");
		pays.save(Maroc);
		
		assertEquals(pays.count(), 1);
	}

	@Test
	public void CreatePerson() {
		Pays Senegal = new Pays ("Senegal");
		Personne Hawa = new Personne ("Gaye","Hawa",Senegal);
		
		pays.save(Senegal);
		personnes.save(Hawa);
		
		assertEquals(personnes.count(), 1);
	}
	
	
	
}



