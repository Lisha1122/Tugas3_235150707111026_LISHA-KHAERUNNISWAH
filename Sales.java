public class Sales extends Pegawai {
    private double totalPenjualan;
    private double komisi;   

    public Sales(String nama, String noKTP, double komisi, double totalPenjualan) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }

    public double getTotalPenjualan() {
        return totalPenjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public double earnings() {
        return super.gaji() + totalPenjualan * komisi;
    }

    public String toString() {
        return "Sales: " + getNama() + "\nNo. KTP: " + getNoKTP() + "\nTotal Penjualan: " + totalPenjualan + "\nPendapatan: Rp " + earnings() + "\nKomisi: " + komisi;
    }
}