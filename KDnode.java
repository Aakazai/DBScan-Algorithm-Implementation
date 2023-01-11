public class KDnode {

    
    // Instance variables
    public Point3D point;
    public int axis;
    public double value;
    public KDnode left;
    public KDnode right;

    //Constructor
    public KDnode(Point3D pt, int axis) {
        this.point = pt;
        this.axis = axis;
        this.value = pt.get(axis);
        left = right = null;
    }

}
