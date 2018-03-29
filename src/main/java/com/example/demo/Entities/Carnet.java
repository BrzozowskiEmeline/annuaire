package com.example.demo.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "adress")
public class Carnet {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	// private int id;
	private Long id;

	@NotNull(message = "Message d'\'erreur")
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private Civilite civilite;

	@NotBlank
	// @Size(min=2, max=30)
	@Pattern(regexp = "(?i)[a-z]{2,50}", message = "{com.example.demo.annuaire.contraint.nom.message}")
	@Column(length = 30)
	private String nom;

	@NotBlank
	@Pattern(regexp = "(?i)[a-z\\- à-ÿ]{2,100}", message = "{com.example.demo.annuaire.contraint.prenom.message}")
	@Column(length = 50)
	private String prenom;

	@NotBlank
	@DateTimeFormat
	@Column(columnDefinition="date", name="birthday", length=5 )
	private String dateDeNaissance;

	// @NotBlank(message="{com.example.demo.annuaire.contraint.Tel.message}")
	@Pattern(message = "{com.example.demo.annuaire.contraint.Tel.message}", regexp = "[0-9]{4,14}")
	@Column(length = 10)
	private String tel;

	@Email
	private String email;

	// @NotBlank
	@Pattern(regexp = "[0-9]{5}", message = "n'\'oubliez pas d'\'entrer votre code postal")
	@Column(name="codePostal", length=5)
	private String cp;

	// @NotEmpty
	@Pattern(regexp = "(?i)[a-z- ]{1,45}", message = "{javax.validation.constraints.NotEmpty.message}")
	@Column(length = 50)
	private String ville;

	public Carnet() {
	
		adress =new ArrayList<>();
		comptes =new ArrayList<>();
	}



	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}



	@ManyToMany
	private List<Adress> adress;
	
	@ManyToMany
	private List<Compte> comptes;
	
	
	

	
	
	
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

	public List<Adress> getAdress() {
		return adress;
	}

	public void setAdress(List<Adress> adress) {
		this.adress = adress;
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
