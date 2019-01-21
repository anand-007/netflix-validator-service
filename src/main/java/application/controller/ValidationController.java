package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.requests.ValidateRequest;
import application.responses.ValidateResponse;
import application.services.ValidationService;

/**
 * Controller responsible for validation of the rules against the input
 * @author ecom-anandraj.t
 *
 */

@RestController
public class ValidationController {
	
    @Autowired private ValidationService validatorService;
	
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ResponseEntity < ValidateResponse > validatePlayback(@RequestBody ValidateRequest validateData) {
	    
		if(validateData.isValidRequest()) {
			ValidateResponse response = validatorService.isValid(validateData);	
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}	
	
}
