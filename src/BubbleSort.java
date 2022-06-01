import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BubbleSort
{
    public <T> List<Comparable<T>> sort(List<Comparable<T>> input)
    {
        if(input == null)
        {
            throw new RuntimeException();
        }

        input.removeIf(Objects::isNull);
        for(int i = 0; i < input.size(); i++)
        {
            for(int j = 0; j < input.size() - i - 1; j++)
            {
                if(input.get(j + 1).compareTo((T)input.get(j)) < 0)
                {
                    Collections.swap(input, j, j + 1);
                }
            }
        }
        return input;
    }
}
