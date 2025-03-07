package team.green.cfo.daos.jpa;


import org.springframework.transaction.annotation.Transactional;
import team.green.cfo.daos.Dao;
import team.green.cfo.models.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class GenericJpaDao<T extends Model> implements Dao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    public EntityManager em;


    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    @Override
    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }

    @Override
    public void delete(Integer id) {

        em.remove(em.find(modelType, id));

    }
}
