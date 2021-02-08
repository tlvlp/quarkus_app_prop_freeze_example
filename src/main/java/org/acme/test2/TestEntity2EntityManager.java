package org.acme.test2;

import io.quarkus.hibernate.orm.PersistenceUnit;


import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Note: Second 'repository' is handled via a simple EntityManager
 * since the Panache used for the other entity can only handle one datasource
 */
@ApplicationScoped
public class TestEntity2EntityManager {

    private final EntityManager em;

    public TestEntity2EntityManager(@PersistenceUnit("OLD_DS_NAME") EntityManager em) {
        this.em = em;
    }

    public List<TestEntity2> getAllTestEntity1() {
        return em.createQuery("SELECT ent FROM TestEntity2 ent", TestEntity2.class)
                .getResultList();
    }
}
