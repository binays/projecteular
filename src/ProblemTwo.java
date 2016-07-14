/**
 * Created by binay on 1/21/16.
 */
public class ProblemTwo {

    public ProblemTwo()
    {
        int a=1;
        int b=2;
        int sum=2;
        while(nextTerm(a,b)<4000000)
        {
            int nt=nextTerm(a,b);
            if(nt%2==0)
                sum+=nextTerm(a,b);
            a=b;
            b=nt;
        }
        System.out.println(sum);

    }

    public int nextTerm(int a,int b)
    {
        return a+b;
    }
}
