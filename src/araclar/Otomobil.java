package araclar;

public class Otomobil extends KaraTasitlari {

	private String yakitTuru;
	private String[] yakitTurleri = {"Benzinli", "Dizel", "LPG"};
	private String uretimNo;
	
	private void setUretimNo(int no) {
		uretimNo = "Otomobil_" + no;
	}
	
	public String getUretimNo() {
		return uretimNo;
	}
	
	public String getYakitTuru() {
		return yakitTuru;
	}
	
	public void setYakitTuru(String yakitTuru) {
		this.yakitTuru = yakitTuru;
	}
	
	public Otomobil(String marka, String rengi, double hiz, double fiyati, int yolcuSayisi, int tekerlekSayisi, int uretimYili, String yakitTuru, int uretimNo) {
		super.setMarka(marka);
		super.setRengi(rengi);
		super.setHiz(hiz);
		super.setFiyati(fiyati);
		super.setYolcuSayisi(yolcuSayisi);
		super.setTekerlekSayisi(tekerlekSayisi);
		super.setUretimYili(uretimYili);
		setYakitTuru(yakitTuru);
		setUretimNo(uretimNo);
	}
	
	public Otomobil() {
		super.setMarka("Belirtilmedi");
		super.setRengi("Beyaz");
		super.setHiz(0);
		super.setFiyati(0);
		super.setYolcuSayisi(0);
		super.setTekerlekSayisi(4);
		super.setUretimYili(2018);
		setYakitTuru(yakitTurleri[0]);
		setUretimNo(-1);
	}
}
