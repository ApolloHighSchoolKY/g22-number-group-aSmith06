import java.util.List;

public class MultipleGroups implements NumberGroup
{

    private List<NumberGroup> groupList;

    public MultipleGroups(NumberGroup range1, NumberGroup range2, NumberGroup range3)
    {
        groupList = new List<NumberGroup>();

        groupList.add(range1);
        groupList.add(range2);
        groupList.add(range3);
    }

    public boolean contains(int num)
    {
        for(NumberGroup range : groupList){
            if(range.contains(num))
                return true;
        }
        return false;
    }
}
