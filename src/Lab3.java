
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.InputMismatchException;
public class Lab3 {
	
    public static void main(String[] args) {
		ImageTest imageMainClass= new ImageTest();
	    imageMainClass.imageMainMethod();
		
		String PATH_TO_PROPERTIES = "local/native/local.properties";
		
	
 
        FileInputStream fileInputStream;

        Properties prop = new Properties();
		    String EnterX = "";
            String EnterY = "";
            String EnterR = "";
			String InIsArea = "";
            String NotInIsArea = "";
            String EnterDouble = "";
        try {
           
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
 
             EnterX = prop.getProperty("EnterX");
             EnterY = prop.getProperty("EnterY");
             EnterR = prop.getProperty("EnterR");
			 EnterDouble = prop.getProperty("EnterDouble");
			 InIsArea = prop.getProperty("InIsArea");
             NotInIsArea = prop.getProperty("NotInIsArea");
            
      
        } catch (IOException e) {
            System.out.println("Ошибка в программе: файл " + PATH_TO_PROPERTIES + " не обнаружено");
            e.printStackTrace();
        }
		
		while (true){
			Scanner in = new Scanner(System.in);
			System.out.println(EnterX);
			try {
				double x = in.nextDouble();
				System.out.println(EnterY);
				double y = in.nextDouble();
				System.out.println(EnterR);
				double r = in.nextDouble();
			
				Point point = new Point(x, y, r);
				//Area area = point.getArea();

				if (point.isInArea()) {
					System.out.println(InIsArea);
				}
				else{
					System.out.println(NotInIsArea);
				}
				System.out.println("---------------------------------------");
			}
		 catch (InputMismatchException e) {
				System.out.print(EnterDouble);
			}
    }
	}
}
