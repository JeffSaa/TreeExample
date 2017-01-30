package Model;

/**
 *
 * @author jeff
 */
public class Node {
    
    private Node left, rigth;

    public Node() {
        left = null;
        rigth = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRigth() {
        return rigth;
    }
    
    public void setLeft(Node l){
        left = l;
    }
    
    public void setRigth(Node r){
        rigth = r;
    }
    
}