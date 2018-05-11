package araclar;

public class Ucak extends HavaTasitlari{

	private String uretimNo;
	
	public void setUretimNo(int no) {
		uretimNo = "Ucak_" + no;
	}
	
	public String getUretimNo() {
		return uretimNo;
	}
	
	public Ucak(String marka, String rengi, double hiz, double fiyati, int yolcuSayisi, int tekerlekSayisi, int uretimYili, boolean inis, int uretimNo) {
		super.setMarka(marka);
		super.setRengi(rengi);
		super.setHiz(hiz);
		super.setFiyati(fiyati);
		super.setYolcuSayisi(yolcuSayisi);
		super.setTekerlekSayisi(tekerlekSayisi);
		super.setUretimYili(uretimYili);
		super.setInis(inis);
		setUretimNo(uretimNo);
	}
	
	public Ucak() {
		super.setMarka("Belirtilmedi");
		super.setRengi("Beyaz");
		super.setHiz(0);
		super.setFiyati(0);
		super.setYolcuSayisi(0);
		super.setTekerlekSayisi(4);
		super.setUretimYili(2018);
		super.setInis(true);
		setUretimNo(-1);
	}

}
