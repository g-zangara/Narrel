package srl.narrel.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Data
public class RiunioneModel {
    public RiunioneModel(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date data;

    @ManyToMany
    @JoinTable(name = "riunione_invitati",
            joinColumns = @JoinColumn(referencedColumnName = "id_riunione"),
            inverseJoinColumns= @JoinColumn(referencedColumnName = "id_persona")
    )
    @JsonIgnore
    private List<PersonaModel> invitati;


    @ManyToMany
    @JoinTable(name = "riunione_partecipanti",
            joinColumns = @JoinColumn(referencedColumnName = "id_riunione"),
            inverseJoinColumns= @JoinColumn(referencedColumnName = "id_persona")
    )
    @JsonIgnore
    private List<PersonaModel> partecipanti;

}
