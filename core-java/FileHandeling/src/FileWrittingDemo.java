import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittingDemo {

	public static void main(String[] args) {
		
		
				File myFile=new File("/home/suraj/Desktop/FileHandelingDemos/WriteFile.txt");
		
				if(!myFile.exists())   // if file DoesNot Exit
				{
					System.out.println("fileDoesent exist so creating file...");
					
					try {
						myFile.createNewFile();  //create a file since file doesent exist.
					
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				
				}
				
				
				if(myFile.exists())  // 
				{
					try {
					
						FileWriter fileWriter =  new FileWriter(myFile);
						
						String messageToWrite =" Files are awsome...!";
						
						
						fileWriter.write(messageToWrite);
						fileWriter.close();
						
						System.out.println("file written successfully....!");
									
						//BufferedWriter br = new BufferedWriter(fileWriter);
						//br.write(messageToWrite); 
						
					
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
				}
				
				

	}

}
