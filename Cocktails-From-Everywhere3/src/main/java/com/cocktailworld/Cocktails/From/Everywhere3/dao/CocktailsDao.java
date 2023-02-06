package com.cocktailworld.Cocktails.From.Everywhere3.dao;

import com.cocktailworld.Cocktails.From.Everywhere3.model.CocktailsBook;

import java.util.List;

public interface CocktailsDao {

        boolean logFavCocktail(CocktailsBook cocktail);
        boolean logWishlistCocktail(CocktailsBook cocktailsBook);
        List<CocktailsBook> listAllCocktails(int userId);
        CocktailsBook getCocktailByName(String cocktail);
        List<CocktailsBook> getWishCocktails(int userId);
        List<CocktailsBook> getFavCocktails(int userId);
        List<CocktailsBook> getCocktailsByAlcohol(String alcohol);
        boolean deleteCocktail();
        List<CocktailsBook> getAllCocktailsTried(int userId);


}
