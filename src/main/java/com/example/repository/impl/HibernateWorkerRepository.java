package com.example.repository.impl;

import com.example.domain.Worker;
import com.example.repository.WorkerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Rodzice on 17.06.2017.
 */

@Transactional
@Repository
public class HibernateWorkerRepository implements WorkerRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Worker> getAllWorkers() {
        String hql = "FROM Worker";
        return (List<Worker>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addWorker(Worker worker) {
        entityManager.persist(worker);
    }
}
