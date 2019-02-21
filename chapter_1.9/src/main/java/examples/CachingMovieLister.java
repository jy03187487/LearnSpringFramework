package examples;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CachingMovieLister {
    @PostConstruct
    public void populateMovieCache() {
        // populates the movie cache upon initialization...
        System.out.println("populates the movie cache upon initialization...");
    }

    @PreDestroy
    public void clearMovieCache() {
        // clears the movie cache upon destruction...
        System.out.println("clears the movie cache upon destruction...");
    }
}
