package de.agiledojo.tddexercises.searchengine;

import java.util.List;

public interface User {

    void setName(String name);

    String name();

    void setProfile(List<String> profile);

    List<String> profile();
}
