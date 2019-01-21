package application.specifications;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class SpecificationFactory {
	
	public static List<ISpecification> getSpecifications(String type) {
		
		List<ISpecification> specificationList = new ArrayList<ISpecification>();
		
		if(type=="member") {
			MemberSpecification memberSpecification = new MemberSpecification();
			specificationList.add(memberSpecification);
			
		} else if(type =="device") {
			
			DeviceSpecification deviceSpecification = new DeviceSpecification();
			specificationList.add(deviceSpecification);
			
		} else if(type == "view") {
			ViewSpecification viewSpecification = new ViewSpecification();
			specificationList.add(viewSpecification);
		}
		
		return specificationList;
	}

}
