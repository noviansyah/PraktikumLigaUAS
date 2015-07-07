package com.company;

import java.util.ArrayList;

/**
 * Created by ASUS on 7/6/2015.
 */
public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {return namaLiga;}

    public void setNamaLiga(String namaLiga) {this.namaLiga = namaLiga;}

    public ArrayList<Divisi> getDaftarDivisi() {return daftarDivisi;}

    public void setDaftarDivisi(ArrayList<Divisi> daftarDivisi) {this.daftarDivisi = daftarDivisi;}

    //Soal Nomer 1
    public void getDaftarDivisi(String liga){
        if (liga == getNamaLiga()) {
            for (int d = 0; d < daftarDivisi.size(); d++)
            {
                System.out.println(daftarDivisi.get(d));
            }
        } else {
            System.out.println("Tidak Memiliki Divisi");
        }
    }

    public void setDaftarDivisi(Divisi divisi) {this.daftarDivisi.add(divisi);}

    @Override
    public String toString() {
        return "Nama Liga : " +namaLiga;
    }
}
