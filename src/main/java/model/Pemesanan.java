/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author ACER
 */
public class Pemesanan {

    private static int nomorBerikutnya = 1;

    private final String idPemesanan;
    private Penumpang penumpang;
    private Kapal kapal;
    private int jumlahTiket;

    public Pemesanan(Penumpang penumpang, Kapal kapal, int jumlahTiket) {

        idPemesanan = String.format("%03d", nomorBerikutnya++);

        setPenumpang(penumpang);
        setKapal(kapal);
        setJumlahTiket(jumlahTiket);
    }

    public Pemesanan(Penumpang penumpang, Kapal kapal) {
        this(penumpang, kapal, 1);
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public Kapal getKapal() {
        return kapal;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setPenumpang(Penumpang penumpang) {
        if (penumpang != null) {
            this.penumpang = penumpang;
        }
    }

    public void setKapal(Kapal kapal) {
        if (kapal != null) {
            this.kapal = kapal;
        }
    }

    public void setJumlahTiket(int jumlahTiket) {
        if (jumlahTiket > 0) {
            this.jumlahTiket = jumlahTiket;
        }
    }

    public int getTotalHarga() {
        return kapal.getHargaTiket() * jumlahTiket;
    }
}