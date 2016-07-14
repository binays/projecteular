/**
 * Created by binay on 1/21/16.
 */
public class ProblemOne {

    public static void main(String[] args)
    {
        new ProblemTwelve();
    }

    public ProblemOne()
    {

        int sum=0;
        for(int i=1;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
