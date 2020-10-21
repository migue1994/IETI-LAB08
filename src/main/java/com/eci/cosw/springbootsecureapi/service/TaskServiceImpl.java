package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    private final List<Task> tasks = new ArrayList<>();

    final UserService userService;

    public TaskServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void populateData() throws Exception {
        User user = userService.findUserByUsername("xyz");
        tasks.add(new Task("Task planer backend", "in progress", "12-05-2020", user));
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public void createTask(Task task) {
        tasks.add(task);
    }
}
