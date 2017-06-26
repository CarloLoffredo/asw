package asw.springcloud.s;

import asw.springcloud.s.infoclient.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service 
public class S2ServiceImpl implements S2Service {

	@Autowired 
	private AlbumInfoClient albumInfoClient;
	
	@HystrixCommand(fallbackMethod="getFallbackA")
	public String getInfo(String artista) {
		return albumInfoClient.getInfo(artista); 
	} 

	@HystrixCommand(fallbackMethod="getFallbackAA")
	public String getInfo(String artista, String album) {
		return albumInfoClient.getInfo(artista, album); 
	} 
	
	public String getFallbackA(String artista) {
		return "fail"; 
	}

	public String getFallbackAA(String artista, String album) {
		return "fail"; 
	}


}
