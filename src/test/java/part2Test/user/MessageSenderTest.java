package part2Test.user;


import part2.adapter.FacebookUserAdapter;
import part2.adapter.TwitterUserAdapter;
import part2.FacebookUser;
import org.junit.jupiter.api.Test;
import part2.TwitterUser;
import part2.user.MessageSender;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender msgSender = new MessageSender();
    FacebookUser fbUser = new FacebookUser("someone@gmail.com", "Ukraine", new Date(), "");
    TwitterUser twUser = new TwitterUser("someone1@gmail.com", "England", new Date(), "");
    FacebookUserAdapter fbAdapter = new FacebookUserAdapter(fbUser);
    TwitterUserAdapter twAdapter = new TwitterUserAdapter(twUser);

    @Test
    void send() {
        msgSender.send("Wow!", fbAdapter, "Ukraine");
        assertEquals(fbUser.getMessage(), "Wow!");
        msgSender.send("Wow!", twAdapter, "Ukraine");
        assertEquals("", twUser.getMessage());
    }
}