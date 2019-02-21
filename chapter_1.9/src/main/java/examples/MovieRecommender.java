package examples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Set;

@Data
@Component
public class MovieRecommender {

    private final CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    private MovieCatalog movieCatalog;

    @Autowired
    @Qualifier("main")
    private MovieCatalog movieCatalog2;

    @Autowired
    @Genre("custom")
    private MovieCatalog movieCatalog3;

    @Autowired
    @Genre("custom_by_annotation")
    private MovieCatalog movieCatalog4;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.DVD, genre="Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format=Format.BLURAY, genre="Comedy")
    private MovieCatalog comedyBluRayCatalog;

    @Autowired
    @Qualifier("action")
    private Set<MovieCatalog> movieCatalogSet;

    @Autowired
    private Store<String> s1; // <String> qualifier, injects the stringStore bean

    @Autowired
    private Store<Integer> s2; // <Integer> qualifier, injects the integerStore bean

    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    // ...
}