package lessions.tree;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-01
 */
public class BinaryTree {

    Node root;
    private int count;

    public Node add(Node root, int data){
        if(root == null){
            Node node = new Node(data);
            root = node;
        }else if (root.data > data){
            Node node = new Node(data);
            root.left = node;
        }else {
            Node node = new Node(data);
            root.right = node;
        }

        return root;
    }

}
