package asw.springcloud.s;

import asw.springcloud.s.infoclient.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service 
public class S1ServiceImpl implements S1Service {

	@Autowired 
	private ArtistInfoClient artistInfoClient;
	
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public String getInfo(String artista) {
		return artistInfoClient.getInfo(artista); 
	} 
	
	public String getFallbackSubject(String artista) {
		return "fail"; 
	}

}
