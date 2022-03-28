package segitigaSiku.calcSegitiga;

public class calculatorSegitiga {
	private cariSisi Sisi = new cariSisi();
	
	//	mencari keliling segitiga dengan parameter alas dan tinggi
	public double kelilingSegitigaAlasTinggi(int alas, int tinggi) {
		double miring = Sisi.cariMiring(alas, tinggi);
		double keliling = miring + alas + tinggi;
		return keliling;
	}
	
	//	mencari keliling segitiga dengan parameter miring dan panjang salh satu sisi
	// X adalah salah satu sisi yang bukan miring (tinggi atau alas)	
	public double kelilingSegitigaMiringX(int miring, int x) {
		double sisiSiku = Sisi.cariSisiSiku(miring, x);
		double keliling = miring + x + sisiSiku;
		return keliling;
	}
	
	//	mencari luas segitiga dengan parameter alas dan tinggi
	public double luasSegitigaAlasTinggi(int alas, int tinggi) {
		double luas = (alas * tinggi)/2;
		return luas;
	}

	//	mencari luas segitiga dengan parameter miring dan salah satu sisi
	// x adalah salah satu sisi yang bukan miring (tinggi atau alas)
	public double luasSegitigaMiringX(int miring, int x) {
		double sisiSiku = Sisi.cariSisiSiku(miring, x);
		double luas = (x * sisiSiku)/2;
		return luas;	}
	
}
