package es.upm.miw.iwvg.ecosystem.junit;

import es.upm.miw.iwvg.ecosystem.practica.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;
    @BeforeEach
    void before(){
        fraction = new Fraction(1,2);
    }


    @Test
    private void testDecimal(){
        assertEquals(0.5,fraction.decimal());
    }
}
