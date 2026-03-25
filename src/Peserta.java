class Peserta extends Akun {
    private String nim;
    public Peserta(String idAkun, String nama, String nim) {
        super(idAkun, nama);
        this.nim = nim;
    }
    public void tampilkanPeserta() {
        tampilkanAkun();
        System.out.println("NIM: " + nim);
    }
}
