package srl.narrel.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


import java.util.List;


@Entity
@Data
@Builder
public class PersonaModel {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome",length = 50, nullable = false)
    private String nome;

    @Column(name = "cognome", length = 50,nullable = false)
    private String cognome;

    @Column(name = "codice_fiscale",length = 16, nullable = false)
    private String codiceFiscale;

    //mancano le many to many con appartamenti e riunioni
    @ManyToMany(mappedBy = "proprietari")
    private List<AppartamentoModel> appartamenti;

    @ManyToMany(mappedBy = "invitati")
    @JsonIgnore
    List<RiunioneModel> inviti;

    @ManyToMany(mappedBy = "partecipanti")
    @JsonIgnore
    List<RiunioneModel> partecipazioni;
        
    public PersonaModel(int id2, String nome2, String cognome2, String codiceFiscale2,
			List<AppartamentoModel> arrayList, List<RiunioneModel> arrayList2,
			List<RiunioneModel> arrayList3) {
		this.id=id2;
		this.nome=nome2;
		this.cognome=cognome2;
		this.codiceFiscale=codiceFiscale2;
		this.appartamenti=arrayList;
		this.inviti=arrayList2;
		this.partecipazioni=arrayList3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public List<AppartamentoModel> getAppartamenti() {
		return appartamenti;
	}

	public void setAppartamenti(List<AppartamentoModel> appartamenti) {
		this.appartamenti = appartamenti;
	}

	public List<RiunioneModel> getInviti() {
		return inviti;
	}

	public void setInviti(List<RiunioneModel> inviti) {
		this.inviti = inviti;
	}

	public List<RiunioneModel> getPartecipazioni() {
		return partecipazioni;
	}

	public void setPartecipazioni(List<RiunioneModel> partecipazioni) {
		this.partecipazioni = partecipazioni;
	}
    
    
}
