package stringCahin.stringCahin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BUnitTest {
    @Test
    public void testBWithStub() {
        // יוצרים סטאב של C
        CStub stub = new CStub();
        // יוצרים את B עם הסטאב של C
        B b  = new B(stub);

        // קוראים ל־b — לא לסטאב!
        String result = b.process("H");

        // מאמתים את הפלט
        assertEquals("HE", result);
    }
}

