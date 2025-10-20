package uts.repositories;

import uts.models.Kendaraan;
import java.util.List;
import java.util.ArrayList;

public class KendaraanRepo {
    private List<Kendaraan> listKendaraan;

    public KendaraanRepo(){
        this.listKendaraan = new ArrayList<>();
    }

    public List<Kendaraan> findAll(){
        return listKendaraan;
    }

    public void add(Kendaraan kendaraan){
        listKendaraan.add(kendaraan);
    }
}
