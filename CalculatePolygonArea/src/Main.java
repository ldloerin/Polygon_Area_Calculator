import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String initial_line = sc.nextLine();

            ServiceCode service = new ServiceCode();
            String line = service.cleanLine(initial_line);
            ArrayList[] points = service.buildPoints(line);
            double area = service.calculateArea(points);

            System.out.println(area);
        }
    }
}
