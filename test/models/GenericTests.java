package models;

import org.junit.After;
import org.junit.Before;

import play.test.Fixtures;
import play.test.UnitTest;

public abstract class GenericTests extends UnitTest {
	@Before
	public void beforeTests() {
		// flush database before test
		Fixtures.deleteAllModels();
	}

	@After
	public void afterTests() {
		// flush database before test
		Fixtures.deleteAllModels();
	}
}
