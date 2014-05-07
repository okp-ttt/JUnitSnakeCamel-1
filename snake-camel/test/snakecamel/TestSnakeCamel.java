package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestSnakeCamel {

	@Test
	public void snakeToCamelcaseÇ≈ëÂï∂éöÅEè¨ï∂éöÇÃå`Ç…íºÇ∑() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected1 = "Abc";
		String expected2 = "AbcDef";
		String expected3 = "AbcDefGh";
		String expected4 = "AbcDefGh";
		String expected5 = "AbcDef";
		String actual1 = scu.snakeToCamelcase("abc");
		String actual2 = scu.snakeToCamelcase("abc_def");
		String actual3 = scu.snakeToCamelcase("abc_def_gh");
		String actual4 = scu.snakeToCamelcase("abc__def___gh");
		String actual5 = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));
		assertThat(actual3,is(expected3));
		assertThat(actual4,is(expected4));
		assertThat(actual5,is(expected5));
	}
	
	@Test
	public void camelToSnakecaseÇ≈è¨ï∂éöÇ…ïœä∑() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected1 = "abc";
		String expected2 = "abc_def";
		String expected3 = "abc_def_gh";
		String actual1 = scu.camelToSnakecase("Abc");
		String actual2 = scu.camelToSnakecase("AbcDef");
		String actual3 = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));
		assertThat(actual3,is(expected3));
	}
	
	@Test
	public void capitalizeëÂï∂éöÇ…ïœä∑() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected1 = "";
		String expected2 = "A";
		String expected3 = "Xyz";
		String actual1 = scu.capitalize("");
		String actual2 = scu.capitalize("a");
		String actual3 = scu.capitalize("xyz");
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));
		assertThat(actual3,is(expected3));
	}
	
	@Test
	public void uncapitalizeÇ≈è¨ï∂éöÇ…ïœä∑() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected1 = "";
		String expected2 = "a";
		String expected3 = "xyz";
		String actual1 = scu.uncapitalize("");
		String actual2 = scu.uncapitalize("A");
		String actual3 = scu.uncapitalize("Xyz");
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));
		assertThat(actual3,is(expected3));
	}
}
