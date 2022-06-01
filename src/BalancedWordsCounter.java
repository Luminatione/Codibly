import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class BalancedWordsCounter
{
    private boolean isBalanced(String word)
    {
        int[] chars = new int[256];
        for (int i = 0; i < word.length(); ++i)
        {
            chars[word.charAt(i)]++;
        }
        int val = 0;
        for (int i = 65; i < 123; ++i)
        {
            if (val != 0 && chars[i] != val && chars[i] != 0)
            {
                return false;
            }
            val = chars[i];
        }
        return true;
    }

    public Integer count(String input)
    {
        if (input == null)
        {
            throw new NullPointerException();
        }
        if (!input.chars().allMatch(Character::isLetter))
        {
            throw new IllegalArgumentException("String contains illegal characters");
        }
        ArrayList<String> words = new ArrayList<>(input.length() * input.length());
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = i + 1; j <= input.length(); j++)
            {
                words.add(input.substring(i, j));
            }
        }
        int balancedWords = 0;
        for (String word : words)
        {
            balancedWords += isBalanced(word) ? 1 : 0;
        }
        return balancedWords;
    }
}
