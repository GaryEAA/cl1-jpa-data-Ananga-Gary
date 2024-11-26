package pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CountryLanguagePk {
    @Column(name = "CountryCode")
    private String countryCode;
    @Column(name = "Language")
    private String language;
}

