package segitigaSiku.calcSegitiga;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class calculatorSegitigaTest {

	private calculatorSegitiga calc;
	
	@BeforeEach
	public void setUp() {
		calc = new calculatorSegitiga();
	}
	@Test
	@DisplayName("Keliling dengan yang diketahui sisi alas dan tinggi")
	void testKelilingSegitigaAlasTinggi() {
		int alas = 4;
		int tinggi = 3;
		assertEquals(12, calc.kelilingSegitigaAlasTinggi(alas, tinggi));
	}

	@Test
	@DisplayName("Keliling dengan yang diketahui sisi miring dan salah satu sisi antara tinggi atau alas")
	//	x adalah panjang sisi antara tinggi atau alas
	void testKelilingSegitigaMiringX() {
		int miring = 13;
		int x = 5;
		assertEquals(30, calc.kelilingSegitigaMiringX(miring, x));
	}

	@Test
	@DisplayName("Luas dengan yang diketahui alas dan tinggi")
	void testLuasSegitigaAlasTinggi() {
		int alas = 4;
		int tinggi = 3;
		assertEquals(6, calc.luasSegitigaAlasTinggi(alas, tinggi));
	}

	@Test
	@DisplayName("Luas dengan yang diketahui sisi miring dan salah satu sisi antara tinggi atau alas")
	// X adalah panjang sisi antara tinggi atau alas
	void testLuasSegitigaMiringX() {
		int miring = 13;
		int x = 5;
		assertEquals(30, calc.kelilingSegitigaMiringX(miring, x));
	}

}
