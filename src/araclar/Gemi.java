package araclar;

public class Gemi implements DenizTasitlari {

	private String marka;
	private String rengi;
	private double hiz;
	private double fiyati;
	private int yolcuSayisi;
	private int tekerlekSayisi;
	private int uretimYili;
	private String uretimNo;
	
	private void setUretimNo(int no) {
		uretimNo = "Gemi_" + no;
	}
	
	public String getUretimNo() {
		return uretimNo;
	}
	
	@Override
	public String getMarka() {
		return marka;
	}

	@Override
	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public double getHiz() {
		return hiz;
	}

	@Override
	public void setHiz(double hiz) {
		this.hiz = hiz;
	}

	@Override
	public int getYolcuSayisi() {
		return yolcuSayisi;
	}

	@Override
	public void setYolcuSayisi(int yolcuSayisi) {
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public int getTekerlekSayisi() {
		return tekerlekSayisi;
	}

	@Override
	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi;
	}

	@Override
	public double getFiyati() {
		return fiyati;
	}

	@Override
	public void setFiyati(double fiyati) {
		this.fiyati = fiyati;
	}

	@Override
	public int getUretimYili() {
		return uretimYili;
	}

	@Override
	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	@Override
	public String getRengi() {
		return rengi;
	}

	@Override
	public void setRengi(String rengi) {
		this.rengi = rengi;
	}

	
	@Override
	public void hizlan(double hiz) {
		this.hiz += hiz;
	}

	@Override
	public void yavasla(double hiz) {
		if(this.hiz-hiz>0)
			this.hiz -=hiz;
		else this.hiz =0;
	}

	@Override
	public void dur() {
		hiz=0;
	}
	
	public Gemi(String marka, String rengi, double hiz, double fiyati, int yolcuSayisi, int tekerlekSayisi, int uretimYili, int uretimNo) {
		setMarka(marka);
		setRengi(rengi);
		setHiz(hiz);
		setFiyati(fiyati);
		setYolcuSayisi(yolcuSayisi);
		setTekerlekSayisi(tekerlekSayisi);
		setUretimYili(uretimYili);
		setUretimNo(uretimNo);
	}
	
	public Gemi() {
		setMarka("Belirtilmedi");
		setRengi("Beyaz");
		setHiz(0);
		setFiyati(0);
		setYolcuSayisi(0);
		setTekerlekSayisi(0);
		setUretimYili(2018);
		setUretimNo(-1);
	}

}

