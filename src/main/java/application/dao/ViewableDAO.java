package application.dao;
import application.models.Viewable;
import org.springframework.stereotype.Component;
import application.data.MockData;

/**
 * View DAO will retrieve the View data. Inproduction the inmemory data will be replaced
 * @author ecom-anandraj.t
 *
 */

@Component
public class ViewableDAO {
	
	public Viewable findViewById(String id) {
		
		Viewable viewableData = MockData.getViewDataById(id);
		return viewableData;
		
	}

}
