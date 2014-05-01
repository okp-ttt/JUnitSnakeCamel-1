package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestSnakeCamel {

	@Test
	public void snakeToCamelcase�ő啶���E�������̌`�ɒ���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDe";
		String actual = scu.snakeToCamelcase("abc_de_ ");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecase�ŏ������ɕϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_de";
		String actual = scu.camelToSnakecase("AbcDe");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void capitalize�ŏ������ɕϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void uncapitalize�ŏ������ɕϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual,is(expected));
	}
}
