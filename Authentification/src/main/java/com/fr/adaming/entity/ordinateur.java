package com.fr.adaming.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @NoArgsConstructor @ToString @AllArgsConstructor
public class ordinateur {
	
	private Integer id;
	private String marque;
	private String modele;
	private LocalDate dateSortie;
	
	
	public ordinateur(String marque, LocalDate dateSortie) {
		super();
		this.marque = marque;
		this.dateSortie = dateSortie;
	}


	public ordinateur(String marque, String modele) {
		super();
		this.marque = marque;
		this.modele = modele;
	}
	
	

}
