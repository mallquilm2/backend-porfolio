package com.example.demo.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.service.TweetService;

import twitter4j.*;

@Service
public class TweetServiceImpl implements TweetService{
	
    Twitter twitter = new TwitterFactory().getInstance();
	
	@Override
	public List<String> getLatestTweets() {
		List<String> tweets = new ArrayList<>();
        try {
            ResponseList<Status> homeTimeline = twitter.getHomeTimeline();
            for (Status status : homeTimeline) {
                tweets.add(status.getText());
            }
        } catch (TwitterException e) {
            throw new RuntimeException(e);
        }
        return tweets;
	}
	

}
