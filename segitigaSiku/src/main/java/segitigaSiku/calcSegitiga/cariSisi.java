package segitigaSiku.calcSegitiga;

public class cariSisi {
	// mencari panjang sisi miring
	public double cariMiring(int tinggi, int alas) {
		double miring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(alas, 2));
		return miring;
	}
	// mencari panjang salah satu sisi siku
	public double cariSisiSiku(int miring, int x) {
		double sisiSiku = Math.sqrt(Math.pow(miring, 2) - Math.pow(x, 2));
		return sisiSiku;
	}
}
