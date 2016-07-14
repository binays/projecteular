/**
 * Created by binay on 1/21/16.
 */
public class ProblemThree {

    public ProblemThree()
    {
        long num=600851475143l;
       // int num=13195;
        long pf=0;
        for(long i=2;i<=Math.sqrt(num);i++)
        {
            try {
                if (num % i == 0 && isPrime(i))
                    pf = i;
            }
            catch(ArithmeticException e)
            {
                System.out.println(i);
            }
        }
        System.out.println(pf);
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
