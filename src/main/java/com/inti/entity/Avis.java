package com.inti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAvis;
	private String commentaire;
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel hotel;
	
	
	
	
	public long getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(long idAvis) {
		this.idAvis = idAvis;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	

}
