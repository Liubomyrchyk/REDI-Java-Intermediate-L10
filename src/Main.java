import devices.Device;
import devices.Phone;
import devices.Tablet;
import movie.Movie;
import devices.TV;
import plans.BasicPlan;
import plans.Plan;
import plans.PremiumPlan;
import plans.StandardPlan;

public class Main{
		
	public static void main (String[] args) {
		Plan basic= new BasicPlan();
		Plan standard= new StandardPlan();
		Plan premium=  new PremiumPlan();
		
		User alina= new User ("alina@gmail.com", basic);
		User jack= new User ("jack@gmail.com", standard);
		User tom= new User ("tom@gmail.com", premium);
		
		
		Device phone = new Phone ("PhoneX", 5.5);
		Device tablet = new Tablet ("Ipad", 9.4);
		Device tv = new TV ("Samsung", 50);
		
		Movie movieone= new Movie("Home alone1","Alina");
		Movie movietwo= new Movie("Home alone2","Jack");
		Movie moviethree= new Movie("Home alone3","Tom");
		
		//alina
		alina.watch(phone, movieone);
		alina.watchHD(tv, movieone);
		alina.watchUltraHD(tablet, movieone);
		//jack
		jack.watch(tv, movietwo);
		jack.watchHD(tablet, movietwo);
		jack.watchUltraHD(phone, movietwo);
		//tom
		tom.watch(tv, moviethree);
		tom.watchHD(tablet, moviethree);
		tom.watchUltraHD(phone, moviethree);
		
	}
}