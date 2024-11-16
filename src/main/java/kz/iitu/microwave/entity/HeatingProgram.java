package kz.iitu.microwave.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Класс представляет программу нагрева в микроволновой печи.
 */
@Entity // Аннотация указывает, что это сущность JPA и будет отображаться в таблицу базы данных.
public class HeatingProgram {

    @Id // Обозначает поле как первичный ключ.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Автоматическая генерация значения ID.
    private Long id;

    // Название программы (например, "Быстрый разогрев").
    private String name;

    // Мощность нагрева в ваттах.
    private int power;

    // Длительность программы в секундах.
    private int duration;

    // Пустой конструктор для JPA.
    public HeatingProgram() {}

    // Конструктор для создания новых программ с указанием параметров.
    public HeatingProgram(String name, int power, int duration) {
        this.name = name;
        this.power = power;
        this.duration = duration;
    }

    // Геттеры и сеттеры для полей.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}