package com.mahmoud.bashir.bellman_task.pojo;

public class model {
    private int status_code;
    private String message;
    data data;

    public model(int status_code, String message, com.mahmoud.bashir.bellman_task.pojo.data data) {
        this.status_code = status_code;
        this.message = message;
        this.data = data;
    }

    public model() {
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public com.mahmoud.bashir.bellman_task.pojo.data getData() {
        return data;
    }

    public void setData(com.mahmoud.bashir.bellman_task.pojo.data data) {
        this.data = data;
    }
}
