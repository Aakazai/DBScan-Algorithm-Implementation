import org.w3c.dom.Node;

public class KDtree {

    private KDnode root;

    // construct empty tree
    public KDtree() {
        root = null;
    }
    // getter for root of tree
    KDnode root() {
        return root;
    }
    // method to add a point to the tree. Uses insert method, but only takes Point3D as a parameter for simplicity
    public void add(Point3D p) {
        insert(p, root, 0);
    }
// method to insert a point to the tree
    public KDnode insert(Point3D p, KDnode node, int axis) {
        if (root == null){                  // If root is null, assign node to root. 
            root = new KDnode(p,0); 
     }
        if (node == null) {
            node = new KDnode (p,axis);
        }
        else if (p.get(axis)<=node.value){
            node.left = insert(p,node.left, ((axis+1) % 3));
        }
        else {
            node.right = insert (p, node.right, ((axis+1) %3));
        }

        return node;


    }

}