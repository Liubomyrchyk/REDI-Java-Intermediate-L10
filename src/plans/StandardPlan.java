package plans;

public class StandardPlan implements Plan{
	public String getName() {
		return "Standard";
		
	}
	@Override
	public double Price() {
		return 11.99;
	}

	@Override
	public int GetNumberOfDevices() {
		return 2;
	}

	@Override
	public boolean HDavailable() {
		return true;
	}

	@Override
	public boolean UltraHDAvailable() {
		return false;
	}
	
}