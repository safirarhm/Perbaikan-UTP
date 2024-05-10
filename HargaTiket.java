interface HargaTiket {
    // Metode untuk mendapatkan harga tiket
    double getPrice();
}

class CAT1 extends TiketKonser implements HargaTiket {
    private double hargaDasar;

    // Konstruktor
    CAT1(String namaKonser, String lokasiKonser, String tanggalKonser, String waktuKonser, String nomorKursi,
            double hargaDasar) {
        super();
        this.hargaDasar = hargaDasar;
    }

    // Implementasi metode getPrice() dari interface HargaTiket
    @Override
    public double getPrice() {
        // Implementasikan perhitungan harga tiket CAT1 di sini, berdasarkan hargaDasar
        // atau faktor-faktor tambahan
        // Contohnya:
        return hargaDasar * 1.1; // Menambahkan 10% untuk harga tiket CAT1
    }
}

class VIP extends TiketKonser implements HargaTiket {
    private double hargaDasar;

    // Konstruktor
    VIP(String namaKonser, String lokasiKonser, String tanggalKonser, String waktuKonser, double hargaDasar) {
        super();
        this.hargaDasar = hargaDasar;
    }

    // Implementasi metode getPrice() dari interface HargaTiket
    @Override
    public double getPrice() {
        // Implementasikan perhitungan harga tiket VIP di sini, berdasarkan hargaDasar
        // atau faktor-faktor tambahan
        // Contohnya:
        return hargaDasar * 1.5; // Menambahkan 50% untuk harga tiket VIP
    }
}

// Implementasi kelas VVIP, FESTIVAL, dsb. dengan cara yang serupa
