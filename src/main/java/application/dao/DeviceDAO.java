package application.dao;

import org.springframework.stereotype.Component;

import application.data.MockData;
import application.models.Device;

/**
 * Device DAO will retrieve the device data. Inproduction the inmemory data will be replaced
 * @author ecom-anandraj.t
 *
 */

@Component
public class DeviceDAO {
	
	public Device findDeviceByType(String id){
	
		Device device = MockData.getDeviceDataById(id);
		return device;
		
	}

}
