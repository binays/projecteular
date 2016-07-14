/**
 * Created by binay on 2/1/16.
 */
public class ProblemTwelve {

    public ProblemTwelve()
    {
        long i=100000;
        long tn=5000050000l;
        int numOfFactors=0;
        while(true)
        {
            tn=triangularNum(i);
            System.out.println(tn);
           // tn+=i;
            numOfFactors=calculateFactors(tn);
            if(numOfFactors>500)
                break;
            else
            {
                System.out.println(i+","+tn+","+numOfFactors);
                i++;
            }
        }
        System.out.println(tn+" "+numOfFactors);
    }

    public long triangularNum(long n)
    {
        long sum=0;
        for(long i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public int calculateFactors(long tn)
    {
        int numOfFactors=0;
        for(long i=1;i<=tn;i++)
        {
            if(tn%i==0)
                numOfFactors++;
        }
        return numOfFactors;
    }
}
