/**
 * Created by binay on 1/21/16.
 */
public class ProblemFive {

    public ProblemFive()
    {
        int num=1;
        while(true)
        {
            boolean found=true;
            for(int i=1;i<=20;i++)
            {
                if(num%i!=0)
                {
                    found=false;
                    break;
                }

            }
            if(found==true)
                break;
            else
                num++;

        }
        System.out.println(num);
    }
}
