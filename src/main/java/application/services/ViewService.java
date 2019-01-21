package application.services;

import org.springframework.stereotype.Service;

import application.dao.ViewableDAO;
import application.models.Device;
import application.models.Viewable;

@Service

public class ViewService {
	
	ViewableDAO dao;

	ViewService(ViewableDAO viewDAO){
		this.dao = viewDAO;
	}
	
	Viewable findViewById(String id){
		
		Viewable view = null;
		
		return view;
	}

}
