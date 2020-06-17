import java.util.Scanner;
public class Lab3 {
	
    public static void main(String[] args) {
		while (true){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the x coordinate");
			double x = in.nextDouble();
			System.out.println("Введите координату y");
			double y = in.nextDouble();
			System.out.println("Enter the radius");
			double r = in.nextDouble();

			Point point = new Point(x, y, r);
			//Area area = point.getArea();

			if (point.isInArea()) {
				System.out.println("The point is included in the specified area");
			}
			else{System.out.println("The point is not included in the specified area");
			}
		}
    }
}
