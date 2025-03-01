import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FactorialTest {

    @Test
    void fact() {
//        Factorial fact = new Factorial();

        int op = Factorial.fact(5);
        int eop = 120;
        assertEquals(eop, op);

    }
}