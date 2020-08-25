package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWIthResourceTest {

	public static void main(String[] args) {
		
		
		try (FileInputStream fis = new FileInputStream("")) {
			fis.read();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
