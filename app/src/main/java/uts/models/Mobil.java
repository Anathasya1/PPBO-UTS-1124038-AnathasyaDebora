package uts.models;

public class Mobil extends Kendaraan implements Kargoable{
    private int jumlahRoda;
    public Mobil(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda){
        super(bahanBakar, kapasitasOrang, nama);
        this.jumlahRoda = 4;
    }

    public int getJumlahRoda(){
        return jumlahRoda;
    }
    @Override
    public void loadKargo(){
        System.out.println("No");
    }

    @Override
    public void unloadKargo(){
        System.out.println("Yes");
    }
    
    @Override
    public String getDetails(){
        return "Mobil Kapasitas orang: " + super.getKapasitasOrang() + ", Jumlah Roda: " + getJumlahRoda();
    }
}
