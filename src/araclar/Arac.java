package araclar;

public interface Arac {
	
	public String getMarka();
	public void setMarka(String marka);
	public double getHiz();
	public void setHiz(double hiz);
	public int getYolcuSayisi();
	public void setYolcuSayisi(int yolcuSayisi);
	public int getTekerlekSayisi();
	public void setTekerlekSayisi(int tekerlekSayisi);
	public double getFiyati();
	public void setFiyati(double fiyati);
	public int getUretimYili();
	public void setUretimYili(int uretimYili);
	public String getRengi();
	public void setRengi(String rengi);
	
	public void hizlan(double hiz);
	public void yavasla(double hiz);
	public void dur();
}
