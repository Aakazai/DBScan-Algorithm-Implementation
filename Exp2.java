import java.io.FileNotFoundException;
import java.util.List;

public class Exp2 {
    
    public static void main(String[] args) throws FileNotFoundException{

        long startTime = System.nanoTime();
        String[] params1 = new String[] {"Point_cloud_1.csv","0.05",};
        List<Point3D> DB1 = DBScan.read(params1[0]);
        NearestNeighbors lin1 = new NearestNeighbors(DB1);

        String[] params2 = new String[] {"Point_cloud_2.csv","0.05",};
        List<Point3D> DB2 = DBScan.read(params2[0]);
        NearestNeighbors lin2 = new NearestNeighbors(DB2);

        String[] params3 = new String[] {"Point_cloud_3.csv","0.05",};
        List<Point3D> DB3 = DBScan.read(params3[0]);
        NearestNeighbors lin3 = new NearestNeighbors(DB3);

        for (int i =0; i<=DB1.size();i+=10){
        List<Point3D> lin=(lin1.rangeQuery(0.05, DB1.get(i)));
    }

        for (int i =0; i<=DB2.size();i+=10){
        List<Point3D> lin10=(lin2.rangeQuery(0.05, DB2.get(i)));
    }

    for (int i =0; i<=DB3.size();i+=10){
        List<Point3D> lin20=(lin3.rangeQuery(0.05, DB3.get(i)));
    }
    long endTime = System.nanoTime();
    System.out.println((endTime - startTime)/1000000);


        String[] params10 = new String[] {"Point_cloud_1.csv","0.05",};
        List<Point3D> DB10 = DBScan.read(params1[0]);
        NearestNeighborsKD kd = new NearestNeighborsKD(DB10);

        String[] params20 = new String[] {"Point_cloud_2.csv","0.05",};
        List<Point3D> DB20 = DBScan.read(params2[0]);
        NearestNeighbors kd2 = new NearestNeighbors(DB2);

        String[] params30 = new String[] {"Point_cloud_3.csv","0.05",};
        List<Point3D> DB30 = DBScan.read(params3[0]);
        NearestNeighbors kd3 = new NearestNeighbors(DB3);

        long startTime2 = System.nanoTime();
        for (int i =0; i<=DB1.size();i+=10){
        List<Point3D> kd10=(kd.rangeQuery(0.05, DB1.get(i)));
    }

        for (int i =0; i<=DB20.size();i+=10){
        List<Point3D> kd100=(kd2.rangeQuery(0.05, DB20.get(i)));
    }

    for (int i =0; i<=DB3.size();i+=10){
        List<Point3D> kd200=(kd3.rangeQuery(0.05, DB30.get(i)));
    }
    long endTime2 = System.nanoTime();
    System.out.println((endTime2 - startTime2)/1000000);



}}
