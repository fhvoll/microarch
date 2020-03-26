import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private int testInt = 2;

    @Test
    void addition() {
        assertEquals(2, testInt);
    }
}