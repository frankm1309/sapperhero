package nl.sapperheroes.dao;


import nl.sapperheroes.model.jobs.Job;
import org.springframework.stereotype.Repository;


import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class JobDao extends GenericDao {


    public Job findJobById(Integer id) {
        return em.find(Job.class, id);
    }

    public Job saveOrUpdateJob(Job job){
        return em.merge(job);
    }

    public void deleteJob(Integer id) {
        em.remove(em.find(Job.class, id));
    }

    public List<Job> listAllJobs() {
        CriteriaQuery<Job> criteriaQuery = em.getCriteriaBuilder().createQuery(Job.class);
        Root<Job> root = criteriaQuery.from(Job.class);
        return em.createQuery(criteriaQuery).getResultList();
    }

}