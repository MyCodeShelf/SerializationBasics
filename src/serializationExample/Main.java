package serializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create an object to serialize
        CarDetails data = new CarDetails(1234, "EV25", "tata");
        
        try {
            // Serialize the object to a file
            FileOutputStream fileOut = new FileOutputStream("carDetails.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in carDetails.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialize the object from the file
        try {
            FileInputStream fileIn = new FileInputStream("carDetails.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            CarDetails serializedData = (CarDetails) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized data:");
            System.out.println("Car Num: " + serializedData.getNum());
            System.out.println("Variant : " + serializedData.getModel());
            System.out.println("Manufacturer: " + serializedData.getManufacturer());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    
		
	}

}
