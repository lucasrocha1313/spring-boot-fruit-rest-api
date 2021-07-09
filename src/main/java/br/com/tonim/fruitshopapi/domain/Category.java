package br.com.tonim.fruitshopapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
