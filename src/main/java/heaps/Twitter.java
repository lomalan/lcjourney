package heaps;

import java.util.*;

public class Twitter {

    private final HashMap<Integer, HashSet<Integer>> followers =
        new HashMap<>();
    private int timestamp;
    private final HashMap<Integer, List<TweetData>> tweets = new HashMap<>();

    public Twitter() {
        timestamp = 0;
    }

    public void postTweet(int userId, int tweetId) {
        var tweetData = new TweetData(timestamp++, tweetId);
        var list = tweets.getOrDefault(userId, new ArrayList<>());
        list.add(tweetData);
        tweets.put(userId, list);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new ArrayList<>();
        PriorityQueue<TweetData> maxHeap = new PriorityQueue<>(
            (a, b) -> b.timestamp - a.timestamp
        );
        var userTweets = tweets.getOrDefault(userId, new ArrayList<>());
        maxHeap.addAll(userTweets);
        var followees = followers.getOrDefault(userId, new HashSet<>());
        for (var followeeId : followees) {
            var tweetData = tweets.getOrDefault(followeeId, new ArrayList<>());
            maxHeap.addAll(tweetData);
        }
        while (!maxHeap.isEmpty() && newsFeed.size() < 10) {
            var tweetData = maxHeap.poll();
            newsFeed.add(tweetData.tweetId);
        }
        return newsFeed;
    }

    public void follow(int followerId, int followeeId) {
        var followees = followers.getOrDefault(followerId, new HashSet<>());
        followees.add(followeeId);
        followers.put(followerId, followees);
    }

    public void unfollow(int followerId, int followeeId) {
        var followees = followers.getOrDefault(followerId, new HashSet<>());
        followees.remove(followeeId);
        followers.put(followerId, followees);
    }

    private record TweetData(int timestamp, int tweetId) {}
}
