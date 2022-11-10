package srl.narrel.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name="appartamento")
@Builder
public class AppartamentoModel {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "condominio", referencedColumnName = "id",nullable = false)
    private CondominioModel condominio;

    @Column(name = "piano", nullable = false)
    private int piano;

    @Column(name = "piano", nullable = false)
    private int numero;

    @Column(name = "metratura",nullable = false)
    private double metratura;

    @Column(name = "consumo_ris")
    private double consumoRiscaldamento;

    @ManyToMany(cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @JoinTable(name = "appartamento_proprietario",
            joinColumns = @JoinColumn(referencedColumnName = "id_appartamento"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id_persona")
    )
    @JsonIgnore
    private List<PersonaModel> proprietari;
    
    public AppartamentoModel(Integer id, CondominioModel c, int p, int n, double m, double cr) {
    	this.id=id;
    	this.condominio=c;
    	this.piano=p;
    	this.numero=n;
    	this.metratura=m;
    	this.consumoRiscaldamento=cr;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CondominioModel getCondominio() {
		return condominio;
	}

	public void setCondominio(CondominioModel condominio) {
		this.condominio = condominio;
	}

	public int getPiano() {
		return piano;
	}

	public void setPiano(int piano) {
		this.piano = piano;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getMetratura() {
		return metratura;
	}

	public void setMetratura(double metratura) {
		this.metratura = metratura;
	}

	public double getConsumoRiscaldamento() {
		return consumoRiscaldamento;
	}

	public void setConsumoRiscaldamento(double consumoRiscaldamento) {
		this.consumoRiscaldamento = consumoRiscaldamento;
	}

	public List<PersonaModel> getProprietari() {
		return proprietari;
	}

	public void setProprietari(List<PersonaModel> proprietari) {
		this.proprietari = proprietari;
	}
        
}
