package pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.entity.CountryLanguage;
import pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.entity.CountryLanguagePk;

public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, CountryLanguagePk> {
}
