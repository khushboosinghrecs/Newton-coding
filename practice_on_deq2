import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void fun(int arr[], int n, int k)
    {
        Deque<Integer> deq=new ArrayDeque<>();
        for(int i=0; i<k; i++)
        {
            while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i])
            {
                deq.removeLast();
            }
            deq.addLast(i);
        }
        System.out.print(arr[deq.peekFirst()]+" ");
        for(int i=k; i<n; i++)
        {
            while(!deq.isEmpty() && deq.peekFirst() <=i-k)
            {
                deq.removeFirst();
            }
            while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i])
            {
                deq.removeLast();
            }
            deq.addLast(i);
            System.out.print(arr[deq.peekFirst()]+" ");
        }
    }
	public static void main (String[] args) throws IOException{
                      // Your code here
BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
String[] string=rd.readLine().trim().split(" ");
int n=Integer.parseInt(string[0]);
int k=Integer.parseInt(string[1]);
int arr[]=new int[n];
String[] str = rd.readLine().trim().split(" ");
for(int i=0;i<n; i++)
{
    arr[i]=Integer.parseInt(str[i]);
}
fun(arr, n, k);
	}
}
