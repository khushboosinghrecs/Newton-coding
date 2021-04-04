
public static  int absMinDist(Node root) {
    
    Queue<Node> q = new LinkedList<>();
    ArrayList<Integer> ar = new ArrayList<>();
    q.add(root);
    int data1,data2;
    data1 = data2 = 100000000;
    while(q.size() > 0){
        Node temp = q.remove();
        ar.add(temp.data);
        if(temp.left != null){
            q.add(temp.left);
        }
        if(temp.right != null){
            q.add(temp.right);
        }
    }

    Collections.sort(ar); 
    int mine = 10000000;
    for(int i=1;i<ar.size();i++){
        int di = Math.abs(ar.get(i) - ar.get(i-1));
        if(di < mine){
            mine = di;
        }
    }
    return mine;
}
