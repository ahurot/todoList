package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import play.test.Fixtures;
import play.test.UnitTest;

public class IntegrationTests extends GenericTests {

	@Test
	public void fullTest() {
		Fixtures.loadModels("data.yml");
		// Count things
		assertEquals(2, User.count());
		assertEquals(1, Task.count());
	}
}
