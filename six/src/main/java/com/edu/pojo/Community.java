package com.edu.pojo;

/**
 * @Author
 * @create 2021/12/25 15:09
 */
public class Community {
    private int id;
    private String name;
    private String existing;
    private String completed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExisting() {
        return existing;
    }

    public void setExisting(String existing) {
        this.existing = existing;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", existing='" + existing + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }
}
