package pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    private Integer id;
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode")
    private Country country;
    private String district;
    private Integer population;
}
