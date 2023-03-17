package serializationExample;

import java.io.Serializable;

public class CarDetails implements Serializable {
private int num;
private String model;
private String manufacturer;
public CarDetails(int num, String model, String manufacturer) {
	this.num = num;
	this.model = model;
	this.manufacturer = manufacturer;
}
public int getNum() {
	return num;
}
public String getModel() {
	return model;
}
public String getManufacturer() {
	return manufacturer;
}
 
}
