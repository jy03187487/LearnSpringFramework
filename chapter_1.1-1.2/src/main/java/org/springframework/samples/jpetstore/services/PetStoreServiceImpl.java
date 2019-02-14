package org.springframework.samples.jpetstore.services;

import lombok.Data;
import org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao;
import org.springframework.samples.jpetstore.dao.jpa.JpaItemDao;

import java.util.List;

@Data
public class PetStoreServiceImpl implements PetStoreService {

    private JpaAccountDao accountDao;

    private JpaItemDao itemDao;

    public List<String> getUsernameList() {
        return null;
    }
}
