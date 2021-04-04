/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
static int getMaxWidth(Node root)
{
    class Data{
        Node node;
        int level;
        Data(Node nd,int lv){
            node = nd;
            level = lv;
        }
    }
    Queue<Data> abc = new LinkedList<Data>();
    abc.add(new Data(root,0));
    int maxe = 0;
    int cur = 0;
    int total = 0;
    while(abc.size() > 0){
        Data x = abc.remove();
        if(x.level == cur + 1){
            if(total > maxe){
                maxe = total;
            }
            total = 0;
            cur++;
        }

        Node d = x.node;
        if(d != null && d.left != null){
            abc.add(new Data(d.left,cur+1));
        }

        if(d != null && d.right != null){
            abc.add(new Data(d.right,cur+1));
        }
        total++;
    }
    
    if(total > maxe){
        return total;
    }
    
    return maxe;
}
