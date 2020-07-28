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
			System.out.println(getBulSehir()+" �ehrindeki "+getLiseAdi()+" lisesini kazand�n�z.");
		}
		else
		{
			System.out.println(getBulSehir()+" �ehrindeki "+getLiseAdi()+" lisesini kazanamad�n�z.");
		}
		
	}

}
