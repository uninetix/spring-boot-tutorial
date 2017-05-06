package com.example.repository;

import com.example.domain.Worker;

import java.util.List;

/**
 * Created by Rodzice on 23.04.2017.
 */
public interface WorkerRepository {
    List<Worker> getAllWorkers();
    boolean addWorker(Worker worker);
}
