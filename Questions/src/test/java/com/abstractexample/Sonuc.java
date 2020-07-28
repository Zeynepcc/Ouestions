package com.abstractexample;

import org.junit.Test;

public class Sonuc {
	
	@Test
	public void SonucMesaji()
	{
		Lise lisesecim = new AnadoluLisesi();
		lisesecim.setBulSehir("Balýkesir");
		lisesecim.setLiseAdi("Balýkesir Anadolu Lisesi");
		lisesecim.setLisePuan(450);
		lisesecim.KazanmaDurumu();
		lisesecim.LiseKayit();
	}

}
