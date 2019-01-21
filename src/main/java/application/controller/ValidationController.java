package application.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.models.Greeting;
import application.requests.ValidateRequest;
import application.responses.ValidateResponse;
import application.services.ValidationService;


@RestController
public class ValidationController {
	
    @Autowired private ValidationService validatorService;


	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/validate")
	public Greeting validate(@RequestParam(value="name", defaultValue="Gary") String name) {
		return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	}	
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ResponseEntity < ValidateResponse > validatePlayback(@RequestBody ValidateRequest validateData) {
	    
		ValidateResponse response = validatorService.isValid(validateData);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}	
	
}
