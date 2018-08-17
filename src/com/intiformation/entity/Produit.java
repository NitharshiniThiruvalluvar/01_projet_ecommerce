package com.intiformation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="produits")
@Table(name="produit")
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Produit")
	private Long idProduit;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="description")
	private String description;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="selection")
	private boolean selection;
	
	@Column(name="photo")
	private String photo;
	
	//=================================================================================================
	//===================================		Ctors		===========================================
	//=================================================================================================
	public Produit() {
		super();
	}
	public Produit(String designation, String description, double prix, int quantite, boolean selection, String photo) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selection = selection;
		this.photo = photo;
	}
	public Produit(Long idProduit, String designation, String description, double prix, int quantite, boolean selection,
			String photo) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selection = selection;
		this.photo = photo;
	}
	
	//=================================================================================================
	//===================================		Getters/Setters		===================================
	//=================================================================================================
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isSelection() {
		return selection;
	}
	public void setSelection(boolean selection) {
		this.selection = selection;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	@Override
	public String toString() {
		return "\n Produit [ idProduit = " + idProduit + ", designation = " + designation + ", description = " + description
				+ ", prix = " + prix + ", quantite = " + quantite + ", selection = " + selection + ", photo = " + photo + " ]";
	}
	
	
}
