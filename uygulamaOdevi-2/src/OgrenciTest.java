
public class OgrenciTest {
    public static void main(String[] args) {
        System.out.println("Öğrencilerin Bilgileri");
        Ogrenci  ogrenci=new Ogrenci(1973);
        System.out.println("OGR-1 "+ogrenci.getAd()+" "+ogrenci.getBolum()+" "+ogrenci.getOgrNo()+" "+ogrenci.getGano());

        Ogrenci ogrenci1=new Ogrenci("Gökhan","Makine Müh",1985);
        System.out.println("OGR-2 "+ogrenci1.getAd()+" "+ogrenci1.getBolum()+" "+ogrenci1.getOgrNo()+" "+ogrenci1.getGano());

        Ogrenci ogrenci2=new Ogrenci("Ayşe","Makine Müh",1985);
        System.out.println("OGR-3 "+ogrenci2.getAd()+" "+ogrenci2.getBolum()+" "+ogrenci2.getOgrNo()+" "+ogrenci2.getGano());

        Ogrenci ogrenci3=new Ogrenci("Elif","Elektrik-Elektronik Müh",2020,1.98);
        System.out.println("OGR-4 "+ogrenci3.getAd()+" "+ogrenci3.getBolum()+" "+ogrenci3.getOgrNo()+" "+ogrenci3.getGano());

        Ogrenci ogrenciIslem=new Ogrenci("Ayse","Makine Müh",1985);

        int dersSayisi=4;
        double uzatilanYil=0;
        double harc=ogrenciIslem.harcHesapla(dersSayisi,uzatilanYil);
        System.out.println("3. öğrencinin ödeyeceği harç: "+harc);

        Ogrenci ogrenciIslem1=new Ogrenci("Elif","Elektrik-elektronik Müh",2020);
        int dersSayisi1=6;
        double uzatilanYil1=2;
        double harc1=ogrenciIslem.harcHesapla(dersSayisi1,uzatilanYil1);
        System.out.println("4. öğrencinin ödeyeceği harç: "+harc1);

    }
}
