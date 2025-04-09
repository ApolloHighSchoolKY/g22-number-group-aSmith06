
public class Range implements NumberGroup
{

    private int[] betweens;

    public Range (int lower, int upper)
    {    
        betweens = new int[upper - lower + 1]

        for (int i = lower; i <= upper; i++){
            betweens[i] = i;
        }
    }

    public boolean contains(int num)
    {
        for(int i:betweens){
            if(i==num || i = num % 10)
                return true;
        }
        return false;
    }
}
