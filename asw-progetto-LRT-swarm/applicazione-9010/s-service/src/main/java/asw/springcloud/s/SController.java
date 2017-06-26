package asw.springcloud.s;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@RestController
public class SController {
	

   	
	//@Value("${word.s1.uri}")
	//private String s1URI;
	//@Value("${word.s2.uri}")
	//private String s2URI;

	@Autowired 
	private S1Service s1Service;
	@Autowired 
	private S2Service s2Service;
	
	/* Restituisce info generiche sull'{artista} specificato */
	@RequestMapping("/S/{artista}")
	public String artistaS(@PathVariable String artista) {
		String info = s1Service.getInfo(artista);
		String infoAlbum = s2Service.getInfo(artista);

		if(!(info.equals("fail")))
			return "I " + artista + " hanno " + info + " e hanno " + infoAlbum ;
		else return "I " + artista + " non sono presenti nel database";
	}
	
	@RequestMapping("/S/{artista}/{album}")
	public String artistaSalbum(@PathVariable String artista, @PathVariable String album) {
		String info = s1Service.getInfo(artista);
		String infoAlbum = s2Service.getInfo(artista,album);

		if(info.equals("fail"))
			return "I " + artista + " non sono presenti nel database";
		else
			return "I " + artista + " hanno " + info + " e "+ album + " " + infoAlbum ;
			
	}
	
}
