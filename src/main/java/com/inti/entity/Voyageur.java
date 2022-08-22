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

@Entity
public class Voyageur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	private String nomVoyageyr;
	private String prenomVoyageur;
	private int age;
	@OneToMany(mappedBy = "voyageur")
	@Transient
	private List<Reservation> reservations = new ArrayList<>();

	public Voyageur() {
		// TODO Auto-generated constructor stub
	}

	public Voyageur(String nomVoyageyr, String prenomVoyageur, int age) {
		this.nomVoyageyr = nomVoyageyr;
		this.prenomVoyageur = prenomVoyageur;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNomVoyageyr() {
		return nomVoyageyr;
	}

	public void setNomVoyageyr(String nomVoyageyr) {
		this.nomVoyageyr = nomVoyageyr;
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
		return "Voyageur [idVoyageur=" + idVoyageur + ", nomVoyageyr=" + nomVoyageyr + ", prenomVoyageur="
				+ prenomVoyageur + ", age=" + age + ", reservations=" + reservations + "]";
	}

}
