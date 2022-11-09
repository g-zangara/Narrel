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
    public PersonaModel(){}
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
}
