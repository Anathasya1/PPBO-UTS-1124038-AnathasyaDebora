package uts.models;

public class MobilFortuner extends Mobil{
    public MobilFortuner(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda){
        super(bahanBakar, kapasitasOrang, "Fortuner", 4);
    }

    @Override
    public String getDetails(){
        return super.getNama() + " Kapasitas orang: " + super.getKapasitasOrang() + ", Jumlah Roda: " + super.getJumlahRoda();
    }
}
