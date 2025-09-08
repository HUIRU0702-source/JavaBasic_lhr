package com.athuiru.exer.comparable;

import java.util.Objects;

public class Item implements Comparable {
    private String name;
    private int priority;

    public Item() {
    }

    public Item(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return priority == item.priority && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof Item) {
            Item o1 = (Item) o;
            int value = Integer.compare(this.priority, o1.priority);
            if (value == 0) {
                return this.name.compareTo(o1.name);
            } else {
                return -value;
            }
        }

        throw new RuntimeException("类型不匹配");
    }
}
