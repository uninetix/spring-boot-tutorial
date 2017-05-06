package com.example;

import com.example.domain.Worker;
import com.example.repository.WorkerRepository;
import com.example.repository.impl.InMemoryWorkerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Rodzice on 02.05.2017.
 */
public class WorkerRepositoryTest {

    WorkerRepository workerRepository;

    @Before
    public void inicializeRepositoru() {
        this.workerRepository = new InMemoryWorkerRepository();
    }

    @Test
    public void readWorkersList() {
        Assert.assertEquals(workerRepository.getAllWorkers().size(), 3);
    }

    @Test
    public void addNewWorker() {
        Assert.assertEquals(workerRepository.addWorker(new Worker(2,"Krzysztof", "Nowak", 2,
                102, 1002)), true);
    }
}
