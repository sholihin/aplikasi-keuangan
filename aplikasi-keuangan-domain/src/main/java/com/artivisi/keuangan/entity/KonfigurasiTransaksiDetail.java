package com.artivisi.keuangan.entity;

public class KonfigurasiTransaksiDetail {
	private Long id;
	private String konfigurasiTransaksi;
	private String urutan;
	private String nama;
	private String label;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKonfigurasiTransaksi() {
		return konfigurasiTransaksi;
	}
	public void setKonfigurasiTransaksi(String konfigurasiTransaksi) {
		this.konfigurasiTransaksi = konfigurasiTransaksi;
	}
	public String getUrutan() {
		return urutan;
	}
	public void setUrutan(String urutan) {
		this.urutan = urutan;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
