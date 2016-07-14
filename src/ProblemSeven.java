/**
 * Created by binay on 1/22/16.
 */
public class ProblemSeven {

    public ProblemSeven()
    {
        long num=1;
        int term=0;
        while(term<10001)
        {
            num++;
            if(isPrime(num))
            {
                term++;


            }


        }
        System.out.println(num);
    }

    public boolean isPrime(long num)
    {
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }

        }
        return prime;
    }
}
