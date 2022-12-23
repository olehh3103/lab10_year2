package part1Test.adapter;

import org.junit.jupiter.api.Test;
import part1.adapter.Authorization;
import part1.adapter.DataBase;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization authorization = new Authorization();

    @Test
    void authorizationing() {
        assertEquals(authorization.authorizationing(new DataBase()), true);
    }
}