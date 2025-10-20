package uts.models;

public class Pesawat extends Kendaraan implements Kargoable{
    private boolean pesawatTempur;
    private int jumlahRoda;
    public Pesawat(int kapasitasOrang, String nama, boolean pesawatTempur, int jumlahRoda){
        super(BahanBakar.AVTUR, kapasitasOrang, nama);
        this.pesawatTempur = pesawatTempur;
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
    
    public boolean getPesawatTempur(){
        return pesawatTempur;
    }

    
    @Override
    public String getDetails(){
        return "Pesawat " + super.getNama() + ", Kapasitas orang: " + super.getKapasitasOrang() + ", Jumlah roda: " + getJumlahRoda();
    }
}
