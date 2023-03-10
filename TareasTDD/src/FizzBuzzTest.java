import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @org.junit.jupiter.api.Test
public void testProbarNumerosUnoyDos() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("1", fizzBuzz.convertir(1));
    assertEquals("2", fizzBuzz.convertir(2));
}
    @org.junit.jupiter.api.Test
    public void testProbarNumeroTres() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convertir(3));
    }
}