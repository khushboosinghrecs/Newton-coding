/*
 // Information about the class Node
    class Node
    {
        int data;
        Node left,right;
        Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    }
*/

static void zigZagTraversalUtil(Node root, HashMap<Integer, ArrayList<Integer>> tree, int level){
    if(root==null){
        return;
    }

    if(!tree.containsKey(level)){
        tree.put(level, new ArrayList<Integer>());
    }

    ArrayList<Integer> temp;

    if(level%2==0){
        temp = tree.get(level);
        temp.add(root.data);
        tree.put(level, temp);
    }else{
        temp = tree.get(level);
        temp.add(0, root.data);
        tree.put(level, temp);
    }

    zigZagTraversalUtil(root.left, tree, level+1);
    zigZagTraversalUtil(root.right, tree, level+1);

}

static ArrayList<Integer> zigZagTraversal(Node root)
{
     // Your code here
     ArrayList<Integer> list = new ArrayList<>();
     HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();
     zigZagTraversalUtil(root, tree, 0);
     for(ArrayList<Integer> levels : tree.values()){
         list.addAll(levels);
     }
     return list;
}
