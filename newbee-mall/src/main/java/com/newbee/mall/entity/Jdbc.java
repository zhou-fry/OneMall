package com.newbee.mall.entity;

/**
 * @ClassName Jdbc
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/25 16:47
 **/
public class Jdbc {
    private int id;
    private String type;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jdbc{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
