import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Exp3 {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        long startTime = System.currentTimeMillis();
        String[] params = new String[] {"Point_cloud_2.csv","1.2","10"};
        for(int i=0;i<args.length;i++){params[i]=args[i];}
        List<Point3D> DB = DBScannew.read(params[0]);
        //No file name means no runtime
        DBScannew dbs = new DBScannew(DB);
        //setting epsilon
        dbs.setEps(Double.parseDouble(params[1]));
        //setting minpts
        dbs.setMinPts(Integer.parseInt(params[2]));
        //get the clusters
        dbs.findClusters();
        dbs.displayClusters();
        //save the output
        dbs.save(params[0].split("\\.")[0]+"_clusters_"+dbs.getEps()+"_"+dbs.getMinPts()+"_"+dbs.getNumberOfClusters()+".csv");
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
