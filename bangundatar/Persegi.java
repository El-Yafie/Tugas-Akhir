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
public class Persegi extends BangunDatar {
    double sisi;
	double luas;
	double keliling;
        
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
	public double hitungLuas() {
		luas = sisi * sisi;
		return luas;
	}
	
    @Override
	public double hitungKeliling() {
		keliling = sisi * 4;
		return keliling;
	}
}
