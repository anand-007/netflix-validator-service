import static org.junit.Assert.*;

import org.junit.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import application.Application;
import application.data.MockData;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc

public class ValidateControllerTest extends TestCase{
	

	 @Autowired
	 private MockMvc mockMvc;
	 
	 
	@Test
	public void successCase() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "1";
            public String playBackId = "video2";
            public String deviceId = "5";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("Request is valid")));
	}
	
	@Test
	public void inActiveUserCase() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "2";
            public String playBackId = "video2";
            public String deviceId = "5";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("USER IS NOT ACTIVE")));
	}
	
	@Test
	public void deviceResolutionNotSupportedUseCase() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "1";
            public String playBackId = "video2";
            public String deviceId = "2";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("DEVICE RESOLUTION NOT SUPPORTED")));
	}
	
	@Test
	public void invalidInputDataUserCase() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "1123";
            public String playBackId = "video2";
            public String deviceId = "2";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("INVALID INPUT DATA")));
	}
	
	@Test
	public void userNotAuthorizedViewContent() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "1";
            public String playBackId = "video3";
            public String deviceId = "2";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("YOU ARE NOT AUTHORIZED TO VIEW THE CONTENT")));
	}
	
	
	@Test
	public void pinRequiredToViewContent() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "4";
            public String playBackId = "video3";
            public String deviceId = "4";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("PIN IS REQUIRED TO VIEW THIS CONTENT")));
	}
	
	@Test
	public void numberOfStreamExceeded() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "3";
            public String playBackId = "video3";
            public String deviceId = "2";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("NUMBER OF STREAMS EXCEEDED SUPPORTED BY PLAN")));
	}
	
	@Test
	public void pinNotMatched() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "6";
            public String playBackId = "video3";
            public String deviceId = "2";
            public String userPin = "8028";
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("PIN ENTERED DOES NOT MATCH")));
	}
	
	@Test
	public void contentNotSupportedForCountry() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "2";
            public String playBackId = "video2";
            public String deviceId = "5";
            public String[] excludeTypes = new String[] {"member"};
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("CONTENT NOT SUPPORTED FOR YOUR COUNTRY")));
	}
	
	@Test
	public void disableEnableValidationSet() throws Exception {
		
        MockData.initializeData();
		Object randomObj = new Object() {
            public String memberId = "2";
            public String playBackId = "video1";
            public String deviceId = "2";
            public String[] excludeTypes = new String[] {"member"};
        };

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);

		this.mockMvc.perform(post("/validate").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("Request is valid")));
	}
	
	

}
