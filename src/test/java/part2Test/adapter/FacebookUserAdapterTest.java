package part2Test.adapter;

import part2.FacebookUser;
import org.junit.jupiter.api.Test;
import part2.adapter.FacebookUserAdapter;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookUserAdapterTest {
    FacebookUser user = new FacebookUser("someone@gmail.com", "Ukraine", new Date(), "");
    FacebookUserAdapter fbAdapter = new FacebookUserAdapter(user);

    @Test
    void getCountry() {
        assertEquals(fbAdapter.getCountry(), "Ukraine");
    }

    @Test
    void getUserEmail() {
        assertEquals(fbAdapter.getUserEmail(), "someone@gmail.com");
    }

    @Test
    void setMessage() {
        fbAdapter.setMessage("Wow!");
        assertEquals(fbAdapter.getMessage(), "Wow!");
    }

    @Test
    void getMessage() {
        assertEquals(fbAdapter.getMessage(), "");
    }
}