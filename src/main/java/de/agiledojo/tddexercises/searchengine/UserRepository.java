package de.agiledojo.tddexercises.searchengine;

import java.util.List;

public interface UserRepository {

    List<User> findBy(String keyword);

    void saveNewUser(String username, List<String> profile);


}
