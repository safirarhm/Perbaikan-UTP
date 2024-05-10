
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Memanggil generateKodeBooking() untuk mendapatkan kode pesanan baru
        String kodeBooking = generateKodeBooking();

        // Mendapatkan kode booking dan waktu terkini
        String currentDate = getCurrentDate();

        // Menampilkan informasi tiket dan detail pemesanan
        System.out.println("Detail Pemesanan:");
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pemesanan: " + currentDate);
        System.out.println("Informasi Tiket:");

    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}