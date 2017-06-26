package asw.springcloud.s.infoclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("s1-service")
public interface ArtistInfoClient {

	@RequestMapping(value="/S1/{artista}", method=RequestMethod.GET)
	public String getInfo(@PathVariable("artista") String artista); 

}
