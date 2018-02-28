import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airport airport1 = new Airport("Henri Coada");
		airport1.populateAirport();		
		
		try {
			FileOutputStream fileOut = new FileOutputStream("data.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(airport1);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in data.txt");
		}
		catch (IOException i){
			i.printStackTrace();
		}
		
		
		Airport airport2 = null;
		
		try {
	         FileInputStream fileIn = new FileInputStream("data.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         airport2 = (Airport) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Data not found");
	         c.printStackTrace();
	         return;
	      }
		
		airport2.listHangars();
		airport2.listRunways();
	}

}
