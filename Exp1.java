import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Exp1 {

    public static void main(String[] args) throws FileNotFoundException {
        //Creating a list of points from Point_cloud_1.csv.
        String[] params = new String[] { "Point_cloud_1.csv", "0.05", };
        List<Point3D> DB = DBScan.read(params[0]);
        NearestNeighbors lin = new NearestNeighbors(DB);
        NearestNeighborsKD first = new NearestNeighborsKD(DB);

        // Creating the list of neighbors of 6 predetermined points.
        List<Point3D> lin1 = (lin.rangeQuery(0.05, DB.get(2571)));
        List<Point3D> kd1 = first.rangeQuery(0.05, DB.get(2571));

        List<Point3D> lin2 = (lin.rangeQuery(0.05, DB.get(4451)));
        List<Point3D> kd2 = first.rangeQuery(0.05, DB.get(4451));

        List<Point3D> lin3 = (lin.rangeQuery(0.05, DB.get(4460)));
        List<Point3D> kd3 = first.rangeQuery(0.05, DB.get(4460));

        List<Point3D> lin4 = (lin.rangeQuery(0.05, DB.get(23525)));
        List<Point3D> kd4 = first.rangeQuery(0.05, DB.get(23525));

        List<Point3D> lin5 = (lin.rangeQuery(0.05, DB.get(17061)));
        List<Point3D> kd5 = first.rangeQuery(0.05, DB.get(17061));

        List<Point3D> lin6 = (lin.rangeQuery(0.05, DB.get(21285)));
        List<Point3D> kd6 = first.rangeQuery(0.05, DB.get(21285));

        // Printing the neighbour of point 1 using lin
        System.out.println("Number of neighbors:" + lin1.size());
        for (int i = 0; i < lin1.size(); i++) {
            System.out.println(lin1.get(i));
        }
        // Printing the neighbour of point 1 using kd
        System.out.println("Number of neighbors:" + kd1.size());
        for (int i = 0; i < lin1.size(); i++) {
            System.out.println(kd1.get(i));
        }
        // Printing the neighbour of point 2 using lin
        System.out.println("Number of neighbors:" + lin2.size());
        for (int i = 0; i < lin2.size(); i++) {
            System.out.println(lin2.get(i));
        }
        // Printing the neighbour of point 2 using kd
        System.out.println("Number of neighbors:" + kd2.size());
        for (int i = 0; i < kd2.size(); i++) {
            System.out.println(kd2.get(i));
        }
        // Printing the neighbour of point 3 using lin
        System.out.println("Number of neighbors:" + lin3.size());
        for (int i = 0; i < lin3.size(); i++) {
            System.out.println(lin3.get(i));
        }
        // Printing the neighbour of point 3 using kd
        System.out.println("Number of neighbors:" + kd3.size());
        for (int i = 0; i < kd3.size(); i++) {
            System.out.println(kd3.get(i));
        }
        // Printing the neighbour of point 4 using lin
        System.out.println("Number of neighbors:" + lin4.size());
        for (int i = 0; i < lin4.size(); i++) {
            System.out.println(lin4.get(i));
        }
        // Printing the neighbour of point 4 using kd
        System.out.println("Number of neighbors:" + kd4.size());
        for (int i = 0; i < kd4.size(); i++) {
            System.out.println(kd4.get(i));
        }
        // Printing the neighbour of point 5 using lin
        System.out.println("Number of neighbors:" + lin5.size());
        for (int i = 0; i < lin5.size(); i++) {
            System.out.println(lin5.get(i));
        }
        // Printing the neighbour of point 5 using kd
        System.out.println("Number of neighbors:" + kd5.size());
        for (int i = 0; i < kd5.size(); i++) {
            System.out.println(kd5.get(i));
        }
        // Printing the neighbour of point 6 using lin
        System.out.println("Number of neighbors:" + lin6.size());
        for (int i = 0; i < lin6.size(); i++) {
            System.out.println(lin6.get(i));
        }
        // Printing the neighbour of point 6 using kd
        System.out.println("Number of neighbors:" + kd6.size());
        for (int i = 0; i < kd6.size(); i++) {
            System.out.println(kd6.get(i));
        }

    }

}
