package BlankCharacters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MainBlankCharactersTest {

	private MainBlankCharacters removeBC;
	@BeforeEach
	void setUp() throws Exception {
		this.removeBC = new MainBlankCharacters();
	}

	@Test
	void test1() {
		assertEquals(" abdullahsalama", this.removeBC.replaceBlankChars("  abdullahsalama"));
	}
	@Test
	void test2() {
		assertEquals(" abdullahsalama", this.removeBC.replaceBlankChars(" abdullahsalama"));
	}
	@Test
	void test3() {
		assertEquals("abdullahsalama ", this.removeBC.replaceBlankChars("abdullahsalama  "));
	}
	@Test
	void test4() {
		assertEquals("abdullahsalama ", this.removeBC.replaceBlankChars("abdullahsalama "));
	}
	@Test
	void test5() {
		assertEquals("abdullah salama", this.removeBC.replaceBlankChars("abdullah  salama"));
	}
	@Test
	void test6() {
		assertEquals("abdullah salama", this.removeBC.replaceBlankChars("abdullah salama"));
	}
	@Test
	void test7() {
		assertEquals("abdullahsalama", this.removeBC.replaceBlankChars("abdullahsalama"));
	}
	@Test
	void test8() {
		assertEquals(" abdullah salama ", this.removeBC.replaceBlankChars("  abdullah  salama  "));
	}
	@Test
	void test9() {
		assertEquals("abdullah salama ", this.removeBC.replaceBlankChars("abdullah  salama  "));
	}
	@Test
	void test10() {
		assertEquals(" abdullah salama", this.removeBC.replaceBlankChars("  abdullah  salama"));
	}
	@Test
	void test11() {
		assertEquals(" abdullahsalama ", this.removeBC.replaceBlankChars("  abdullahsalama  "));
	}

}
