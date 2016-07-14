/**
 * Created by binay on 1/27/16.
 */
public class ProblemTen {

    public ProblemTen()
    {
        long sum=0;
        for(long i=2;i<=2000000;i++)
        {
            if(isPrime(i))
                sum+=i;
        }

        System.out.println(sum);

    }

    public boolean isPrime(long a)
    {
        boolean prime=true;
        for(long i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                prime=false;
                break;
            }

        }
        return prime;
    }
}
