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
    public CondominioModel(){}
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

}
