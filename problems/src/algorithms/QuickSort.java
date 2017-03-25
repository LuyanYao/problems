package algorithms;

import java.util.Arrays;

public class QuickSort {
    
    
    
    public static void main(String []args)
    {
        int []a = {1,3,2,4,6,5,0,2,3,9,7,10,8};
       
      
        QuickSort.sort(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
        
    }
    
    public static  void sort(int []a,int start,int end)
    {
      
        
        if(start >= end)
        {
            return;
        }
        
        int i = start;
        int j = end;
        int temp = a[start];
        
        
        while(i!=j)
        {
            while(a[j]>=temp&&i<j)
            {
                j--;
            }
            while(a[i]<=temp&&i<j)
            {
                i++;
            }
            
            if(i<j)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
           
        }
        a[start]= a[i];
        a[i] = temp;
        
        sort(a,start,i-1);
        sort(a,i+1,end);
        
    }

}
