package com.company;

public class Main {

    public static void main(String[] args) {

        //Membuat Liga
        Liga perdes = new Liga("Perdes League");
        Liga perkot = new Liga("Perkot League");

        //Divisi perdes
        Divisi utama = new Divisi("Perdes Premiere League",perdes);
        Divisi satu = new Divisi("Perdes Champions League",perdes);
        //Set divisi
        perdes.setDaftarDivisi(utama);
        perdes.setDaftarDivisi(satu);

        //Divisi perkot
        Divisi top = new Divisi("King Of Perkot",perkot);
        Divisi medium = new Divisi("Medium Of perkot",perkot);
        //Set divisi
        perkot.setDaftarDivisi(top);
        perkot.setDaftarDivisi(medium);

        //Club perdes
        Club sukorejo = new Club("Sukorejo FC",utama,perdes);
        Club ledox = new Club("Ledox FC",utama,perdes);
        Club pacul = new Club("Pacul FC",satu,perdes);
        Club gayam = new Club("Gayam FC",satu,perdes);
        //set club perdes
        utama.setDaftarClub(sukorejo);
        utama.setDaftarClub(ledox);
        satu.setDaftarClub(pacul);
        satu.setDaftarClub(gayam);

        //Club perkot
        Club bojonegoro = new Club("Bojonegoro FC",top,perkot);
        Club tuban = new Club("Tuban FC",top,perkot);
        Club plumpang = new Club("Plumpang FC",medium,perkot);
        Club jenu = new Club("Jenu FC",medium,perkot);
        //set club perkot
        top.setDaftarClub(bojonegoro);
        top.setDaftarClub(tuban);
        medium.setDaftarClub(plumpang);
        medium.setDaftarClub(jenu);

        System.out.println("Nomer 1");
        System.out.println("    Divisi dari 'Perdes League' adalah");
        perdes.getDaftarDivisi("Perdes League");
        System.out.println();

        System.out.println("Nomer 2");
        System.out.println("    Club dari 'Perdes League' adalah");
        utama.getDaftarClubbyLiga("Perdes League");
        System.out.println();

        System.out.println("Nomer 3");
        System.out.println("    Club Divisi 'Perdes League'");
        utama.getDaftarClubbyDivisi("   Perdes Premiere League");
        System.out.println("Ini yang kedua");
        utama.getDaftarClubbyDivisi("   Perdes Champions League");
        System.out.println();

        System.out.println("Nomer 4");
        System.out.println("    Club 'Gayam FC' berada di Divisi");
        gayam.getDivisi("Gayam FC");
        System.out.println("Selanjutnya");
        System.out.println("    Club 'Jenu FC' berada di Divisi");
        jenu.getDivisi("Jenu FC");
        System.out.println();

        System.out.println("Nomer 5");
        System.out.println("    'Club Ledox FC' berada di Liga");
        ledox.getLiga("Ledox FC");
        System.out.println("Selanjutnya");
        System.out.println("    Club 'Tuban FC' berada di Liga");
        tuban.getLiga("Tuban FC");
        System.out.println();

        System.out.println("Nama : Moch. Rosid Noviansyah/18/MI-1D/1431140058");
    }
}
