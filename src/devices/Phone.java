package devices;

public class Phone implements Device {

	String model;
	double diagonal;
	
	
	public Phone(String model, double diagonal) {
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
		return 3000;
	}

}
