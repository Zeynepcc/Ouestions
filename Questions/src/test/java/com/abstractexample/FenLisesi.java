package com.abstractexample;

public class FenLisesi extends Lise {

	@Override
	public void KazanmaDurumu() {
		
		if(getLisePuan() > 450)
		{
			setDurum(true);
		}
		else
		{
			setDurum(false);
		}
		
	}
	@Override
	public void LiseKayit() {

		if(getDurum() == true)
		{
			System.out.println(getBulSehir()+" şehrindeki "+getLiseAdi()+" lisesini kazandınız.");
		}
		else
		{
			System.out.println(getBulSehir()+" şehrindeki "+getLiseAdi()+" lisesini kazanamadınız.");
		}
		
	
	}


}
