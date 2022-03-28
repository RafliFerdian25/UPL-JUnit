package segitigaSiku.calcSegitiga;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class cariSisiTest {
	
	private cariSisi sisi;
	
	@BeforeEach
	public void setUp() {
		sisi = new cariSisi();
	}
	
	//mencari miring dari tinggi dan alas
	@Test
	@DisplayName("Panjang sisi miring")
	public void testCariMiring() {
		int alas = 3;
		int tinggi = 4;
		assertEquals(5, sisi.cariMiring(tinggi, alas));
	}
	
	//Mencari sisi siku (tinggi)
	@Test
	@DisplayName("Panjang sisi tinggi")
	public void testCariSisiTinggi() {
		int miring = 5;
		int x = 3;
		assertEquals(4, sisi.cariSisiSiku(miring, x));
	}
	
	//Mencari sisi siku (Alas)
	@Test
	@DisplayName("Panjang sisi alas")
	public void testCariSisiAlas() {
		int miring = 5;
		int x = 4;
		assertEquals(3, sisi.cariSisiSiku(miring, x));
	}

}
