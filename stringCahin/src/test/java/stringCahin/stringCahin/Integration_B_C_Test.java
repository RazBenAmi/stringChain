package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Integration_B_C_Test {
    @Test
    public void TestIntegration_B_C_Test(){
        DStub dStub = new DStub();
        C realC  = new C(dStub);
        B realB = new B(realC);

        String result = realB.process("H");

        assertEquals("HELX", result);

    }

}
