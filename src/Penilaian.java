class Penilaian {
    String idNilai;
    String idSesi;
    int skor;
    public Penilaian(String idNilai, String idSesi, int skor) {
        this.idNilai = idNilai;
        this.idSesi = idSesi;
        this.skor = skor;
    }
    public void tampilkanNilai() {
        System.out.println("ID Nilai: " + idNilai);
        System.out.println("ID Sesi: " + idSesi);
        System.out.println("Skor: " + skor);
    }
}
