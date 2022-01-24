import java.util.Scanner;
// tc O(nd)
public class Main
{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prev=arr[0];
        
        for(int i=0;i<d;i++ ){
            prev=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=prev;
        }
        
        
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
