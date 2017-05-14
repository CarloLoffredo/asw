package asw.springboot.rest.s;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@RestController
public class SController {
	
	private RestTemplate restTemplate = new RestTemplate();
   
	
	/* Restituisce info generiche sull'{artista} specificato */
	@RequestMapping("/S/{artista}")
	public String artistaS(@PathVariable String artista) {
		String info = restTemplate.getForObject("http://localhost:8081/S1/{artista}", String.class, artista);
		String infoAlbum = restTemplate.getForObject("http://localhost:8082/S2/{artista}", String.class, artista);

		if(!(info.equals("fail")))
			return "I " + artista + " hanno " + info + " e hanno " + infoAlbum ;
		else return "I " + artista + " non sono presenti nel database";
	}
	
	@RequestMapping("/S/{artista}/{album}")
	public String artistaSalbum(@PathVariable String artista, @PathVariable String album) {
		String info = restTemplate.getForObject("http://localhost:8081/S1/{artista}", String.class, artista);
		String infoAlbum = restTemplate.getForObject("http://localhost:8082/S2/{artista}/{album}", String.class, artista, album);

		if(info.equals("fail"))
			return "I " + artista + " non sono presenti nel database";
		else
			return "I " + artista + " hanno " + info + " e "+ album + " " + infoAlbum ;
			
	}
	
	
	
	

	
}
