package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest{
	
	@Test
    public void testAdd()
    {
        assertEquals(3,App.add(1, 2));
    }
}
