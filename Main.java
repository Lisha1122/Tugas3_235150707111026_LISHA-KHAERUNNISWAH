public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Bayu", "350728490327424892342", 2000000.0);
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Edo", "350728490327424892343", 8500.0, 40.0);
        Sales sales = new Sales("Tika", "350728490327424892344", 50000.0, 50.0);

        System.out.printf("Pegawai Tetap:%nNama\t\t: %s%nNo. KTP\t\t: %s%nUpah\t\t: %.1f%nPendapatan\t: Rp%.0f%n%n", pegawaiTetap.getNama(), pegawaiTetap.getNoKTP(), pegawaiTetap.getUpah(), pegawaiTetap.gaji());
        System.out.printf("Pegawai Harian:%nNama\t\t: %s%nNo. KTP\t\t: %s%nUpah per Jam\t: %.2f%nTotal jam kerja\t: %.1f%nPendapatan\t: Rp%.0f%n%n", pegawaiHarian.getNama(), pegawaiHarian.getNoKTP(), pegawaiHarian.getUpahPerJam(), pegawaiHarian.getJamKerja(), pegawaiHarian.earnings());
        System.out.printf("Sales:%nNama\t\t: %s%nNo. KTP\t\t: %s%nTotal Penjualan\t: %.1f%nBesaran Komisi\t: %.1f%nPendapatan\t: Rp%.0f%n%n", sales.getNama(), sales.getNoKTP(), sales.getTotalPenjualan(), sales.getKomisi() * 100, sales.earnings());
    }
}   