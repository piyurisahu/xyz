package StringCoding;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void test() {
		assertTrue(AnagramString.isAnaram("abcd", "adcb"));
		assertTrue(AnagramString.isAnaram("xyz", "lyx"));
	}

}
