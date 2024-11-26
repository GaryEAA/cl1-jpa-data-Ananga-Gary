package pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Double lifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<CountryLanguage> countryLanguages;
}
