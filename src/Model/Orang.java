/**
 * PT NUTECH INTEGRASI
 * Author: Rahma Danil
 * Create : 15-08-2023
 *
 */

package Model;

import java.time.LocalDate;

public class Orang {

    private String nama;

    private LocalDate tanggalLahir;

    private Number nik;

    public Orang(String nama, LocalDate tanggalLahir, Number nik) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Number getNik() {
        return nik;
    }

    public void setNik(Number nik) {
        this.nik = nik;
    }
}
