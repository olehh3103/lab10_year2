package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    DataBase db = new DataBase();

    @Test
    void getUserData() {
        assertEquals(db.getUserData(), "hello");
    }

    @Test
    void getStatisticData() {
        assertEquals(db.getStatisticData(), "hello2");
    }
}