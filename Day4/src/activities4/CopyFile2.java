package activities4;
import java.io.FileOutputStream;
import java.io.FileInputStream;  
public class CopyFile2 {
	  public static void main(String[] args) {

		    byte[] array = new byte[50];
		    try {
		      FileInputStream sourceFile = new FileInputStream("input.txt");
		      FileOutputStream destFile = new FileOutputStream("newFile.txt");

		   
		      sourceFile.read(array);

		   
		      destFile.write(array);
		      System.out.println("The input.txt file is copied to newFile.");

	
		      sourceFile.close();
		      destFile.close();
		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }
		  }

}
