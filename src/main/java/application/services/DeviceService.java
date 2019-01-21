package application.services;

import org.springframework.stereotype.Service;

import application.dao.DeviceDAO;
import application.models.Device;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

@Service

public class DeviceService {

	DeviceDAO dao;

	DeviceService(DeviceDAO deviceDAO){
		this.dao = deviceDAO;
	}
	
	Device findDeviceByType(String id){
		
		Device device = null;
		
		device = this.dao.findDeviceByType(id);
		
		return device;
	}
}
