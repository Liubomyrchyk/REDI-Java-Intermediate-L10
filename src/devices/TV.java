package devices;

public class TV implements Device {

	String model;
	double diagonal;
	
	
	public TV(String model, double diagonal) {
		this.model=model;
		this.diagonal=diagonal;
	}
	
	@Override
	public double getDiagonal() {
		return this.diagonal;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public void setModel(String model) {
		this.model=model;
		
	}

	@Override
	public void setDiagonal(double diagonal) {
		this.diagonal=diagonal;
	}	
	
	@Override
	public int getUuid() {
		return 9000;
	}
}
