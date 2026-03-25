class Penguji extends Akun {
    private String kodeDosen;
    public Penguji(String idAkun, String nama, String kodeDosen) {
        super(idAkun, nama);
        this.kodeDosen = kodeDosen;
    }
    public void tampilkanPenguji() {
        tampilkanAkun();
        System.out.println("Kode Dosen: " + kodeDosen);
    }
}
