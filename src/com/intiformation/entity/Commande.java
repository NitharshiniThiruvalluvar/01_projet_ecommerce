package com.intiformation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="commandes")
@Table(name="commande")
public class Commande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Commande")
	private Long idCommade;

	@Column(name="dateCommande")
	private Date dateCommande;

	//=================================================================================================
	//===================================		Ctors		===========================================
	//=================================================================================================
	public Commande() {
		super();
	}

	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}

	public Commande(Long idCommade, Date dateCommande) {
		super();
		this.idCommade = idCommade;
		this.dateCommande = dateCommande;
	}
	
	//=================================================================================================
	//===================================		Getters/Setters		===================================
	//=================================================================================================

	public Long getIdCommade() {
		return idCommade;
	}

	public void setIdCommade(Long idCommade) {
		this.idCommade = idCommade;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	

	
}
