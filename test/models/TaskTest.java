package models;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import play.test.UnitTest;

public class TaskTest  extends UnitTest {	
	@Test
	public void createAndRetrieveTask() {
		User bob = new User("bob@gmail.com", "secret", "Bob").save();
	    
	    // Create a new post
	    new Task(bob, "My first post", "Hello world").save();
	    
	    // Test that the post has been created
	    assertEquals(1, Task.count());
	    
	    // Retrieve all posts created by Bob
	    List<Task> bobPosts = Task.find("byAuthor", bob).fetch();
	    
	    // Tests
	    assertEquals(1, bobPosts.size());
	    Task firstPost = bobPosts.get(0);
	    assertNotNull(firstPost);
	    assertEquals(bob, firstPost.author);
	    assertEquals("My first post", firstPost.title);
	    assertEquals("Hello world", firstPost.content);
	    assertNotNull(firstPost.postedAt);
	}

}
