class Akun {
    protected String idAkun;
    protected String nama;
    public Akun(String idAkun, String nama) {
        this.idAkun = idAkun;
        this.nama = nama;
    }
    public void tampilkanAkun() {
        System.out.println("ID: " + idAkun);
        System.out.println("Nama: " + nama);
    }
}
