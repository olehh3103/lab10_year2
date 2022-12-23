package part2;

import part2.adapter.FacebookUserAdapter;
import part2.adapter.TwitterUserAdapter;
import part2.user.MessageSender;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MessageSender msgSender = new MessageSender();
        FacebookUser fbUser = new FacebookUser("someone@gmail.com", "Ukraine", new Date(), "");
        TwitterUser twUser = new TwitterUser("someone1@gmail.com", "England", new Date(), "");
        FacebookUserAdapter fbAdapter = new FacebookUserAdapter(fbUser);
        TwitterUserAdapter twAdapter = new TwitterUserAdapter(twUser);
        msgSender.send("Wow!", fbAdapter, "Ukraine");
        msgSender.send("Wow!", twAdapter, "Ukraine");
        System.out.println(fbUser.getMessage());
        System.out.println(twUser.getMessage());
    }
}
