import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeServiceTest {

    // добавь два поля класса: для проверяемой строки и ожидаемого результата
    private final String checkedText;
    private final boolean expected;

    private final String message;

    public PalindromeServiceTest(String checkedText, boolean expected,String message) {
        this.checkedText = checkedText;
        this.expected = expected;
        this.message = message;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"anna", false, "Является палиндромом"},
                {"anka", true, "не является палиндромом"},
                {"q", true, "Является палиндромом"},
        };
    }

    @Test
    public void shouldCheckPalindrome() {
        PalindromeService palindromeService = new PalindromeService();
        boolean actual = palindromeService.isPalindrome(checkedText);
        assertEquals(message,expected, actual);
    }
}