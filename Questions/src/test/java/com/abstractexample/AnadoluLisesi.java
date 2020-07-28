package com.abstractexample;

public class AnadoluLisesi extends Lise{

	
	@Override
	public void KazanmaDurumu() {
		

		if(400 < getLisePuan())
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
