package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import jim.classes.Outils;
import jim.classes.Utilisateur;

public class UtilisateurTest {
	
	private Utilisateur utilisateur1;
	private Utilisateur utilisateur2;
	
	@Before
	public void setUp() throws Exception {
		utilisateur1 = new Utilisateur();
		
		int unId = 111;
		String unPseudo = "toto";
		String unMdpSha1 = "abcdef";
		String uneAdrMail = "toto@free.fr";
		String unNumTel = "1122334455";
		int unNiveau = 1;
		Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
		int unNbTraces = 3;
		Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
		utilisateur2 = new Utilisateur(unId, unPseudo, unMdpSha1, uneAdrMail, unNumTel, unNiveau, uneDateCreation, unNbTraces, uneDateDerniereTrace);
	}

	@Test
	public void testGetId() {
		assertEquals("Test getId", 111, utilisateur2.getId());
	}

	@Test
	public void testSetId() {
		utilisateur1.setId(112);
		
		assertEquals("test getId", 112, utilisateur1.getId());
	}

	@Test
	public void testGetPseudo() {
		assertEquals("Test getPseudo", "toto", utilisateur2.getPseudo());
	}

	@Test
	public void testSetPseudo() {
		utilisateur1.setPseudo("Deus");
		
		assertEquals("test getPseudo", "Deus", utilisateur1.getPseudo());
	}

	@Test
	public void testGetMdpSha1() {
		assertEquals("Test getMdpSha1", "abcdef", utilisateur2.getMdpSha1());
	}

	@Test
	public void testSetMdpSha1() {
		utilisateur1.setMdpSha1("123456");
		assertEquals("Test setMdpSha1", "123456", utilisateur1.getMdpSha1());
	}

	@Test
	public void testGetAdrMail() {
		assertEquals("test getAdrMail", "toto@free.fr", utilisateur2.getAdrMail());
	}

	@Test
	public void testSetAdrMail() {
		utilisateur1.setAdrMail("toto1@free.fr");
		
		assertEquals("test getAdrMail", "toto1@free.fr", utilisateur1.getAdrMail());
	}

	@Test
	public void testGetNumTel() {
		assertEquals("test getNumTel", "11.22.33.44.55", utilisateur2.getNumTel());
	}

	@Test
	public void testSetNumTel() {
		utilisateur1.setNumTel("1212121212");
		
		assertEquals("test gestNumTel", "12.12.12.12.12", utilisateur1.getNumTel());
	}

	@Test
	public void testGetNiveau() {
		assertEquals("Test getNiveau", 1, utilisateur2.getNiveau());
	}

	@Test
	public void testSetNiveau() {
		utilisateur1.setNiveau(2);
		assertEquals("Test setNiveau", 2, utilisateur1.getNiveau());
	}

	@Test
	public void testGetDateCreation() throws ParseException {
		assertEquals("Test getDateCreation", Outils.convertirEnDateHeure("21/06/2016 14:00:00"), utilisateur2.getDateCreation());
	}

	@Test
	public void testSetDateCreation() throws ParseException {
		utilisateur1.setDateCreation(Outils.convertirEnDateHeure("10/01/2000 17:17:00"));
		assertEquals("Test getDateCreation", Outils.convertirEnDateHeure("10/01/2000 17:17:00"), utilisateur1.getDateCreation());
	}

	@Test
	public void testGetNbTraces() {
		assertEquals("test getNbTraces", 3, utilisateur2.getNbTraces());
	}

	@Test
	public void testSetNbTraces() {
		utilisateur1.setNbTraces(5);
		
		assertEquals("test getNbTraces", 5, utilisateur1.getNbTraces());
	}

	@Test
	public void testGetDateDerniereTrace() throws ParseException {
		assertEquals("Test getDateDerniereTrace", Outils.convertirEnDateHeure("28/06/2016 14:00:00"), utilisateur2.getDateDerniereTrace());
	}

	@Test
	public void testSetDateDerniereTrace() throws ParseException {
		utilisateur1.setDateDerniereTrace(Outils.convertirEnDateHeure("10/01/2000 17:17:00"));
		assertEquals("Test getDateDerniereTrace", Outils.convertirEnDateHeure("10/01/2000 17:17:00"), utilisateur1.getDateDerniereTrace());
	}

	@Test
	public void testToString() {
		String msg = "";
	    msg += "id : " + "0" + "\n";
	    msg += "pseudo : " + "" + "\n";
	    msg += "mdpSha1 : " + "" + "\n";
	    msg += "adrMail : " + "" + "\n";
	    msg += "numTel : " + "" + "\n";
	    msg += "niveau : " + "0" + "\n";
	    msg += "nbTraces : " + "0" + "\n";
	    assertEquals("Test toString", msg, utilisateur1.toString());
	    
		msg = "";
	    msg += "id : " + "111" + "\n";
	    msg += "pseudo : " + "toto" + "\n";
	    msg += "mdpSha1 : " + "abcdef" + "\n";
	    msg += "adrMail : " + "toto@free.fr" + "\n";
	    msg += "numTel : " + "11.22.33.44.55" + "\n";
	    msg += "niveau : " + "1" + "\n";
	    msg += "dateCreation : " + "21/06/2016 14:00:00" + "\n";
	    msg += "nbTraces : " + "3" + "\n";
	    msg += "dateDerniereTrace : " + "28/06/2016 14:00:00" + "\n";
	    assertEquals("Test toString", msg, utilisateur2.toString());
	}

}
