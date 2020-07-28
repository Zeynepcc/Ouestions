package com.abstractexample;

public abstract class Lise {
	
	private String liseAdi;
	private String BulSehir;
	private int LisePuan;
	private boolean durum;
	public boolean getDurum() {
		return durum;
	}
	public void setDurum(boolean durum) {
		this.durum = durum;
	}
	public String getLiseAdi() {
		return liseAdi;
	}
	public void setLiseAdi(String liseAdi) {
		this.liseAdi = liseAdi;
	}
	public String getBulSehir() {
		return BulSehir;
	}
	public void setBulSehir(String bulSehir) {
		BulSehir = bulSehir;
	}
	public int getLisePuan() {
		return LisePuan;
	}
	public void setLisePuan(int lisePuan) {
		LisePuan = lisePuan;
	}
	public abstract void LiseKayit();
	public abstract void KazanmaDurumu();

}
