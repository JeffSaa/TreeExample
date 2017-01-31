package Model;

/**
 *
 * @author jeff
 */
public class Node {
    
    private Node left, rigth;
    private String name;

    public Node(String name) {
        left = null;
        rigth = null;
        this.name = name;
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
    
    public String getName(){
        return this.name;
    }
    
}