package com.inti.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
//hello peeps
@Entity
public class Voyageur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private long idVoyageurrrrrrrrrrrrrrrr;
=======
	private long idVoyageurrr;
>>>>>>> 4364246a5a6f8e6d3aab629b78b80dbcf7f61557
	
	//bro what is this
	
	private String nomVoyageur;
	private String prenomVoyageur;
	private float age;
	@OneToMany(mappedBy = "voyageur")
	@Transient
	private List<Reservation> reservations = new ArrayList<>();

	private float numDeVol;
	
	public float getNumDeVol() {
		return numDeVol;
	}

	public void setNumDeVol(float numDeVol) {

		this.numDeVol = numDeVol;
	}

	public Voyageur() {
		// TODO Auto-generated constructor stub
	}

	public Voyageur(String nomVoyageur, String prenomVoyageur, int age) {
		this.nomVoyageur = nomVoyageur;
		this.prenomVoyageur = prenomVoyageur;
		this.age = age;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(int idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNomVoyageur() {
		return nomVoyageur;
	}

	public void setNomVoyageur(String nomVoyageur) {
		this.nomVoyageur = nomVoyageur;
	}

	public String getPrenomVoyageur() {
		return prenomVoyageur;
	}

	public void setPrenomVoyageur(String prenomVoyageur) {
		this.prenomVoyageur = prenomVoyageur;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nomVoyageur=" + nomVoyageur + ", prenomVoyageur="
				+ prenomVoyageur + ", age=" + age + ", reservations=" + reservations + "]";
	}

}
