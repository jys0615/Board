package com.study.board.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    private String title;

    public String content;

    private String filename;

    private String filepath;

}
