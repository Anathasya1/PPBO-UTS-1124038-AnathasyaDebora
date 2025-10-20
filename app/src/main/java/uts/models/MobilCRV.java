package uts.models;

public class MobilCRV extends Mobil{
    public MobilCRV(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda){
        super(bahanBakar, kapasitasOrang, "CRV", 4);
    }

    @Override
    public String getDetails(){
        return super.getNama() + " Kapasitas orang: " + super.getKapasitasOrang()+ ", Jumlah Roda: " + super.getJumlahRoda();
    }
}
