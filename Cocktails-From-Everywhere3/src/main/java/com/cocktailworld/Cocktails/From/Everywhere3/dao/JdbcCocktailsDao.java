package com.cocktailworld.Cocktails.From.Everywhere3.dao;

import com.cocktailworld.Cocktails.From.Everywhere3.model.CocktailsBook;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;
@Component
public class JdbcCocktailsDao implements CocktailsDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcCocktailsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean logFavCocktail(CocktailsBook cocktail) {
        String sql = "Insert into cocktails " +
                "(fav_cocktail, cocktail_description, cocktail_notes, " +
                "cocktail_instructions, cocktail_instructions, cocktail_ingred)" +
                "Values ('true', ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, Integer.class, cocktail.getCocktailDescription(),
                cocktail.getCocktailNotes(), cocktail.getCocktailInstructions(), cocktail.getCocktailIngredients()) == 1;
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

    @Override
    public List<CocktailsBook> getCocktailsByAlcohol(String alcohol) {
        return null;
    }

    @Override
    public boolean deleteCocktail() {
        return false;
    }

    @Override
    public List<CocktailsBook> getAllCocktailsTried(int userId) {
        return null;
    }
}
