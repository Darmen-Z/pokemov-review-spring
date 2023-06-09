package com.pokemonreview.api.models;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private int stars;


    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn( name = "pokemon.id")
    private Pokemon pokemon;
    
}
