public class Ogrenci {

    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private int bolumKodu=104;
    private int girisSirasi=1;

    public Ogrenci(String ad, String bolum, String ogrNo,int girisYili,double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrNo;
        this.gano = gano;
    }
    public Ogrenci(String ad, String bolum,int girisYili,double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
    }
    public Ogrenci(String ad,String bolum,int girisYili){

        this(ad,bolum,null,girisYili,0);
    }
    public Ogrenci(String ogrNo){
        this(null,null,ogrNo,0,0);
    }
    public Ogrenci(int girisYili){
        this(null,null,null,girisYili,0);
    }
    public Ogrenci (){
        this(null,null,null,0,0);
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        if(ogrNo==null){
            ogrenciNoOlustur();
        }
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano() {
        this.gano = gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getGirisSirasi() {
        return girisSirasi;
    }

    public void setGirisSirasi(int girisSirasi) {
        this.girisSirasi = girisSirasi;
    }


    public String ogrenciNoOlustur(){
       ogrNo=String.format("%04d%03d%03d",girisYili,bolumKodu,girisSirasi);
       return ogrNo;
    }

    public double ortalama() {
        if (gano < 0 && gano > 4) {
            throw new IllegalArgumentException("Gano bulunamadı!");
        }
        return gano;
    }

    public double harcHesapla(int dersSayisi){
        return dersSayisi*120;
    }

    public double harcHesapla(int dersSayisi,double uzatilanYil){
        double harc=dersSayisi*120;
        return harc+(uzatilanYil*120);
    }
}
