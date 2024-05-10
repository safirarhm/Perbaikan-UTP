class FESTIVAL extends TiketKonser {
  // Atribut tambahan jika diperlukan
  private String jenisFestival;
  private double harga;

  // Method untuk menghitung harga tiket
  public double hitungHarga(int jumlahTiket) {
    return harga * jumlahTiket;
  }
}
