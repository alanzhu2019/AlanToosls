package com.alan.Test;

public class News {
    private String name;
    private String description;

    public News(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                '}';
    }
}
