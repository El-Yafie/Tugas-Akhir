package bangundatar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class SegiTiga extends BangunDatar {
   double alas;
	double tinggi;
	double sisiMiring;
        
    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        
    }    
	
   @Override
	public double hitungLuas() {
		luas = 0.5 * alas * tinggi;
		return luas;
	}
	
	public double hitungSisiMiring() {
		sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
		return sisiMiring;
	}
	
   @Override
	public double hitungKeliling() {
		keliling = alas + tinggi + sisiMiring;
		return keliling;
	}
}
