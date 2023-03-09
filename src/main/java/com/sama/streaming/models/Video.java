package com.sama.streaming.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private  String name;


    @Lob
    private  byte[] data;

    public Video(String name, byte[] data) {
        this.name = name;
        this.data = data;
    }
}
