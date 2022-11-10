package srl.narrel.demo.models;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "garage")
@Builder
public class GarageModel {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "condominio", referencedColumnName = "id", nullable = false)
    private CondominioModel condominio;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "consumo_elettrico")
    private float consumoElettrico;

    public GarageModel(int id2, int numero2, CondominioModel condominioModel, float consumoElettrico2) {
		this.id=id2;
		this.numero=numero2;
		this.condominio=condominioModel;
		this.consumoElettrico=consumoElettrico2;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getConsumoElettrico() {
		return consumoElettrico;
	}

	public void setConsumoElettrico(float consumoElettrico) {
		this.consumoElettrico = consumoElettrico;
	}   

}
