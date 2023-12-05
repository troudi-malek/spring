package tn.esprit.spring.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="chamber")
@Builder
public class Chamber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChamber ;

    @Column(name="numeroChamber" ,unique = true)
    private int numerochamber ;

    @Column(name="TypeC")
    private TypeChamber typeC ;
    @JsonIgnore
    @ManyToOne
    Bloc bloc ;

    @OneToMany(cascade =  CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private  Set<Reservation> reservations  = new HashSet<>();

}
