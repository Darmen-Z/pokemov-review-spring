package com.pokemonreview.api.exceptions;

import com.pokemonreview.api.models.Pokemon;

public class PokemonNotFoundException  extends  RuntimeException{
    private static final long serialVersionUID = 1;

    public PokemonNotFoundException(String message){
        super(message);
    }
}
