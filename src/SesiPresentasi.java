class SesiPresentasi {
    String idSesi;
    String topik;
    String waktu;
    String status;
    public SesiPresentasi(String idSesi, String topik, String waktu) {
        this.idSesi = idSesi;
        this.topik = topik;
        this.waktu = waktu;
        this.status = "Belum Dimulai";
    }
    public void tampilkanSesi() {
        System.out.println("ID Sesi: " + idSesi);
        System.out.println("Topik: " + topik);
        System.out.println("Waktu: " + waktu);
        System.out.println("Status: " + status);
    }
    public void mulaiSesi() {
        status = "Sedang Berlangsung";
    }
    public void selesaiSesi() {
        status = "Selesai";
    }
}
