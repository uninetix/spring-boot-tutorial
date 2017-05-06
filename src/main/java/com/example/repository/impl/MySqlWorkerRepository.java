package com.example.repository.impl;

import com.example.domain.Worker;
import com.example.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rodzice on 30.04.2017.
 */
@Repository
public class MySqlWorkerRepository implements WorkerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Worker> getAllWorkers() {

        List<Worker> result = jdbcTemplate.query(
                "select * from worker",
                ((rs, rowNum) -> new Worker(rs.getInt("worker_Id"), rs.getString("first_name"), rs.getString("last_name"),
                        rs.getFloat("salary"), rs.getInt("departmentid"), rs.getInt("role")))
        );

        return result;
    }

    @Override
    public boolean addWorker(Worker worker) {
        jdbcTemplate.update("INSERT INTO worker (departmentid, first_name, last_name, role, salary) VALUES (?,?,?,?,?)",
                worker.getDepartmentID(), worker.getFirstName(), worker.getLastName(), worker.getRole(), worker.getSalary());
        return true;
    }
}
