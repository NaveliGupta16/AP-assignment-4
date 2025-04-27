import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    public void testGreet() {
        Greeter greeter = new Greeter();
        String result = greeter.greet("Naveli");
        assertEquals("Hello, Naveli", result);
    }
}
