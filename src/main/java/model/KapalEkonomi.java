/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class KapalEkonomi extends Kapal implements InformasiKapal {

    private String fasilitasEkonomi;

    public KapalEkonomi(String namaKapal, String tujuan, int hargaTiket,
            String fasilitasEkonomi) {

        super(namaKapal, tujuan, hargaTiket);
        setFasilitasEkonomi(fasilitasEkonomi);
    }

    public String getFasilitasEkonomi() {
        return fasilitasEkonomi;
    }

    public void setFasilitasEkonomi(String fasilitasEkonomi) {
        if (fasilitasEkonomi != null && !fasilitasEkonomi.trim().isEmpty()) {
            this.fasilitasEkonomi = fasilitasEkonomi;
        } else {
            System.out.println("Fasilitas ekonomi tidak boleh kosong.");
        }
    }

    @Override
    public String getJenisKapal() {
        return "Kapal Ekonomi";
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
        System.out.println("Fasilitas Ekonomi : " + fasilitasEkonomi);
    }
}