package srl.narrel.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Builder
@Data
public class RiunioneModel {
    
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


	public RiunioneModel(int id2, Date data2, String location2, List<PersonaModel> arrayList,
			List<PersonaModel> arrayList2) {
		this.id=id2;
		this.data=data2;
		this.location=location2;
		this.invitati=arrayList;
		this.partecipanti=arrayList2;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public List<PersonaModel> getInvitati() {
		return invitati;
	}


	public void setInvitati(List<PersonaModel> invitati) {
		this.invitati = invitati;
	}


	public List<PersonaModel> getPartecipanti() {
		return partecipanti;
	}


	public void setPartecipanti(List<PersonaModel> partecipanti) {
		this.partecipanti = partecipanti;
	}
    
    

}
