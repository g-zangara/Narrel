package srl.narrel.demo.models;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "garage")
@Builder
public class GarageModel {
    public GarageModel(){}
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

}
