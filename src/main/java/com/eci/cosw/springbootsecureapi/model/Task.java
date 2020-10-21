package com.eci.cosw.springbootsecureapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private long id;

    private String description;

    private String status;

    private String dueDate;

    private User responsible;

    public Task(String description, String status, String dueDate, User responsible){
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.responsible = responsible;
    }
}
