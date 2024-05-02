public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public double gaji() {
        return upah;
    }

    @Override
    public String toString() {
        return 
        "Pegawai Tetap  : " + getNama() + "\nNo. KTP       : " + getNoKTP() + "\nUpah  : " + getUpah() + "\nPendapatan : Rp " + gaji();}
}