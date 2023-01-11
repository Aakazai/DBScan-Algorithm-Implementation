import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestNeighborsKD {

    // Instance variables
    KDtree kdTree;
    List<Point3D> points;
    List<Point3D> neighbors = new ArrayList<>();


    //Constructor
    public NearestNeighborsKD(List<Point3D> points) { 
        neighbors= new ArrayList<Point3D>();
        this.points = points;
        KDtree kdTree = new KDtree();
        this.kdTree = kdTree;
        for (int i = 0; i < points.size(); i++) {
            kdTree.add(points.get(i));
        }

    }

    // simple rangeQuery method, based off rangeQuery method which takes 4 parameters.
    public List<Point3D> rangeQuery( double eps, Point3D p) {
        neighbors= new ArrayList<Point3D>();
        rangeQuery(p, eps, neighbors, kdTree.root());
        return neighbors;
    }

    // rangeQuery method
    private void rangeQuery(Point3D p, double eps, List<Point3D> neighbors, KDnode node) {

        this.neighbors=neighbors;
        if (node == null) {
            return;
        }

        if (p.distance(node.point) < eps) {
            neighbors.add(node.point);
        }
        if (p.get(node.axis) - eps <= node.value) {
            rangeQuery(p, eps, neighbors, node.left);
        }

        if (p.get(node.axis) + eps > node.value) {
            rangeQuery(p, eps, neighbors, node.right);
        }
        return;
    }
}
