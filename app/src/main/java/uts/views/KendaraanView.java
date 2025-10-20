package uts.views;

import java.util.List;
import uts.util.CLIUtil;
import uts.controllers.KendaraanController;
import uts.models.BahanBakar;
import uts.models.Kendaraan;
import java.util.Comparator;

public class KendaraanView {
    private KendaraanController kendaraanController;

    public KendaraanView() {
        this.kendaraanController = new KendaraanController();
    }

    public void render() {
        this.printMenu();
        int menu = CLIUtil.getInt();
        while (menu != 0) {
            switch (menu) {
                case 1:
                    this.handleTambahKendaraan();
                    break;
                case 2:
                    this.renderListView();
                    break;
                case 3:
                    this.handleSortKendaraan(false);
                    break;
                case 0:
                    return;
            }
            this.printMenu();
            menu = CLIUtil.getInt();
        }
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah kendaraan");
        System.out.println("2. Tampilkan semua kendaraan");
        System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
        System.out.println("0. Keluar");
    }

    private void handleTambahKendaraan() {
        int kapasitasOrang=-1;
        int jumlahRoda = -1;
        System.out.println("Menu kendaraan: ");
        System.out.println("1. Helikopter");
        System.out.println("2. Mobil");
        System.out.println("3. Pesawat");
        System.out.println("4. Truk");
        System.out.println("0. exit");
        int tipe = CLIUtil.getInt();
        
        CLIUtil.getString();
        while (tipe != 0) {
            String nama = CLIUtil.askForString("Masukkan nama kendaraan: ");
            switch (tipe) {
                case 1:
                    System.out.print("Kapasitas orang: ");
                    kapasitasOrang = CLIUtil.getInt();
                    System.out.print("Jumlah Baling baling: ");
                    int jumlahBalingBaling = CLIUtil.getInt();
                    kendaraanController.addHelikopter(kapasitasOrang, nama, jumlahBalingBaling);
                    break;
                case 2:
                    BahanBakar bahanBakar = getBahanBakar();
                    System.out.print("Kapasitas orang: ");
                    kapasitasOrang = CLIUtil.getInt();
                    System.out.print("Jumlah roda: ");
                    jumlahRoda = CLIUtil.getInt();
                    kendaraanController.addMobil(bahanBakar, kapasitasOrang, nama, jumlahRoda);
                    break;
                case 3:
                    System.out.println("Pesawat tempur? 1 = Ya 0=Tidak");
                    int input = CLIUtil.getInt();
                    System.out.print("Kapasitas orang: ");
                    kapasitasOrang = CLIUtil.getInt();
                    System.out.print("Jumlah roda: ");
                    jumlahRoda = CLIUtil.getInt();
                    kendaraanController.addPesawat(kapasitasOrang, nama, input == 1, jumlahRoda);
                    break;
                case 4:
                    System.out.print("Kapasitas orang: ");
                    kapasitasOrang = CLIUtil.getInt();
                    System.out.print("Jumlah roda: ");
                    jumlahRoda = CLIUtil.getInt();
                    kendaraanController.addTruk(kapasitasOrang, nama, jumlahRoda);
                    break;
            }
        }
    }

    private BahanBakar getBahanBakar() {
        System.out.println("1. Bensin");
        System.out.println("2. Diesel");
        System.out.println("3.Avtur");
        int pilihan = CLIUtil.getInt();

        switch (pilihan) {
            case 1:
                return BahanBakar.BENSIN;
            case 2:
                return BahanBakar.DIESEL;
            case 3:
                return BahanBakar.AVTUR;
        }
        return BahanBakar.BENSIN;
    }

    public void renderListView() {
        var kendaraan = kendaraanController.getAllKendaraan();
        handlePrintKendaraan(kendaraan);
    }

    private void handlePrintKendaraan(List<Kendaraan> kendaraans) {
        for (int i = 0; i < kendaraans.size(); i++) {
            Kendaraan kendaraan = kendaraans.get(i);
            String details = kendaraan.getDetails();
            System.out.println(details);
        }
    }

    class KendaraanComparator implements Comparator<Kendaraan> {
        boolean isAscending;
        public KendaraanComparator(){
            this(true);
        }

        public KendaraanComparator(boolean isAscending){
            this.isAscending = isAscending;
        }
        @Override
        public int compare(Kendaraan k1, Kendaraan k2){
            boolean isK1LargerThanK2 = k1.getKapasitasOrang() > k2.getKapasitasOrang();
            if (isAscending != isK1LargerThanK2) {
                return -1;
            } else {
                return 1;
            }
    
        }
    }
    private void handleSortKendaraan(boolean sortedByKapasitas) {
        var kendaraan = kendaraanController.getAllKendaraan();
        kendaraan.sort(new KendaraanComparator(sortedByKapasitas));
        handlePrintKendaraan(kendaraan);
    }
}
