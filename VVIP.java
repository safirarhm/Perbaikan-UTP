class VVIP extends TiketKonser {
  private String privileges;

  // Constructor
  VVIP(String namaKonser, String lokasiKonser, String tanggalKonser, String waktuKonser, String privileges) {
    super(namaKonser, lokasiKonser, tanggalKonser, waktuKonser);
    this.privileges = privileges;
  }
}
