abstract class TiketKonser implements HargaTiket {
    // Atribut-atribut yang mungkin diperlukan
    private String namaKonser;
    private String lokasiKonser;
    private String tanggalKonser;
    private String waktuKonser;
    private double harga;

    // Konstruktor
    TiketKonser(String namaKonser, String lokasiKonser, String tanggalKonser, String waktuKonser) {
        this.namaKonser = namaKonser;
        this.lokasiKonser = lokasiKonser;
        this.tanggalKonser = tanggalKonser;
        this.waktuKonser = waktuKonser;
        this.harga = harga;
    }

    public TiketKonser() {
        // TODO Auto-generated constructor stub
    }

    // Implementasi metode getPrice() dari interface HargaTiket
    @Override
    public double getPrice() {
        return harga;
    }
}
