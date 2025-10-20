package uts.models;

public class Truk extends Kendaraan implements Kargoable{
    private int jumlahRoda;
    public Truk(int kapasitasOrang, String nama, int jumlahRoda){
        super(BahanBakar.DIESEL, 3, nama);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda(){
        return jumlahRoda;
    }
    @Override
    public void loadKargo(){
        System.out.println("Yes");
    }

    @Override
    public void unloadKargo(){
        System.out.println("No");
    }

    
    @Override
    public String getDetails(){
        return super.getNama() + " Kapasitas orang: " + super.getKapasitasOrang() + ", Jumlah Roda: " + getJumlahRoda();
    }
}
