package devices;


public interface Device {
   
	
	String getModel();
	double getDiagonal();
	void setDiagonal(double diagonal);
	void setModel(String model);
	int getUuid();

}
