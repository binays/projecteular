/**
 * Created by binay on 1/22/16.
 */
public class ProblemSix {

    public ProblemSix()
    {
        long sum1=0;
        for(int i=0;i<=100;i++)
        {
            sum1+=i;
        }
        long sqsum1=(long) Math.pow(sum1,2);
        long sum2=0;
        for(int i=0;i<=100;i++)
        {
            sum2+=(i*i);
        }
        System.out.println(sqsum1-sum2);

    }
}
