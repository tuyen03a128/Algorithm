/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution355;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution355Test {
    
    public Solution355Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of postTweet method, of class Solution355.
     */
    @Test
    public void testPostTweet() {
        System.out.println("postTweet");
        int userId = 0;
        int tweetId = 0;
        Solution355 twitter = new Solution355();
        // User 1 posts a new tweet (id = 5).
        twitter.postTweet(1, 5);
        List<Integer> list1 = new ArrayList();
        list1.add(5);
        // User 1's news feed should return a list with 1 tweet id -> [5].
        assertEquals(list1, twitter.getNewsFeed(1));
        
        // User 1 follows user 2.
        twitter.follow(1, 2);

        // User 2 posts a new tweet (id = 6).
        twitter.postTweet(2, 6);

        // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
        // Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        List<Integer> list2 = new ArrayList();
        list2.add(6);
        list2.add(5);
        assertEquals(list2, twitter.getNewsFeed(1));

        // User 1 unfollows user 2.
        twitter.unfollow(1, 2);

        // User 1's news feed should return a list with 1 tweet id -> [5],
        // since user 1 is no longer following user 2.
        List<Integer> list3 = new ArrayList();
        list3.add(5);
        assertEquals(list1, twitter.getNewsFeed(1));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}