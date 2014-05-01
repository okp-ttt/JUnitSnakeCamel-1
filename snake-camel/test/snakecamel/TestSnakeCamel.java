package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestSnakeCamel {

	@Test
	public void snakeToCamelcase‚Å‘å•¶šE¬•¶š‚ÌŒ`‚É’¼‚·() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDe";
		String actual = scu.snakeToCamelcase("abc_de_ ");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecase‚Å¬•¶š‚É•ÏŠ·() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_de";
		String actual = scu.camelToSnakecase("AbcDe");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void capitalize‚Å¬•¶š‚É•ÏŠ·() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void uncapitalize‚Å¬•¶š‚É•ÏŠ·() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual,is(expected));
	}
}
