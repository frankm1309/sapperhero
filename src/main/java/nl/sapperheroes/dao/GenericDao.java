package nl.sapperheroes.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract class GenericDao {

    protected EntityManager em;


    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }



}