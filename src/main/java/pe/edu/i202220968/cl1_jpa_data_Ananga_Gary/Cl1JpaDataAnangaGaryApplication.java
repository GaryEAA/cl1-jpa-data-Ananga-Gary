package pe.edu.i202220968.cl1_jpa_data_Ananga_Gary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.entity.Country;
import pe.edu.i202220968.cl1_jpa_data_Ananga_Gary.repository.CountryRepository;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataAnangaGaryApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataAnangaGaryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * ifPresentOrElse()
		 */
		Optional<Country> optional = countryRepository.findById("ARG");

		optional.ifPresentOrElse(
				country -> {
					System.out.println("Lenguajes hablados en Argentina (ARG):");
					country.getCountryLanguages().forEach(lang ->
							System.out.println("- " + lang.getCountryLanguagePk().getLanguage()));
				},
				() -> {
					System.out.println("No se encontró el país Argentina (ARG). Buscando lenguajes para Perú (PER):");
					countryRepository.findById("PER").ifPresentOrElse(
							peru -> {
								peru.getCountryLanguages().forEach(lang ->
										System.out.println("- " + lang.getCountryLanguagePk().getLanguage()));
							},
							() -> System.out.println("No se encontró el país Perú (PER).")
					);
				}
		);

		/**
		 * deleteById utilizando programación funcional
		 */
//		String countryCodeCOL = "COL";
//		countryRepository.findById(countryCodeCOL)
//				.ifPresentOrElse(
//						country -> {
//							countryRepository.deleteById(countryCodeCOL);
//							System.out.println("El país " + countryCodeCOL + " y sus ciudades y lenguajes han sido eliminados.");
//						},
//						() -> System.out.println("El país " + countryCodeCOL + " no existe.")
//				);
//
//		String countryCodeARG = "ARG";
//		countryRepository.findById(countryCodeARG)
//				.ifPresentOrElse(
//						country -> {
//							countryRepository.deleteById(countryCodeARG);
//							System.out.println("El país " + countryCodeARG + " y sus ciudades y lenguajes han sido eliminados.");
//						},
//						() -> System.out.println("El país " + countryCodeARG + " no existe.")
//				);
	}
}
