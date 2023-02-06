package com.cocktailworld.Cocktails.From.Everywhere3.model;

public class CocktailsBook {
    private int cocktailId;
    private int accountId;
    private String favCocktail;
    private String cocktailName;
    private String wishlistCocktail;
    private String favAlcohol;
    private String cocktailDescription;
    private String cocktailNotes;
    private String cocktailInstructions;
    private String cocktailIngredients;

    public String getCocktailIngredients() {
        return cocktailIngredients;
    }

    public void setCocktailIngredients(String cocktailIngredients) {
        this.cocktailIngredients = cocktailIngredients;
    }

    public String getFavCocktail() {
        return favCocktail;
    }

    public void setFavCocktail(String favCocktail) {
        this.favCocktail = favCocktail;
    }

    public String getCocktailName() {
        return cocktailName;
    }

    public void setCocktailName(String cocktailName) {
        this.cocktailName = cocktailName;
    }

    public int getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(int cocktailId) {
        this.cocktailId = cocktailId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFav_cocktail() {
        return favCocktail;
    }

    public void setFav_cocktail(String fav_cocktail) {
        this.favCocktail = fav_cocktail;
    }

    public String getWishlistCocktail() {
        return wishlistCocktail;
    }

    public void setWishlistCocktail(String wishlistCocktail) {
        this.wishlistCocktail = wishlistCocktail;
    }

    public String getFavAlcohol() {
        return favAlcohol;
    }

    public void setFavAlcohol(String favAlcohol) {
        this.favAlcohol = favAlcohol;
    }

    public String getCocktailDescription() {
        return cocktailDescription;
    }

    public void setCocktailDescription(String cocktailDescription) {
        this.cocktailDescription = cocktailDescription;
    }

    public String getCocktailNotes() {
        return cocktailNotes;
    }

    public void setCocktailNotes(String cocktailNotes) {
        this.cocktailNotes = cocktailNotes;
    }

    public String getCocktailInstructions() {
        return cocktailInstructions;
    }

    public void setCocktailInstructions(String cocktailInstructions) {
        this.cocktailInstructions = cocktailInstructions;
    }
}
