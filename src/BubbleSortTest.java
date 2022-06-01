import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest
{
    BubbleSort bubbleSort;

    public BubbleSortTest()
    {
        bubbleSort = new BubbleSort();
    }

    private <T> void performTest(List<Comparable<T>> input, List<Comparable<T>> expected) throws Exception
    {
        List<Comparable<T>> sorted = bubbleSort.sort(input);
        for(int i = 0; i < input.size(); ++i)
        {
            if(!sorted.get(i).equals(expected.get(i)))
            {
                throw new Exception("Test Failed");
            }
        }
    }
    public void simpleInputTest() throws Exception
    {
        performTest(new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, 3, 8)), Arrays.asList(new Integer[]{1, 3, 4, 5, 6, 8, 8}));
    }
    public void doubleInputTest() throws Exception
    {
        performTest(new ArrayList<>(Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0)), new ArrayList<>(Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0)));
    }
    public void emptyInputTest() throws Exception
    {
        performTest(new ArrayList<>(Arrays.asList(new Integer[]{})), new ArrayList<>(Arrays.asList(new Integer[]{})));
    }
    public void nullContainingInputTest() throws Exception
    {
        performTest(new ArrayList<>(Arrays.asList(null, 5.0001)), new ArrayList<>(Arrays.asList(5.0001)));
    }
    public void nullInputTest() throws Exception
    {
        try
        {
            performTest(null, null);
        }
        catch (RuntimeException e)
        {
            return;
        }
        throw new Exception("Test Failed");
    }
}
