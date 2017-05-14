package asw.springboot.rest.s2;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam; 

import javax.annotation.PostConstruct;

@RestController
public class S2Controller {

	/* mappa delle info dei vari artisti */
	private Map<String, Collection<String>> album_map;
	private Map<String, Collection<String>> album_info;
	private Map<String, Collection<String>> generic_album_info;


	@PostConstruct
	public void init() {
		/* inizializza la mappa delle info */
		album_info = new HashMap<>();
		generic_album_info = new HashMap<>();
		album_map = new HashMap<>();
		
		album_map.put("Queen", new ArrayList<>());
		album_map.put("Pink Floyd", new ArrayList<>());
		album_map.put("Genesis", new ArrayList<>());
		album_map.put("Rolling Stones", new ArrayList<>());
		album_map.put("Led Zeppelin", new ArrayList<>());
		album_map.put("Beatles", new ArrayList<>());
		album_map.put("Deep Purple", new ArrayList<>());
		
		generic_album_info.put("Queen", new ArrayList<>());
		generic_album_info.put("Pink Floyd", new ArrayList<>());
		generic_album_info.put("Genesis", new ArrayList<>());
		generic_album_info.put("Rolling Stones", new ArrayList<>());
		generic_album_info.put("Led Zeppelin", new ArrayList<>());
		generic_album_info.put("Beatles", new ArrayList<>());
		generic_album_info.put("Deep Purple", new ArrayList<>());
		
		
		generic_album_info.get("Queen").add("pubblicato 40 album");
		generic_album_info.get("Queen").add("venduto circa 300 milioni di dischi");
		generic_album_info.get("Queen").add("La loro prima raccolta del 1981, Greatest Hits, risulta l'album più acquistato in assoluto in Inghilterra");

		generic_album_info.get("Pink Floyd").add("pubblicato 32 album");
		generic_album_info.get("Pink Floyd").add("venduto piu' di 250 milioni di dischi");

		generic_album_info.get("Genesis").add("pubblicato 29 album");
		generic_album_info.get("Genesis").add("venduto più di 150 milioni di dischi in tutto il mondo");
		
		generic_album_info.get("Rolling Stones").add("pubblicato 33 album");
		
		generic_album_info.get("Led Zeppelin").add("pubblicato 22 album");
		generic_album_info.get("Led Zeppelin").add("venduto oltre 300 milioni di dischi");

		generic_album_info.get("Beatles").add("pubblicato 23 album");
		generic_album_info.get("Beatles").add("venduto un totale di circa 600 milioni di dischi");

		generic_album_info.get("Deep Purple").add("pubblicato 20 album in studio");
		generic_album_info.get("Deep Purple").add("venduto più di 100 milioni di disch");

		album_map.get("Queen").add("Innuendo");
		album_map.get("Queen").add("Queen");
		album_map.get("Queen").add("A Night at the Opera");

		album_map.get("Pink Floyd").add("The Dark Side of the Moon");
		album_map.get("Pink Floyd").add("Animals");
		album_map.get("Pink Floyd").add("The Wall");

		album_map.get("Genesis").add("Trespass");
		album_map.get("Genesis").add("Foxtrot");
		album_map.get("Genesis").add("Duke");

		album_map.get("Rolling Stones").add("Aftermath");
		album_map.get("Rolling Stones").add("Flowers");
		album_map.get("Rolling Stones").add("Sticky Fingers");

		album_map.get("Led Zeppelin").add("Led Zeppelin");
		album_map.get("Led Zeppelin").add("Physical Graffiti");
		album_map.get("Led Zeppelin").add("Presence");

		album_map.get("Beatles").add("Revolver");
		album_map.get("Beatles").add("Abbey Road");
		album_map.get("Beatles").add("Let It Be");
		
		album_map.get("Deep Purple").add("Fireball");
		album_map.get("Deep Purple").add("Machine Head");
		album_map.get("Deep Purple").add("Burn");

		// DA COMPLETARE CON IL RESTO DEGLI ALBUM
		album_info.put("Innuendo", new ArrayList<>());
		album_info.put("Queen", new ArrayList<>());
		album_info.put("A Night at the Opera", new ArrayList<>());
		
		album_info.get("Innuendo").add("è il 14esimo album in studio");
		
		/*album_info.put("Innuendo", "è il 14esimo album in studio");
		album_info.put("Innuendo", "la copertina è ispirata alle illustrazioni di J.J. Grandville");
		album_info.put("Innuendo", "è stato votato come il 94º miglior album di tutti i tempi, in un sondaggio effettuato dalla BBC nel 2006");
*/
		album_info.get("Queen").add("pubblicato nel 1973 dall'etichetta discografica EMI");

	/*	album_info.put("Queen", "pubblicato nel 1973 dall'etichetta discografica EMI");
		album_info.put("Queen", "è il primo album in studio");*/
		
		album_info.get("A Night at the Opera").add("è il quarto album in studio della band");


	/*	album_info.put("A Night at the Opera", "è il quarto album in studio della band");
		album_info.put("A Night at the Opera", "è stato inserito nella posizione numero 231 della Lista dei 500 migliori album secondo Rolling Stone");
*/
		

		album_info.put("The Dark Side of the Moon", new ArrayList<>());
		album_info.put("Animals", new ArrayList<>());
		album_info.put("The Wall", new ArrayList<>());
		
		album_info.get("The Dark Side of the Moon").add("è l'ottavo album in studio della band");

		
	/*	album_info.put("The Dark Side of the Moon", "è l'ottavo album in studio");
		album_info.put("The Dark Side of the Moon", "l'album rappresenta l'approdo di numerose sperimentazioni musicali che i Pink Floyd andavano da tempo operando sia nei loro concerti che nelle registrazioni");
*/
		
		album_info.get("Animals").add("è il decimo album in studio della band");

/*		album_info.put("Animals", "è il decimo album della band");
		album_info.put("Animals", "è un concept album che fornisce una critica feroce alle condizioni socio-politiche del Regno Unito degli anni settanta" );
*/
		album_info.get("The Wall").add("è l'undicesimo album in studio della band");

	/*	album_info.put("The Wall", "è l'undicesimo album in studio della band" );
		album_info.put("The Wall", "si tratta di un'opera rock incentrata sulla storia di un personaggio fittizio: una rockstar di nome Pink che, a causa di una serie di traumi psicologici, arriva a costruirsi un muro mentale attorno ai propri sentimenti dietro al quale si isola" );
*/
		
		
		album_info.put("Trespass", new ArrayList<>());
		album_info.put("Foxtrot", new ArrayList<>());
		album_info.put("Duke", new ArrayList<>());
		
		album_info.get("Trespass").add("è il secondo album in studio della band");

		
	/*	album_info.put("Trespass", "è il secondo album in studio della band" );
		album_info.put("Trespass", "l'album vede la formazione incidere per una nuova etichetta discografica, la Charisma, con cui i Genesis pubblicheranno sino al 1981" );
*/
		album_info.get("Foxtrot").add("è il quarto album in studio della band");

		
		/*album_info.put("Foxtrot", "è il quarto album in studio della band" );
		album_info.put("Foxtrot", "nel giugno del 2015 la rivista Rolling Stone ha collocato l'album alla 14esima posizione dei 50 migliori album progressive di tutti i tempi" );
*/
		
		album_info.get("Duke").add("è il decimo album in studio della band");

	/*	album_info.put("Duke", "è il decimo album in studio della band" );
		album_info.put("Duke", "ha 12 tracce");*/

		album_info.put("Aftermath", new ArrayList<>());
		album_info.put("Flowers", new ArrayList<>());
		album_info.put("Sticky Fingers", new ArrayList<>());
		
		album_info.get("Aftermath").add("fu il primo con tutte le canzoni composte dalla coppia Jagger/Richards");

		
	/*	album_info.put("Aftermath", "fu il primo con tutte le canzoni composte dalla coppia Jagger/Richards" );
		album_info.put("Aftermath", "ha 14 tracce");*/
		
		album_info.get("Flowers").add("è il decimo album pubblicato dalla band");

		
	/*	album_info.put("Flowers", "è il decimo album pubblicato dalla band" );
		album_info.put("Flowers", "ha 12 tracce" );*/
		
		album_info.get("Sticky Fingers").add("ha 10 tracce");

		
		/*album_info.put("Sticky Fingers", "raggiunse il numero 1 sia nella classifica inglese, sia in quella statunitense, rimanendovi rispettivamente per cinque e quattro settimane" );
		album_info.put("Sticky Fingers", "10 tracce" );*/

		album_info.put("Led Zeppelin", new ArrayList<>());
		album_info.put("Physical Graffiti", new ArrayList<>());
		album_info.put("Presence", new ArrayList<>());
		
		album_info.get("Led Zeppelin").add("ha 9 tracce");

		
	/*	album_info.put("Led Zeppelin", "è il primo album pubblicato dalla band");
		album_info.put("Led Zeppelin", "ha 9 tracce" );*/
		
		album_info.get("Physical Graffiti").add("ha 15 tracce");

		
	/*	album_info.put("Physical Graffiti", "è il sesto album pubblicato dalla band" );
		album_info.put("Physical Graffiti", "15 tracce" );*/
		
		album_info.get("Presence").add("ha 7 tracce");

/*		album_info.put("Presence", "è il settimo album pubblicato dalla band" );
		album_info.put("Presence", "ha 7 tracce" );*/
		

		album_info.put("Revolver", new ArrayList<>());
		album_info.put("Abbey Road", new ArrayList<>());
		album_info.put("Let It Be", new ArrayList<>());
		
		album_info.get("Revolver").add("ha 14 tracce");

/*
		album_info.put("Revolver", "è il settimo album pubblicato dalla band" );
		album_info.put("Revolver", "ha 14 tracce" );*/
		
		album_info.get("Abbey Road").add("ha 17 tracce");

		
	/*	album_info.put("Abbey Road", "è il decimo album pubblicato dalla band" );
		album_info.put("Abbey Road", "ha 17 tracce" );*/
		
		album_info.get("Let It Be").add("ha 12 tracce");

		
/*		album_info.put("Let It Be", "è l'undicesimo e ultimo album nella discografia inglese del gruppo musicale" );
		album_info.put("Let It Be", "ha 12 tracce" );
		*/
		
		album_info.put("Fireball", new ArrayList<>());
		album_info.put("Machine Head", new ArrayList<>());
		album_info.put("Burn", new ArrayList<>());
		
		album_info.get("Fireball").add("ha 7 tracce");

		/*
		album_info.put("Fireball", "è il quinto album della band" );
		album_info.put("Fireball", "ha 7 tracce" );*/
		
		album_info.get("Machine Head").add("ha 7 tracce");

		/*
		album_info.put("Machine Head", "è il sesto album della band" );
		album_info.put("Machine Head", "ha 7 tracce" );*/
		
		album_info.get("Burn").add("ha 8 tracce");

		
	/*	album_info.put("Burn", "è l'ottavo album della band" );
		album_info.put("Burn", "ha otto tracce" );*/

		
	}
	
	//------------------------------------------------------------------------------------------------------------
	// DA MODIFICARE PER S2 TUTTO CIO' CHE SEGUE,
	//------------------------------------------------------------------------------------------------------------

	/* Restituisce info generiche su tutti gli album dell'{artista} specificato */
	@RequestMapping("/S2/{artista}")
	public String artista(@PathVariable String artista) {
		
		if(album_map.containsKey(artista))
			return (String)generic_album_info.get(artista).toArray()[random(artista)];
		else return "fail";
	}
	@RequestMapping("/S2/{artista}/{album}")
	public String album(@PathVariable String artista, @PathVariable String album) {
		String response = new String();
		if((album_map.containsKey(artista)) && album_map.get(artista).contains(album))
			 return response = (String)album_info.get(album).toArray()[randomAlbum(album)];
		else return " non è nel nostro database oppure non appartiene ai "+ artista;
	}
	
	public int random(String artista) {
		return (int) Math.floor(Math.random() * (generic_album_info.get(artista).size()));
	}
	public int randomAlbum(String artista) {
		return (int) Math.floor(Math.random() * (album_info.get(artista).size()));
	}
}
