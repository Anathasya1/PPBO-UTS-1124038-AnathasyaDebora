package uts.models;

public class Helikopter extends Kendaraan implements Kargoable{
    private int jumlahBalingBaling;
    public Helikopter(int kapasitasOrang, String nama, int jumlahBalingBaling){
        super(BahanBakar.AVTUR, kapasitasOrang, nama);
        this.jumlahBalingBaling = jumlahBalingBaling;
    }

    @Override
    public void loadKargo(){
        System.out.println("No");
    }

    @Override
    public void unloadKargo(){
        System.out.println("Yes");
    }
    
    public int getJumlahBaling(){
        return jumlahBalingBaling;
    }

    @Override
    public String getDetails(){
        return "Helikopter " + super.getNama() + ", Kapasitas orang: " + super.getKapasitasOrang() + ", Jumlha Baling-baling: " + getJumlahBaling();
    }
}
