package stringCahin.stringCahin;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class Integration_A_BTest {
    @Test
    public void TestIntegration_A_BTest(){
        CStub cStub = new CStub();
        B realB  = new B(cStub);
        A realA = new A(realB);

        String result = realA.process("");

        assertEquals("HE", result);

    }


}