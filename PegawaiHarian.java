public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private double jamKerja;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, double jamKerja) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public double getJamKerja() {
        return jamKerja;
    }

    public double earnings() {
        if (getJamKerja() <= 40) {
            return getUpahPerJam() * getJamKerja();
        } else {
            return 40 * getUpahPerJam() + (getJamKerja() - 40) * getUpahPerJam() * 1.5;
        }
    }

    public String toString() {
        return "Pegawai Harian: " + getNama() + "\nNo. KTP: " + getNoKTP() + "\nUpah per Jam: " + getUpahPerJam() + "\nJam Kerja: " + getJamKerja() + "\nPendapatan: Rp " + earnings();
    }
}