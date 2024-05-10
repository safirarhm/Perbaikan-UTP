import java.text.SimpleDateFormat;
import java.util.Date;

class PemesananTiket {
  private String kodeBooking;
  private String tanggalPemesanan;

  // Constructor
  PemesananTiket() {
    // Generate booking code and booking date when object is created
    this.kodeBooking = generateKodeBooking();
    this.tanggalPemesanan = getCurrentDate();
  }

  // Method to generate booking code
  private String generateKodeBooking() {
    StringBuilder sb = new StringBuilder();
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    int length = 8;

    for (int i = 0; i < length; i++) {
      int index = (int) (Math.random() * characters.length());
      sb.append(characters.charAt(index));
    }

    return sb.toString();
  }

  // Method to get current date
  private String getCurrentDate() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date currentDate = new Date();
    return dateFormat.format(currentDate);
  }

  // Getters
  String getKodeBooking() {
    return kodeBooking;
  }

  String getTanggalPemesanan() {
    return tanggalPemesanan;
  }
}
