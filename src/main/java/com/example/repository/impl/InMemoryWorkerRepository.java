package com.example.repository.impl;

import com.example.domain.Worker;
import com.example.repository.WorkerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodzice on 23.04.2017.
 */

@Repository
public class InMemoryWorkerRepository implements WorkerRepository {

    private List<Worker> workers;

    public InMemoryWorkerRepository() {
        Worker worker1 = new Worker(1, "Jan", "Kowalsski", 356.4f, 1, 100);
        Worker worker2 = new Worker(2, "Marcin", "Nowak", 656.4f, 1, 101);
        Worker worker3 = new Worker(3, "Jan", "Kowalsski", 3756.4f, 2, 100);
        this.workers = new ArrayList<Worker>();
        this.workers.add(worker1);
        this.workers.add(worker2);
        this.workers.add(worker3);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workers;
    }

    @Override
    public boolean addWorker(Worker worker) {
        return workers.add(worker);
    }

}
