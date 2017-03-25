package algorithms;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String []args)
    {
        int []data = {1,3,5,2,4,6,7,9,8};
        int flag = 1;
        for(int i = 1;i<data.length;i++)
        {
            flag = 0;
            for(int j=0;j<data.length-i;j++)
            {
                if(data[j]>data[j+1])
                {
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1] = temp;
                    flag = 1;
                }
              
            }
            if(flag == 0)break;
        }
        System.out.println(Arrays.toString(data));
        
    }

}
