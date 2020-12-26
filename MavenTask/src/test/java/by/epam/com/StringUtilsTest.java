package by.epam.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void isPositiveNumberTest() {
        StringUtils stringUtils = new StringUtils();
        String data = "5";
        boolean actual = stringUtils.isPositiveNumber(data);
        assertTrue(actual);
    }
}