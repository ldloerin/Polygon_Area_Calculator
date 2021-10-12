import java.util.ArrayList;


public class ServiceCode {
    public String cleanLine(String line){
        line = line.replaceAll("\\{","");
        line = line.replace("}","");
        line = line.replace("[","");
        line = line.replace("]","");
        line = line.replace(" ","");
        line = line.replace("\"","");
        line = line.replace("'","");
        line = line.replace(",y","y");
        return line;
    }

    public ArrayList[] buildPoints(String line){
        String[] arr = line.split(",");
        ArrayList[] points = new ArrayList[arr.length];
        for(int i=0; i<arr.length; i++){
            ArrayList<Double> pt = new ArrayList<>();
            String[] point_arr = arr[i].split("y:");
            double y = Double.parseDouble(point_arr[1]);
            double x = Double.parseDouble(point_arr[0].split("x:")[1]);
            pt.add(x);
            pt.add(y);
            points[i] = pt;
        }
        return points;
    }

    public double calculateArea(ArrayList[] points){
        double area = 0.0;
        for(int i=0; i<points.length-1; i++){
            ArrayList<Double> current_pt = points[i];
            ArrayList<Double> next_pt = points[i+1];
            double x_0 = (double) current_pt.get(0);
            double x_1 = (double) next_pt.get(0);
            double y_0 = (double) current_pt.get(1);
            double y_1 = (double) next_pt.get(1);
            area += x_0 * y_1 - x_1 * y_0;
        }
        area = Math.abs(0.5 * area);
        return area;
    }
}
