package araclar;

public class Bisiklet extends KaraTasitlari {

	private String uretimNo;
	
	private void setUretimNo(int no) {
		uretimNo = "Bisiklet_" + no;
	}
	
	public String getUretimNo() {
		return uretimNo;
	}
	
	public Bisiklet(String marka, String rengi, double hiz, double fiyati, int yolcuSayisi, int tekerlekSayisi, int uretimYili, int uretimNo) {
		super.setMarka(marka);
		super.setRengi(rengi);
		super.setHiz(hiz);
		super.setFiyati(fiyati);
		super.setYolcuSayisi(yolcuSayisi);
		super.setTekerlekSayisi(tekerlekSayisi);
		super.setUretimYili(uretimYili);
		setUretimNo(uretimNo);
	}
	
	public Bisiklet() {
		super.setMarka("Belirtilmedi");
		super.setRengi("Beyaz");
		super.setHiz(0);
		super.setFiyati(0);
		super.setYolcuSayisi(0);
		super.setTekerlekSayisi(4);
		super.setUretimYili(2018);
		setUretimNo(-1);
	}
	
}
