package plans;

public class BasicPlan implements Plan{

	public String getName() {
		return "Basic";
		
	}
	
	@Override
	public double Price() {
		return 7.99;
	}

	@Override
	public int GetNumberOfDevices() {
		return 1;
	}

	@Override
	public boolean HDavailable() {
		return false;
	}

	@Override
	public boolean UltraHDAvailable() {
		return false;
	}
}