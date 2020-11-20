import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long fun(int arr[], int n, int k)
    {
        Deque<Integer> deq=new ArrayDeque<>();
		Deque<Integer> deq2=new ArrayDeque<>();
        for(int i=0; i<k; i++)
        {
            while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i])
            {
                deq.removeLast();
            }
			 while(!deq2.isEmpty() && arr[deq2.peekLast()]>=arr[i])
            {
                deq2.removeLast();
            }
            deq.addLast(i);
			deq2.addLast(i);
        }
        long sum=0; sum=sum+arr[deq.peekFirst()]+arr[deq2.peekFirst()];
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
			while(!deq2.isEmpty() && deq2.peekFirst() <=i-k)
            {
                deq2.removeFirst();
            }
            while(!deq2.isEmpty() && arr[deq2.peekLast()]>=arr[i])
            {
                deq2.removeLast();
            }
            deq2.addLast(i);
			deq.addLast(i);
            sum=sum+(arr[deq.peekFirst()]+arr[deq2.peekFirst()]);
        }
		return sum;
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
System.out.print(fun(arr, n, k));
	}
}
