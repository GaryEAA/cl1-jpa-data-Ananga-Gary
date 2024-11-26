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
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguagePk countryLanguagePk;
    private String isOfficial;
    private Double percentage;

    @ManyToOne
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode", referencedColumnName = "code", insertable = false, updatable = false)
    private Country country;

}
