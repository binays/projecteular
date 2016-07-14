/**
 * Created by binay on 1/21/16.
 */
public class ProblemFour {

    public ProblemFour()
    {
        int largestPalin=0;
        int i1=0;
        int j1=0;
        for(int i=100;i<1000;i++)
        {
            for(int j=584;j<1000;j++)
            {
                if(isPalindrome(i*j))
                {
                    largestPalin=i*j;
                    i1=i;
                    j1=j;
                }
            }
        }
        System.out.println(largestPalin+" "+i1+" "+j1);

    }

    public boolean isPalindrome(int num)
    {
        int origi=num;
        StringBuffer str=new StringBuffer("");
        while(num>0)
        {
            str.append(Integer.toString(num%10));
            num=num/10;
        }
        if(origi==Integer.parseInt(str.toString()))
            return true;
        else
            return false;
    }
}
