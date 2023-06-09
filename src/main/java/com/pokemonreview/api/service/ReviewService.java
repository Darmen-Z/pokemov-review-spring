package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    ReviewDto createReview(int pokemonId, ReviewDto reviewDto);
    ReviewDto getReviewById(int reviewId, int pokemonId);
    ReviewDto updateReview(int reviewId,int pokemonId, ReviewDto reviewDto);
    void deleteReview(int pokemonId, int reviewId);
    List<ReviewDto> getReviewsByPokemonId(int id);

}
