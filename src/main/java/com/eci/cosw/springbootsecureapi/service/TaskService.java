package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    void createTask(Task task);

}
