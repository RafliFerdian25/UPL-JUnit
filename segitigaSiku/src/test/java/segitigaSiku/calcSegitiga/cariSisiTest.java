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
	@Test
	void testCariMiring() {
		fail("Not yet implemented");
	}
	
	//Mencari sisi siku (tinggi)
	@Test
	@DisplayName("Panjang sisi tinggi")
	@ParameterizedTest(name= "{index} => miring={0}, alas={1}, sum={2}")
	@CsvSource({"1,2,3","4,5,9"})
	public void testCariSisiTinggi(int miring, int alas, int sum) {
		sisi.cariSisiSiku(sum, sisi.cariSisiSiku(miring, alas));
	}
//		public void testPenjumlahanDenganBanyakData(int a,int b, int sum) {
//			calc.tambah(sum, calc.tambah(a,b));
//		}
//		
		//Mencari sisi siku (Alas)
		//mencari miring
		//mencari miring jika panjang alas dan tinggi sama

}
