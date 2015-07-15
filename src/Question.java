public class Question
{
    public static int fixedPoint (int [] a)
    {
        int start = 0;
        int end = a.length-1;
        int mid;
        
        while(start <= end)
        {
            mid = (start+end)/2;
            
            if(a[mid] == mid)
            return mid;
            else if(a[mid] > mid)
            end = mid - 1;
            else
            start = mid+1;
        }
        return -1;
    }
    
    public static void print(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        System.out.print(a[i]+" ");
    }
    
    public static void main(String[] args)
    {
        int[] a = {-3, 0, 2, 4, 11, 12, 15};
        System.out.println("array a: ");
        print(a);
        System.out.println("\nResult: "+fixedPoint(a));
    }
    

}
