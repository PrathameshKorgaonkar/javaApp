package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testAppMessageChange() {
        App app = new App();
        String newMessage = "New Message!";
        app.setMessage(newMessage);
        assertEquals(newMessage, app.getMessage());
    }

    @Test
    public void testAppMessageNotNull() {
        App app = new App();
        assertNotNull(app.getMessage());
    }
    
    @Test
    public void testAppMessageLength() {
        App app = new App();
        assertEquals(12, app.getMessage().length());
    }

    @Test
    public void testAppMessageUpperCase() {
	App app = new App();
	assertEquals("HELLO WORLD!", app.getMessage());
    }
}


    

