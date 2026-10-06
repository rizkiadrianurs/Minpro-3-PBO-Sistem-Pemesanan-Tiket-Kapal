
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class KapalVIP extends Kapal implements InformasiKapal {

    private String fasilitasVIP;

    public KapalVIP(String namaKapal, String tujuan, int hargaTiket,
            String fasilitasVIP) {

        super(namaKapal, tujuan, hargaTiket);
        setFasilitasVIP(fasilitasVIP);
    }

    public String getFasilitasVIP() {
        return fasilitasVIP;
    }

    public void setFasilitasVIP(String fasilitasVIP) {
        if (fasilitasVIP != null && !fasilitasVIP.trim().isEmpty()) {
            this.fasilitasVIP = fasilitasVIP;
        } else {
            System.out.println("Fasilitas VIP tidak boleh kosong.");
        }
    }

    @Override
    public String getJenisKapal() {
        return "Kapal VIP";
    }

    @Override
    public void tampilkanInformasiDasar() {
        System.out.println("Nama Kapal  : " + getNamaKapal());
        System.out.println("Tujuan      : " + getTujuan());
        System.out.println("Harga Tiket : Rp" + getHargaTiket());
        System.out.println("Jenis Kapal : " + getJenisKapal());
    }

    @Override
    public void tampilkanFasilitas() {
        System.out.println("Fasilitas VIP : " + fasilitasVIP);
    }
}