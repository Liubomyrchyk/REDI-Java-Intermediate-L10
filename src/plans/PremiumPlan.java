package plans;

public class PremiumPlan implements Plan{
	public String getName() {
		return "Premium";
		
	}
	@Override
	public double Price() {
		return 15.99;
	}

	@Override
	public int GetNumberOfDevices() {
		return 4;
	}

	@Override
	public boolean HDavailable() {
		return true;
	}

	@Override
	public boolean UltraHDAvailable() {
		return true;
	}
	
}