package application.specifications;

import application.models.Device;

import application.requests.DeviceRequest;

public class DeviceSpecification implements ISpecification<Device, DeviceRequest>{	

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isSatisfiedBy(Device candidate, DeviceRequest deviceRequest) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
