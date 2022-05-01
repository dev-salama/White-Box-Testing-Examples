package TriangleType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTriangleTypeTest {

	private MainTriangleType triType;
	@BeforeEach
	void setUp() throws Exception {
		this.triType = new MainTriangleType();
	}

	@Test
	void test1() {
		assertEquals("Equilateral", this.triType.triangleType(1, 1, 1));
	}
	@Test
	void test2() {
		assertEquals("Scalene", this.triType.triangleType(2, 3, 4));
	}
	@Test
	void test3() {
		assertEquals("Isosceles", this.triType.triangleType(4, 4, 5));
	}
	@Test
	void test4() {
		assertEquals("Isosceles", this.triType.triangleType(4, 5, 4));
	}
	@Test
	void test5() {
		assertEquals("Isosceles", this.triType.triangleType(5, 4, 4));
	}
	@Test
	void test6() {
		assertEquals("Not a Triangle", this.triType.triangleType(1, 1, 2));
	}
	@Test
	void test7() {
		assertEquals("Not Valid", this.triType.triangleType(0, 1, 1));
	}
	@Test
	void test8() {
		assertEquals("Not Valid", this.triType.triangleType(-1, 1, 1));
	}

}
