package uts.controllers;

import java.util.List;

import uts.models.BahanBakar;
import uts.models.Helikopter;
import uts.models.Kendaraan;
import uts.models.Mobil;
import uts.models.MobilCRV;
import uts.models.MobilFortuner;
import uts.models.Pesawat;
import uts.models.Truk;
import uts.repositories.KendaraanRepo;

public class KendaraanController {
    private KendaraanRepo kendaraanRepo;

    public KendaraanController(){
        this.kendaraanRepo = new KendaraanRepo();
    }

    public List<Kendaraan> getAllKendaraan(){
        return kendaraanRepo.findAll();
    }

    public void add(Kendaraan kendaraan){
        this.kendaraanRepo.add(kendaraan);
    }

    public void addHelikopter(int kapasitasOrang, String nama, int jumlahBalingBaling){
        this.add(new Helikopter(kapasitasOrang, nama, jumlahBalingBaling));
    }

    public void addPesawat(int kapasitasOrang, String nama, boolean pesawatTempur, int jumlahRoda){
        this.add(new Pesawat(kapasitasOrang, nama, pesawatTempur, jumlahRoda));
    }

    public void addTruk(int kapasitasOrang, String nama, int jumlahRoda){
        this.add(new Truk(kapasitasOrang, nama, jumlahRoda));
    }

    public void addMobil(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda){
        if (nama.equalsIgnoreCase("CRV")) {
            this.add(new MobilCRV(bahanBakar, kapasitasOrang, nama, jumlahRoda));
        } else if (nama.equalsIgnoreCase("Fortuner")) {
            this.add(new MobilFortuner(bahanBakar, kapasitasOrang, nama, jumlahRoda));
        } else {
            this.add(new Mobil(bahanBakar, kapasitasOrang, nama, jumlahRoda));
        }
    }

}
