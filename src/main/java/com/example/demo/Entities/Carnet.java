package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "personne")
public class Carnet {
	@Id
	@GeneratedValue
	// private int id;
	private Long id;

	@NotNull(message = "Message d'\'erreur")
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private Civilite civilite;

	@NotBlank
	// @Size(min=2, max=30)
	@Pattern(regexp = "(?i)[a-z]{2,50}", message = "{com.example.demo.annuaire.contraint.nom.message}")
	private String nom;

	@NotBlank
	@Pattern(regexp = "(?i)[a-z\\- �-�]{2,100}", message = "{com.example.demo.annuaire.contraint.prenom.message}")
	private String prenom;

	@NotBlank
	@DateTimeFormat
	private String dateDeNaissance;

	// @NotBlank(message="{com.example.demo.annuaire.contraint.Tel.message}")
	@Pattern(message = "{com.example.demo.annuaire.contraint.Tel.message}", regexp = "^([+]|[0]{2})[0-9]{4,14}(?:x.+)?$")
	private String tel;

	@Email
	private String email;

	// @NotBlank
	@Pattern(regexp = "[0-9]{5}", message = "n'\'oubliez pas d'\'entrer votre code postal")
	private String cp;

	// @NotEmpty
	@Pattern(regexp = "(?i)[a-z- ]{1,45}", message = "{javax.validation.constraints.NotEmpty.message}")
	private String ville;

	public Carnet() {

	}

	public Carnet(/* int */Long id, Civilite civilite, String nom, String prenom, String dateDeNaissance, String tel,
			String email, String cp, String ville) {

		this.id = id;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.tel = tel;
		this.email = email;
		this.cp = cp;
		this.ville = ville;
	}

	public /* int */ Long getId() {
		return id;
	}

	public void setId(/* int */ Long id) {
		this.id = id;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}