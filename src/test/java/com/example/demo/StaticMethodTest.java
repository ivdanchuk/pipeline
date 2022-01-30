package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.example.demo.StaticMethod")

public class StaticMethodTest {
    @Test
    public void Test1 (){
        //ok
		mockStatic(StaticMethod.class);
        when(StaticMethod.Hello()).thenReturn("Hello Baeldung!");
        String firstWelcome = StaticMethod.Hello();
        assertEquals("Helo Baeldung!", firstWelcome);
    }
    @Test
    public void Test2 (){
        mockStatic(StaticMethod.class);
        when(StaticMethod.Hello()).thenReturn("Hello Baeldung!");
        String firstWelcome = StaticMethod.Hello();
        assertEquals("Hello Baeldung!", firstWelcome);
    }

}
