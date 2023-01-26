package com.cocktailworld.Cocktails.From.Everywhere3.dao;

import com.cocktailworld.Cocktails.From.Everywhere3.model.CocktailsBook;

import java.util.List;

public class JdbcCocktailsDao implements CocktailsDao {
    private final JdbcCocktailsDao jdbcTemplate;

    public JdbcCocktailsDao(JdbcCocktailsDao jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean logFavCocktail(CocktailsBook cocktail) {
        String sql = "Insert into cocktails fav_cocktail";
        return false;
    }

    @Override
    public boolean logWishlistCocktail(CocktailsBook cocktailsBook) {
        return false;
    }

    @Override
    public List<CocktailsBook> listAllCocktails(int userId) {
        return null;
    }

    @Override
    public CocktailsBook getCocktailByName(String cocktail) {
        return null;
    }

    @Override
    public List<CocktailsBook> getWishCocktails(int userId) {
        return null;
    }

    @Override
    public List<CocktailsBook> getFavCocktails(int userId) {
        return null;
    }
}
