import devices.Device;
import movie.Movie;
import plans.PremiumPlan;
import plans.BasicPlan;
import plans.Plan;
import plans.StandardPlan;

public class User {
	
	public User(String email, Plan plan) {
		this.email=email;
		this.plan=plan;
		
	}
	
	String email;
	Plan plan;
	
	
	void watch (Device device, Movie movie) {
		System.out.println(String.format("User %s watches %s with  %s screens %s", this.email, movie.getTitle(), plan.getName(), device.getModel() ));
	}
	
	void watchHD (Device device, Movie movie) {
		if(device.getUuid()<=3000) {
			System.out.println(String.format("This device %s is not supported \n", device.getModel()));	
		}
		
		if (plan.HDavailable()) {
			System.out.println(String.format("User %s watches %s with  %s screens %s", this.email, movie.getTitle(), plan.getName(), device.getModel() ));
		}else {
			System.out.println("You should upgrade your plan for watching HD \n");
		}
		
	}
	
	void watchUltraHD (Device device, Movie movie) {
		if(device.getUuid()<=8000) {
			System.out.println(String.format("This device %s is not supported", device.getModel()));
			
		}
		if (plan.UltraHDAvailable()) {
			System.out.println(String.format("User %s watches %s with  %s screens %s", this.email, movie.getTitle(), plan.getName(), device.getModel() ));
		}else {
			System.out.println("You should upgrade your plan for watching HD \n");
		}
	
	}
}
