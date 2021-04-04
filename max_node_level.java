import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int maxNode(ArrayList<ArrayList<Integer>> tree, int node){
        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        int res = 0, max = 0, level = 0;

        while(!que.isEmpty()){
            int n = que.size();

            if(max<n){
                max = n;
                res = level;
            }
            level++;

            for(int i = 1; i<=n; i++){
                int temp = que.poll();

                ArrayList<Integer> edges = tree.get(temp-1);

                if(edges.get(0)!=-1)
                    que.add(edges.get(0));

                if(edges.get(1)!=-1)
                    que.add(edges.get(1));
            }
        }
        return res;

    }

	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        ArrayList<Integer> edges;
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            edges = new ArrayList<>();
            edges.add(in.nextInt());
            edges.add(in.nextInt());
            tree.add(edges);
        }

        System.out.print(maxNode(tree, 1));
	}
}
