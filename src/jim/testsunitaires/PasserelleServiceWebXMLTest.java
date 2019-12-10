

package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.Point;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class PasserelleServiceWebXMLTest {
	
	@Test
	public void testConnecter() {
		String msg = PasserelleServicesWebXML.connecter("admin", "adminnnnnnnn");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXML.connecter("admin", Outils.sha1("mdpadmin"));
		assertEquals("Administrateur authentifiÃ©.", msg);
		
		msg = PasserelleServicesWebXML.connecter("europa", Outils.sha1("mdputilisateur"));
		assertEquals("Utilisateur authentifiÃ©.", msg);
	}
		
	@Test
	public void testCreerUnUtilisateur() {
		String msg = PasserelleServicesWebXML.creerUnUtilisateur("jim", "delasalle.sio.eleves@gmail.com", "1122334455");
		assertEquals("Erreur : pseudo trop court (8 car minimum) ou déjà existant.", msg);
		
		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasalle.sio.elevesgmail.com", "1122334455");
		assertEquals("Erreur : adresse mail incorrecte ou déjà existante.", msg);

		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasalle.sio.eleves@gmailcom", "1122334455");
		assertEquals("Erreur : adresse mail incorrecte ou déjà existante.", msg);
		
		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasalle.sio.eleves@gmail.com", "1122334455");
		assertEquals("Erreur : adresse mail incorrecte ou déjà existante.", msg);
		
		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasallesioeleves@gmail.com", "1122334455");
		assertEquals("Enregistrement effectué ; vous allez recevoir un courriel avec votre mot de passe.", msg);
		
		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "de.la.salle.sio.eleves@gmail.com", "1122334455");
		assertEquals("Erreur : pseudo trop court (8 car minimum) ou déjà existant.", msg);	
	}

	
	@Test
	public void testSupprimerUnUtilisateur() {
		fail("Not yet implemented");	
	}
	
	@Test
	public void testChangerDeMdp() {
		fail("Not yet implemented");
	}	

	@Test
	public void testDemanderMdp() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDemanderUneAutorisation() {
		fail("Not yet implemented");	
	}	
	
	@Test
	public void testRetirerUneAutorisation() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnvoyerPosition() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testDemarrerEnregistrementParcours() {
		fail("Not yet implemented");
	}

	@Test
	public void testArreterEnregistrementParcours() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSupprimerUnUnParcours() {
		fail("Not yet implemented");
	}
	
} // fin du test
