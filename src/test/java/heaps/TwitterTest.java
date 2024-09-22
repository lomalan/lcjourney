package heaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwitterTest {

    private final Twitter twitter = new Twitter();

    @Test
    public void test() {
        twitter.postTweet(1, 5);
        var firstUserNewsFeed = twitter.getNewsFeed(1);
        assertEquals(1, firstUserNewsFeed.size());
        assertEquals(5, firstUserNewsFeed.getFirst());

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        firstUserNewsFeed = twitter.getNewsFeed(1);
        assertEquals(2, firstUserNewsFeed.size());
        assertEquals(6, firstUserNewsFeed.getFirst());
        assertEquals(5, firstUserNewsFeed.get(1));

        twitter.unfollow(1, 2);
        firstUserNewsFeed = twitter.getNewsFeed(1);
        assertEquals(1, firstUserNewsFeed.size());
        assertEquals(5, firstUserNewsFeed.getFirst());
    }
}
