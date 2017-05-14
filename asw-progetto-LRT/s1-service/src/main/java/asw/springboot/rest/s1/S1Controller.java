package asw.springboot.rest.s1;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam; 

import javax.annotation.PostConstruct;

@RestController
public class S1Controller {

	/* mappa delle info dei vari artisti */
	private Map<String, Collection<String>> info;

	@PostConstruct
	public void init() {
		/* inizializza la mappa delle info */
		info = new HashMap<>();
		
		info.put("Queen", new ArrayList<>());
		info.put("Pink Floyd", new ArrayList<>());
		info.put("Genesis", new ArrayList<>());
		info.put("Rolling Stones", new ArrayList<>());
		info.put("Led Zeppelin", new ArrayList<>());
		info.put("Beatles", new ArrayList<>());
		info.put("Deep Purple", new ArrayList<>());

		info.get("Queen").add("anno di formazione 1970");
		info.get("Queen").add("avuto come frontman Freddy Mercury");
		info.get("Queen").add("avuto la EMI come casa discografica");
		info.get("Queen").add("formazione storica: Freddy Mercury, Brian May, Roger Taylor, John Deacon");
		info.get("Queen").add("paese d'origine Regno Unito");

		info.get("Pink Floyd").add("anno di formazione 1967");
		info.get("Pink Floyd").add("avuto la EMI e la Sony Music come case discografiche");
		info.get("Pink Floyd").add("il rock progressivo come genere che meglio definisce la loro opera");
		info.get("Pink Floyd").add("formazione storica: Roger Waters, Davis Gilmour, Richard Wright e Nick Mason");
		info.get("Pink Floyd").add("paese d'origine Regno Unito");

		info.get("Genesis").add("anno di formazione 1967");
		info.get("Genesis").add("genere rock progressivo");
		info.get("Genesis").add("formazione che li ha resi celebri: Peter Gabriel, Phil Collins, Tony Banks, Mike Rutherford e Steve Hackett");
		info.get("Genesis").add("paese d'origine Regno Unito");

		info.get("Rolling Stones").add("anno di formazione 1962");
		info.get("Rolling Stones").add("genere rock 'n roll");
		info.get("Rolling Stones").add("formazione storica: Mick Jagger, Keith Richards, Ronnie Wood e Charlie Watts");
		info.get("Rolling Stones").add("scelto il titolo di una canzone di Muddy Waters come nome del loro gruppo");
		info.get("Rolling Stones").add("Brian Jones tra i fondatori del gruppo");
		info.get("Rolling Stones").add("paese d'origine Regno Unito");

		info.get("Led Zeppelin").add("anno di formazione 1968");
		info.get("Led Zeppelin").add("formazione storica: Robert Plant, Jimmy Page, John Paul Jones e John Bonham");
		info.get("Led Zeppelin").add(", nella classifica stilata da Rolling Stones nel 2003, il 14 posto tra i 100 musicisti più importanti di tutti i tempi");
		info.get("Led Zeppelin").add("avuto tra le loro etichette discografiche l'Atlantic Records");
		info.get("Led Zeppelin").add("paese d'origine Regno Unito");

		info.get("Beatles").add("anno di formazione 1960");
		info.get("Beatles").add("formazione storica: John Lennon, Paul McCartney, Ringo Starr e George Harrison ");
		info.get("Beatles").add("genere pop rock");
		info.get("Beatles").add("paese d'origine Inghilterra");
		info.get("Beatles").add("suonato per l'ultima volta dal vivo il 30 gennaio 1969");
		
		info.get("Deep Purple").add("anno di formazione 1968");
		info.get("Deep Purple").add("paese d'origine Inghilterra");
		info.get("Deep Purple").add("genere hard rock");
		info.get("Deep Purple").add("formazione storica: Ian Gillan, Steve Morse, Don Airey, Roger Glover e Ian Paice");
		info.get("Deep Purple").add("il primato di band più rumorosa del mondo");
		
	}

	/* Restituisce info generiche sull'{artista} specificato */
	@RequestMapping("/S1/{artista}")
	public String artista(@PathVariable String artista) {
		
		if(info.containsKey(artista))
			return (String)info.get(artista).toArray()[random(artista)];
		else
			return "fail";
	}
	
	public int random(String artista) {
		return (int) Math.floor(Math.random() * (info.get(artista).size()));
	}
}
