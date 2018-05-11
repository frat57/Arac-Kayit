package araclar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass{

	private static ArrayList<String> yazdir = new ArrayList<String>();
	private static int otomobilSayisi, bisikletSayisi, gemiSayisi, ucakSayisi, ucanGemiSayisi;
	private static boolean cikis= true;
	private static Scanner scan = new Scanner(System.in);
	private static String path = "file:..\\..\\AracKayit.txt";
	
	public static void main(String[] args) {
		//Başlat
		otomobilSayisi=1; bisikletSayisi=1; gemiSayisi=1; ucakSayisi=1; ucanGemiSayisi=1;
		//txt den sayıları oku
		try {
			File file = new File(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String line;
			while((line = br.readLine()) != null) {
				if(line.substring(0, 8).equals("Otomobil")) otomobilSayisi++;
				if(line.substring(0, 8).equals("Bisiklet")) bisikletSayisi++;
				if(line.substring(0, 4).equals("Ucak")) ucakSayisi++;
				if(line.substring(0, 4).equals("Gemi")) gemiSayisi++;
				if(line.substring(0, 8).equals("UcanGemi")) ucanGemiSayisi++;
			}
			br.close();
		}catch(IOException io) {
			System.out.println("txt okunurken hata!");
		}
		//Ana döngü
		do {
			System.out.println("Yapmak istediğiniz işlemi seçiniz");
			System.out.println("1.Veri Girişinde Bulun\n2.Veri Listele\n3.Veri Güncelle\n4.Cıkış");
			String islem = scan.nextLine();
			if(islem.equals("1")) {
				veriGiris();
			}
			else if(islem.equals("2")) {
				veriListele();
			}
			else if(islem.equals("3")){
				veriGuncelle();
			}
			else if(islem.equals("4")){
				cikis=false;
			}
			else {
				System.out.println("Lütfen 1-4 sayı aralığında bir sayı seçiniz");
			}
		}while(cikis);
	}
	
	public static void veriGiris() {
		boolean dongu;
		do {
			dongu = false;
			System.out.println("Veri girişinde bulunucağınız aracı seçiniz");
			System.out.println("1.Araba\n2.Bisiklet\n3.Gemi\n4.Uçak\n5.Uçan Gemi\n6.Geri Dön\n7.Cıkış");
			String islem = scan.nextLine();
			if(islem.equals("1")) {
				System.out.println("Otomobilin");
				System.out.println("Markası");
				String marka = scan.nextLine();
				System.out.println("Rengi");
				String renk = scan.nextLine();
				System.out.println("Hızı");
				int hiz = scan.nextInt();
				System.out.println("Fiyatı");
				double fiyat = scan.nextDouble();
				System.out.println("Yolcu Sayısı");
				int yolcuSayisi = scan.nextInt();
				System.out.println("Tekerlek Sayısı");
				int tekerlekSayisi = scan.nextInt();
				System.out.println("Üretim Yılı");
				int uretimYili = scan.nextInt();
				System.out.println("Yakıt Türü");
				String yakitTuru = scan.next();
				Otomobil o = new Otomobil(marka, renk, hiz, fiyat, yolcuSayisi, tekerlekSayisi, uretimYili, yakitTuru, otomobilSayisi);
				dosyayaYaz(o);
				otomobilSayisi++;
			}
			else if(islem.equals("2")) {
				System.out.println("Bisikletin");
				System.out.println("Markası");
				String marka = scan.nextLine();
				System.out.println("Rengi");
				String renk = scan.nextLine();
				System.out.println("Hızı");
				int hiz = scan.nextInt();
				System.out.println("Fiyatı");
				int fiyat = scan.nextInt();
				System.out.println("Yolcu Sayısı");
				int yolcuSayisi = scan.nextInt();
				System.out.println("Tekerlek Sayısı");
				int tekerlekSayisi = scan.nextInt();
				System.out.println("Üretim Yılı");
				int uretimYili = scan.nextInt();
				Bisiklet b = new Bisiklet(marka, renk, hiz, fiyat, yolcuSayisi, tekerlekSayisi, uretimYili, bisikletSayisi);
				dosyayaYaz(b);
				bisikletSayisi++;
			}
			else if(islem.equals("3")) {
				System.out.println("Uçağın");
				System.out.println("Markası");
				String marka = scan.nextLine();
				System.out.println("Rengi");
				String renk = scan.nextLine();
				System.out.println("Hızı");
				int hiz = scan.nextInt();
				System.out.println("Fiyatı");
				int fiyat = scan.nextInt();
				System.out.println("Yolcu Sayısı");
				int yolcuSayisi = scan.nextInt();
				System.out.println("Tekerlek Sayısı");
				int tekerlekSayisi = scan.nextInt();
				System.out.println("Üretim Yılı");
				int uretimYili = scan.nextInt();
				Ucak u = new Ucak(marka, renk, hiz, fiyat, yolcuSayisi, tekerlekSayisi, uretimYili, true, ucakSayisi);
				dosyayaYaz(u);
				ucakSayisi++;
			}
			else if(islem.equals("4")) {
				System.out.println("Geminin");
				System.out.println("Markası");
				String marka = scan.nextLine();
				System.out.println("Rengi");
				String renk = scan.nextLine();
				System.out.println("Hızı");
				int hiz = scan.nextInt();
				System.out.println("Fiyatı");
				int fiyat = scan.nextInt();
				System.out.println("Yolcu Sayısı");
				int yolcuSayisi = scan.nextInt();
				System.out.println("Tekerlek Sayısı");
				int tekerlekSayisi = scan.nextInt();
				System.out.println("Üretim Yılı");
				int uretimYili = scan.nextInt();
				Gemi g = new Gemi(marka, renk, hiz, fiyat, yolcuSayisi, tekerlekSayisi, uretimYili, gemiSayisi);
				dosyayaYaz(g);
				gemiSayisi++;
			}
			else if(islem.equals("5")) {
				System.out.println("Uçan Geminin");
				System.out.println("Markası");
				String marka = scan.nextLine();
				System.out.println("Rengi");
				String renk = scan.nextLine();
				System.out.println("Hızı");
				int hiz = scan.nextInt();
				System.out.println("Fiyatı");
				int fiyat = scan.nextInt();
				System.out.println("Yolcu Sayısı");
				int yolcuSayisi = scan.nextInt();
				System.out.println("Tekerlek Sayısı");
				int tekerlekSayisi = scan.nextInt();
				System.out.println("Üretim Yılı");
				int uretimYili = scan.nextInt();
				UcanGemi ug = new UcanGemi(marka, renk, hiz, fiyat, yolcuSayisi, tekerlekSayisi, uretimYili, true, ucanGemiSayisi);
				dosyayaYaz(ug);
				ucanGemiSayisi++;
			}
			else if(islem.equals("6")) {
				//out of loop
			}
			else if(islem.equals("7")) {
				cikis = false;
			}
			else {
				System.out.println("Lütfen 1-7 sayı aralığında bir sayı seçiniz");
				dongu = true;
			}
		}while(dongu);
	}
	
	public static void veriListele() {
		System.out.println("Listelemek istediğiniz araç tipini belirtiniz: ");
		System.out.println("1.Kara\n2.Deniz\n3.Hava");
		String islem = scan.nextLine();
		if(islem.equals("1")) {
			try {
				File file = new File(path);
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while((line = br.readLine()) != null) {
					if(line.substring(0, 8).equals("Otomobil") || line.substring(0, 8).equals("Bisiklet")) {
						System.out.println(line);
					}
				}
				br.close();
			}catch(IOException io) {
				System.out.println("txt okunurken hata!");
			}
		}
		
		if(islem.equals("2")) {
			try {
				File file = new File(path);
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while((line = br.readLine()) != null) {
					if(line.substring(0, 4).equals("Gemi") || line.substring(0, 8).equals("UcanGemi")) {
						System.out.println(line);
					}
				}
				br.close();
			}catch(IOException io) {
				System.out.println("txt okunurken hata!");
			}	
		}
		if(islem.equals("3")) {
			try {
				File file = new File(path);
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while((line = br.readLine()) != null) {
					if(line.substring(0, 4).equals("Ucak") || line.substring(0, 8).equals("UcanGemi")) {
						System.out.println(line);
					}
				}
				br.close();
			}catch(IOException io) {
				System.out.println("txt okunurken hata!");
			}
		}
	} 
	
	public static void veriGuncelle() {
		System.out.println("Değiştirmek istediğiniz aracın türünü seçiniz");
		System.out.println("1.Otomobil\n2.Bisiklet\n3.Uçak\n4.Gemi\n5.UçanGemi\n6.Geri Dön");
		String islem = scan.nextLine();
		if(islem.equals("6")) return;
		System.out.println("Aracın üretim numarasını giriniz");
		String no = scan.nextLine();
		String isim;
		if(islem.equals("1")) {
			isim = "Otomobil_" + no;
		}
		else if(islem.equals("2")) {
			isim = "Bisiklet_" + no;
		}
		else if(islem.equals("3")) {
			isim = "Ucak_" + no;
		}
		else if(islem.equals("4")) {
			isim = "Gemi_" + no;
		}
		else if(islem.equals("5")) {
			isim = "UcanGemi_" + no;
		}
		else {
			return;
		}
		//ilgili dosyayı bulurken diger elemanları diziye at
		//bulduğunda veriyi değiştir ve diziye öyle at
		//kalan elemanları sorgulamadan diziye attıktan sonra dosyayı yeniden yaz
		boolean buldu = false;
		try {
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				if(!buldu && line.substring(0, isim.length()).equals(isim)) {
					buldu = true; // dosya bulundu
					System.out.println("Aranan dosya bulundu özellikleri yeniden değiştirmek için size sorular sorulacak");
					if(islem.equals("1")) {
						System.out.println("Otomobilin");
						System.out.println("Markası");
						String marka = scan.nextLine();
						System.out.println("Rengi");
						String renk = scan.nextLine();
						System.out.println("Hızı");
						int hiz = scan.nextInt();
						System.out.println("Fiyatı");
						double fiyat = scan.nextDouble();
						System.out.println("Yolcu Sayısı");
						int yolcuSayisi = scan.nextInt();
						System.out.println("Tekerlek Sayısı");
						int tekerlekSayisi = scan.nextInt();
						System.out.println("Üretim Yılı");
						int uretimYili = scan.nextInt();
						System.out.println("Yakıt Türü");
						String yakitTuru = scan.next();
						yazdir.add(isim + "\t" + marka + "\t" + renk + "\t" + hiz + "\t" + fiyat + "\t" + yolcuSayisi + "\t" + tekerlekSayisi + "\t" + uretimYili + "\t" + yakitTuru);
					}
					else if(islem.equals("2")) {
						System.out.println("Bisikletin");
						System.out.println("Markası");
						String marka = scan.nextLine();
						System.out.println("Rengi");
						String renk = scan.nextLine();
						System.out.println("Hızı");
						int hiz = scan.nextInt();
						System.out.println("Fiyatı");
						int fiyat = scan.nextInt();
						System.out.println("Yolcu Sayısı");
						int yolcuSayisi = scan.nextInt();
						System.out.println("Tekerlek Sayısı");
						int tekerlekSayisi = scan.nextInt();
						System.out.println("Üretim Yılı");
						int uretimYili = scan.nextInt();
						yazdir.add(isim + "\t" + marka + "\t" + renk + "\t" + hiz + "\t" + fiyat + "\t" + yolcuSayisi + "\t" + tekerlekSayisi + "\t" + uretimYili);
					}
					else if(islem.equals("3")) {
						System.out.println("Uçağın");
						System.out.println("Markası");
						String marka = scan.nextLine();
						System.out.println("Rengi");
						String renk = scan.nextLine();
						System.out.println("Hızı");
						int hiz = scan.nextInt();
						System.out.println("Fiyatı");
						int fiyat = scan.nextInt();
						System.out.println("Yolcu Sayısı");
						int yolcuSayisi = scan.nextInt();
						System.out.println("Tekerlek Sayısı");
						int tekerlekSayisi = scan.nextInt();
						System.out.println("Üretim Yılı");
						int uretimYili = scan.nextInt();
						yazdir.add(isim + "\t" + marka + "\t" + renk + "\t" + hiz + "\t" + fiyat + "\t" + yolcuSayisi + "\t" + tekerlekSayisi + "\t" + uretimYili + "\t" + "true");
					}
					else if(islem.equals("4")) {
						System.out.println("Geminin");
						System.out.println("Markası");
						String marka = scan.nextLine();
						System.out.println("Rengi");
						String renk = scan.nextLine();
						System.out.println("Hızı");
						int hiz = scan.nextInt();
						System.out.println("Fiyatı");
						int fiyat = scan.nextInt();
						System.out.println("Yolcu Sayısı");
						int yolcuSayisi = scan.nextInt();
						System.out.println("Tekerlek Sayısı");
						int tekerlekSayisi = scan.nextInt();
						System.out.println("Üretim Yılı");
						int uretimYili = scan.nextInt();
						yazdir.add(isim + "\t" + marka + "\t" + renk + "\t" + hiz + "\t" + fiyat + "\t" + yolcuSayisi + "\t" + tekerlekSayisi + "\t" + uretimYili);
					}
					//ucanGemi
					else {
						System.out.println("Uçan Geminin");
						System.out.println("Markası");
						String marka = scan.nextLine();
						System.out.println("Rengi");
						String renk = scan.nextLine();
						System.out.println("Hızı");
						int hiz = scan.nextInt();
						System.out.println("Fiyatı");
						int fiyat = scan.nextInt();
						System.out.println("Yolcu Sayısı");
						int yolcuSayisi = scan.nextInt();
						System.out.println("Tekerlek Sayısı");
						int tekerlekSayisi = scan.nextInt();
						System.out.println("Üretim Yılı");
						int uretimYili = scan.nextInt();
						yazdir.add(isim + "\t" + marka + "\t" + renk + "\t" + hiz + "\t" + fiyat + "\t" + yolcuSayisi + "\t" + tekerlekSayisi + "\t" + uretimYili + "\t" + "true");
					}
				}
				else  {
					yazdir.add(line);
				}
			}
			br.close();
		}catch(IOException io) {
			System.out.println("txt okunurken hata!");
		}
		if(buldu == false) System.out.println("Dosya bulunamadı");
		else listYazdir();
		yazdir.clear();
	}
	
	public static void dosyayaYaz(Arac a1) {
		File fl = new File(path);
		BufferedWriter bw;
		
		try {
			if(!fl.exists()) {
				fl.createNewFile();
			}
			
			bw = new BufferedWriter(new FileWriter(fl, true));
		} catch (IOException e) {
			System.out.println("bf error::dosyayaYaz");
			return;
		}
		
		if(a1 instanceof Otomobil) {
			Otomobil o = (Otomobil)a1;
			try {
			    bw.write(o.getUretimNo() + "\t" + o.getMarka() + "\t" + o.getRengi() + "\t" + o.getHiz() + "\t" + o.getFiyati() + "\t" + o.getYolcuSayisi() + "\t" + o.getTekerlekSayisi() + "\t" + o.getUretimYili() + "\t" + o.getYakitTuru());
			    bw.newLine();
			    bw.close();
			} catch(IOException io) {
			    System.out.println("ok");
			}
		}
		else if(a1 instanceof Bisiklet) {
			Bisiklet b = (Bisiklet)a1;
			try {
			    bw.write(b.getUretimNo() + "\t" + b.getMarka() + "\t" + b.getRengi() + "\t" + b.getHiz() + "\t" + b.getFiyati() + "\t" + b.getYolcuSayisi() + "\t" + b.getTekerlekSayisi() + "\t" + b.getUretimYili());
			    bw.newLine();
			    bw.close();
			} catch(IOException io) {
			    System.out.println("ok");
			}
		}
		else if(a1 instanceof Ucak) {
			Ucak u = (Ucak)a1;
			try {
			    bw.write(u.getUretimNo() + "\t" + u.getMarka() + "\t" + u.getRengi() + "\t" + u.getHiz() + "\t" + u.getFiyati() + "\t" + u.getYolcuSayisi() + "\t" + u.getTekerlekSayisi() + "\t" + u.getUretimYili() + "\t" + u.getInis());
			    bw.newLine();
			    bw.close();
			} catch(IOException io) {
			    System.out.println("ok");
			}
		}
		else if(a1 instanceof Gemi) {
			Gemi g = (Gemi)a1;
			try {
			    bw.write(g.getUretimNo() + "\t" + g.getMarka() + "\t" + g.getRengi() + "\t" + g.getHiz() + "\t" + g.getFiyati() + "\t" + g.getYolcuSayisi() + "\t" + g.getTekerlekSayisi() + "\t" + g.getUretimYili());
			    bw.newLine();
			    bw.close();
			} catch(IOException io) {
			    System.out.println("ok");
			}
		}
		else  {
			UcanGemi ug = (UcanGemi)a1;
			try {
			    bw.write(ug.getUretimNo() + "\t" + ug.getMarka() + "\t" + ug.getRengi() + "\t" + ug.getHiz() + "\t" + ug.getFiyati() + "\t" + ug.getYolcuSayisi() + "\t" + ug.getTekerlekSayisi() + "\t" + ug.getUretimYili() + "\t" + ug.getInis());
			    bw.newLine();
			    bw.close();
			} catch(IOException io) {
			    System.out.println("ok");
			}
		}
	}

	public static void listYazdir() {
		File fl;
		BufferedWriter bw;
		
		try {
			fl = new File(path);
			if(!fl.exists()) {
				fl.createNewFile();
			}
			
			bw = new BufferedWriter(new FileWriter(fl, false));
			bw.write("");
			for(int i=0; i<yazdir.size(); i++) {
				bw.append(yazdir.get(i));
				bw.newLine();
				System.out.println(yazdir.get(i));
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("bf error::listYazdir");
		}
	}
}
