package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestSnakeCamel {

	@Test
	public void snakeToCamelcaseで大文字・小文字の形に直す() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDe";
		String actual = scu.snakeToCamelcase("abc_de_ ");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecaseで小文字に変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_de";
		String actual = scu.camelToSnakecase("AbcDe");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void capitalizeで小文字に変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void uncapitalizeで小文字に変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual,is(expected));
	}
}
