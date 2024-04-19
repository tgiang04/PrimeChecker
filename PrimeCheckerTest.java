
import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void testIsPrime_WithPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    public void testIsPrime_WithNonPrimeNumber() {
        assertFalse(PrimeChecker.isPrime(8));
    }

    @Test
    public void testIsPrime_WithOne() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    public void testIsPrime_WithNegativeNumber() {
        assertFalse(PrimeChecker.isPrime(-5));
    }
}
