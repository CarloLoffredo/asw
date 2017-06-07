package asw.springboot.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient implements CommandLineRunner {
    
    private static final Logger logger = LoggerFactory.getLogger(RestClient.class);

    @Value("${word.s2.uri}")
    private String s2URI;
    
    public void run(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        
        //		String artistaQueen = restTemplate.getForObject("http://localhost:8080/S/Queen", String.class);
        String artistaQueen = restTemplate.getForObject(s2URI + "Queen", String.class);
        
        /* ripete tante volte, altrimenti si perde tra i log di Spring Boot */
        for (int i=0; i<3; i++) {
            logger.info( artistaQueen );
        }
        
        
    }
    
}
