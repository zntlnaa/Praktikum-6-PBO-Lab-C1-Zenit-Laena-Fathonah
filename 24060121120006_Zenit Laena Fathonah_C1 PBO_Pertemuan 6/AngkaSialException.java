/**
* File : AngkaSialException.java
* Tanggal : 30/03/2023
* Nama : Zenit Laena Fathonah
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
**/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}