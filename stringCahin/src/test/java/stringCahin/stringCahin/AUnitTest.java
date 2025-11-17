package stringCahin.stringCahin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AUnitTest {
    @Test
    public void testAWithStub() {
        // יוצרים סטאב של B
        BStub stub = new BStub();
        // יוצרים את C עם הסטאב
        A a = new A(stub);

        // קוראים ל־a — לא לסטאב!
        String result = a.process("HE");

        // מאמתים את הפלט
        assertEquals("HEH", result);
    }
}

