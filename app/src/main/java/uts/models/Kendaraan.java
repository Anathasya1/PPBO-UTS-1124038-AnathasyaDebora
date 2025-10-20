package uts.models;

public abstract class Kendaraan {
    private BahanBakar bahanBakar;
    private int kapasitasOrang;
    private String nama;

    public Kendaraan(BahanBakar bahanBakar, int kapasitasOrang, String nama){
        this.bahanBakar = bahanBakar;
        this.kapasitasOrang = kapasitasOrang;
        this.nama = nama;
    }

    public BahanBakar getBahanBakar(){
        return bahanBakar;
    }
    public int getKapasitasOrang(){
        return kapasitasOrang;
    }
    public String getNama(){
        return nama;
    }
   

    public abstract String getDetails();

    public String getBahanBakarString(){
        switch (bahanBakar) {
            case BENSIN:
                return "Bensin";
            case DIESEL:
                return "Diesel";
            case AVTUR:
                return "Avtur";
            default:
                return "Ga tau";
        }
    }
}
