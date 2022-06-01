import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalancedWordsCounterTest
{
    BalancedWordsCounter balancedWordsCounter;

    public BalancedWordsCounterTest()
    {
        balancedWordsCounter = new BalancedWordsCounter();
    }

    private void performTest(String input, int expected) throws Exception
    {
        if (balancedWordsCounter.count(input) != expected)
        {
            throw new Exception("Failed Test");
        }
    }

    public void simpleInputTest() throws Exception
    {
        performTest("aabbabcccba", 28);
    }

    public void emptyInputTest() throws Exception
    {
        performTest("", 0);
    }

    public void invalidInputTest() throws Exception
    {
        try
        {
            performTest("abababa1", -1);
        }
        catch (RuntimeException e)
        {
            return;
        }
        throw new Exception("Test Failed");
    }

    public void nullInputTest() throws Exception
    {
        try
        {
            performTest(null, -1);
        }
        catch (RuntimeException e)
        {
            return;
        }
        throw new Exception("Test Failed");
    }

    public static void main(String[] args)
    {
        try
        {
            BalancedWordsCounterTest test = new BalancedWordsCounterTest();
            test.simpleInputTest();
            test.invalidInputTest();
            test.emptyInputTest();
            test.nullInputTest();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
