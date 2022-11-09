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
    public AppartamentoModel(){}
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
}
