package application.services;

import org.springframework.stereotype.Service;
import application.dao.ViewableDAO;
import application.models.Viewable;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

@Service
public class ViewService {
	
	ViewableDAO dao;

	ViewService(ViewableDAO viewDAO){
		this.dao = viewDAO;
	}
	
	Viewable findViewById(String id){
		
		Viewable view = null;
		
		view = this.dao.findViewById(id);
		
		return view;
	}

}
