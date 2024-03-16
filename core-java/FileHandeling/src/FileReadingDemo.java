import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadingDemo {

	public static void main(String[] args) {
		
		
		//  /home/suraj/Desktop/FileHandelingDemos/
		
		
		File myFile=new File("/home/suraj/Desktop/FileHandelingDemos/abc.txt");
		
		
		if(myFile.exists())
		{
		
			try
			{
				//FileReader fileReader=new FileReader("/home/suraj/Desktop/FileHandelingDemos/abc.txt");
				FileReader fileReader=new FileReader(myFile);
				
				int readValue=0;
				char charValue='-';
				
				
			
				
				while(readValue != -1)
				{
					// here fileReader will return -1 when it reached EOF(EndOfFile). -1 represents end of file.
					readValue=fileReader.read();
				
					// fileReader.read() is reading integer ascii codes from file.
					//we need to convert those to characters hence parsing each received integer to char.
					charValue =(char)readValue;				
					
					System.out.print(charValue);
					
					
				
				}

				
				//BufferedReader br = new BufferedReader(fileReader);
				//br.readLine();
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

	}

}
