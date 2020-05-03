package plans;
public interface Plan {
	
	double Price();
	int GetNumberOfDevices();
	boolean HDavailable();
	boolean UltraHDAvailable();
	String getName();
}
