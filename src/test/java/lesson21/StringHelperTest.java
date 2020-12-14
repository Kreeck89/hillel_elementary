package lesson21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    private StringHelper stringHelper;

    @BeforeEach
    void setUp() {
        stringHelper = new StringHelper();
    }

    @Test
    void checkWithLongerString() {
        boolean hello = stringHelper.check("Hello", 2);
        assertFalse(hello, "stringHelper.check: error");
    }

    @Test
    void checkWithShorterString() {
        boolean hello = stringHelper.check("Hello", 10);
        assertTrue(hello, "stringHelper.check: error");
    }

    @Test
    @Disabled
    void checkWithNull() {
        assertThrows(NullPointerException.class, () -> stringHelper.check(null, 10), "Check with null error");
    }
}
