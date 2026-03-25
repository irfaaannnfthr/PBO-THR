import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Peserta> pesertaList = new ArrayList<>();
        ArrayList<Penguji> pengujiList = new ArrayList<>();
        ArrayList<SesiPresentasi> sesiList = new ArrayList<>();
        ArrayList<Penilaian> nilaiList = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PRESENTASI ===");
            System.out.println("1. Tambah Peserta");
            System.out.println("2. Tambah Penguji");
            System.out.println("3. Tambah Sesi");
            System.out.println("4. Tampilkan Semua Data");
            System.out.println("5. Ubah Status Sesi");
            System.out.println("6. Beri Nilai");
            System.out.println("7. Hapus Sesi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("NIM: ");
                    String nim = input.nextLine();

                    pesertaList.add(new Peserta(id, nama, nim));
                    System.out.println("Peserta ditambahkan!");
                    break;

                case 2:
                    System.out.print("ID: ");
                    String idP = input.nextLine();
                    System.out.print("Nama: ");
                    String namaP = input.nextLine();
                    System.out.print("Kode Dosen: ");
                    String kode = input.nextLine();

                    pengujiList.add(new Penguji(idP, namaP, kode));
                    System.out.println("Penguji ditambahkan!");
                    break;

                case 3:
                    System.out.print("ID Sesi: ");
                    String idSesi = input.nextLine();
                    System.out.print("Topik: ");
                    String topik = input.nextLine();
                    System.out.print("Waktu: ");
                    String waktu = input.nextLine();

                    sesiList.add(new SesiPresentasi(idSesi, topik, waktu));
                    System.out.println("Sesi ditambahkan!");
                    break;

                case 4:
                    System.out.println("\n--- Peserta ---");
                    for (Peserta p : pesertaList) {
                        p.tampilkanPeserta();
                        System.out.println();
                    }

                    System.out.println("\n--- Penguji ---");
                    for (Penguji p : pengujiList) {
                        p.tampilkanPenguji();
                        System.out.println();
                    }

                    System.out.println("\n--- Sesi ---");
                    for (SesiPresentasi s : sesiList) {
                        s.tampilkanSesi();
                        System.out.println();
                    }

                    System.out.println("\n--- Penilaian ---");
                    for (Penilaian n : nilaiList) {
                        n.tampilkanNilai();
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan ID Sesi: ");
                    String cari = input.nextLine();

                    for (SesiPresentasi s : sesiList) {
                        if (s.idSesi.equals(cari)) {
                            System.out.println("1. Mulai");
                            System.out.println("2. Selesai");
                            int status = input.nextInt();

                            if (status == 1) {
                                s.mulaiSesi();
                            } else if (status == 2) {
                                s.selesaiSesi();
                            }

                            System.out.println("Status diubah!");
                        }
                    }
                    break;

                case 6:
                    System.out.print("ID Nilai: ");
                    String idNilai = input.nextLine();
                    System.out.print("ID Sesi: ");
                    String sesi = input.nextLine();
                    System.out.print("Skor: ");
                    int skor = input.nextInt();

                    nilaiList.add(new Penilaian(idNilai, sesi, skor));
                    System.out.println("Nilai ditambahkan!");
                    break;

                case 7:
                    System.out.print("ID Sesi yang dihapus: ");
                    String hapus = input.nextLine();

                    sesiList.removeIf(s -> s.idSesi.equals(hapus));
                    System.out.println("Sesi dihapus!");
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilihan != 0);
    }
}
