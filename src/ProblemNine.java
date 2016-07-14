/**
 * Created by binay on 1/27/16.
 */
public class ProblemNine {

    public ProblemNine()
    {
        int a=0;
        int b=0;
        int c=0;
        boolean triplet=false;
        for(int i=1;i<=1000;i++)
        {
            for(int j=1;j<=1000;j++)
            {
                for(int k=1;k<=1000;k++)
                {
                    if(i+j+k==1000)
                    {
                        if (isTriplet(i,j,k))
                        {
                            triplet = true;
                            a=i;b=j;c=k;
                            break;
                        }

                    }

                }
                if(triplet)
                    break;
            }
            if(triplet)
                break;
        }
        System.out.println(a*b*c);
    }

    public boolean isTriplet(int a,int b,int c)
    {
        int [] arr={a,b,c};
        arr=sort(arr);
        if((arr[0]*arr[0])+(arr[1]*arr[1])==(arr[2]*arr[2]))
            return true;
        else
            return false;
    }

    public int[] sort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }


}
