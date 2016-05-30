package me.wini.logstash.logback;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args ) {
    	for(int i = 0; i < 10; i++) {
	    	Account account = new Account();
	    	account.setId(i);
	    	account.setUsername("tester" + i);
	    	account.setPassword("password" + i);
	    	account.setAddress("korea");
	    	account.setEmail("tester" + i + ".gmail.com");
	
	    	
	    	ObjectMapper mapper = new ObjectMapper();
	    	
	    	String json = "";
	    	try {
				 json = mapper.writeValueAsString(account);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	log.info(json);
	        System.out.println( i + "::::::::::Hello World!" );
    	}
    }
}