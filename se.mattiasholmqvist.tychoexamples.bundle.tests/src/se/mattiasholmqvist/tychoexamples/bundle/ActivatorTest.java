package se.mattiasholmqvist.tychoexamples.bundle;

import org.junit.Assert;
import org.junit.Test;

public class ActivatorTest {

	@Test
	public void stupidActivatorTest() {
		Activator activator = Activator.getDefault();
		Assert.assertNotNull(activator);
	}

}
