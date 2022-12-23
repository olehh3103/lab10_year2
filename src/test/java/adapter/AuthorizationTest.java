package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization authorization = new Authorization();

    @Test
    void authorizationing() {
        assertEquals(authorization.authorizationing(new DataBase()), true);
    }
}