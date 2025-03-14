/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.bai5.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ductuan
 */
public class UserTest {

    @Test
    public void testGetEmail() {
        User user = new User("U001", "test@example.com");
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    public void testSetEmail() {
        User user = new User("U002", "old@example.com");
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }

    @Test
    public void testUpdateEmail() {
        User user = new User("U003", "before@example.com");
        user.updateEmail("after@example.com");
        assertEquals("after@example.com", user.getEmail());
    }
}