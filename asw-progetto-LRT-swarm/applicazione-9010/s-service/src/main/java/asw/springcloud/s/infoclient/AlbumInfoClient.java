package asw.springcloud.s.infoclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("s2-service")
public interface AlbumInfoClient {

	@RequestMapping(value="/S2/{artista}", method=RequestMethod.GET)
	public String getInfo(@PathVariable("artista") String artista);

	@RequestMapping(value="/S2/{artista}/{album}", method=RequestMethod.GET)
	public String getInfo(@PathVariable("artista") String artista, @PathVariable("album") String album); 
}
