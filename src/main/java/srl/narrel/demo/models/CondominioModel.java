package srl.narrel.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "condominio")
@Builder
public class CondominioModel {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", length =100, nullable = false )
    private String nome;

    @Column(name = "via", length = 100, nullable = false)
    private String via;

    @OneToMany(mappedBy = "condominio", cascade = CascadeType.REMOVE)
    @JsonIgnore
    List<AppartamentoModel> appartamenti;

    @OneToMany(mappedBy = "condominio", cascade = CascadeType.REMOVE)
    @JsonIgnore
    List<GarageModel> garages;
    
    public CondominioModel(Integer id) {
    	this.id=id;
    }

	public CondominioModel(int id, String nome, String via, List<AppartamentoModel> apt, List<GarageModel> gg) {
		this.id=id;
		this.nome=nome;
		this.via=via;
		this.appartamenti=apt;
		this.garages=gg;
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

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public List<AppartamentoModel> getAppartamenti() {
		return appartamenti;
	}

	public void setAppartamenti(List<AppartamentoModel> appartamenti) {
		this.appartamenti = appartamenti;
	}

	public List<GarageModel> getGarages() {
		return garages;
	}

	public void setGarages(List<GarageModel> garages) {
		this.garages = garages;
	}
    
    

}
