/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 80,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: david@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-31T13:52:34.035+01:00[Europe/Berlin]")
public class InlineObject2 {
  public static final String SERIALIZED_NAME_INGREDIENT_LIST = "ingredientList";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_LIST)
  private String ingredientList;

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private BigDecimal servings;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private BigDecimal mode;

  public static final String SERIALIZED_NAME_DEFAULT_CSS = "defaultCss";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CSS)
  private Boolean defaultCss;

  public static final String SERIALIZED_NAME_SHOW_BACKLINK = "showBacklink";
  @SerializedName(SERIALIZED_NAME_SHOW_BACKLINK)
  private Boolean showBacklink;

  public InlineObject2 ingredientList(String ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

   /**
   * The ingredient list of the recipe, one ingredient per line.
   * @return ingredientList
  **/
  @ApiModelProperty(example = "3 oz flour", required = true, value = "The ingredient list of the recipe, one ingredient per line.")
  public String getIngredientList() {
    return ingredientList;
  }

  public void setIngredientList(String ingredientList) {
    this.ingredientList = ingredientList;
  }

  public InlineObject2 servings(BigDecimal servings) {
    this.servings = servings;
    return this;
  }

   /**
   * The number of servings.
   * @return servings
  **/
  @ApiModelProperty(example = "2", required = true, value = "The number of servings.")
  public BigDecimal getServings() {
    return servings;
  }

  public void setServings(BigDecimal servings) {
    this.servings = servings;
  }

  public InlineObject2 mode(BigDecimal mode) {
    this.mode = mode;
    return this;
  }

   /**
   * The mode in which the widget should be delivered. 1 &#x3D; separate views (compact), 2 &#x3D; all in one view (full).
   * @return mode
  **/
  @ApiModelProperty(example = "1", value = "The mode in which the widget should be delivered. 1 = separate views (compact), 2 = all in one view (full).")
  public BigDecimal getMode() {
    return mode;
  }

  public void setMode(BigDecimal mode) {
    this.mode = mode;
  }

  public InlineObject2 defaultCss(Boolean defaultCss) {
    this.defaultCss = defaultCss;
    return this;
  }

   /**
   * Whether the default CSS should be added to the response.
   * @return defaultCss
  **/
  @ApiModelProperty(example = "true", value = "Whether the default CSS should be added to the response.")
  public Boolean getDefaultCss() {
    return defaultCss;
  }

  public void setDefaultCss(Boolean defaultCss) {
    this.defaultCss = defaultCss;
  }

  public InlineObject2 showBacklink(Boolean showBacklink) {
    this.showBacklink = showBacklink;
    return this;
  }

   /**
   * Whether to show a backlink to spoonacular. If set false, this call counts against your quota.
   * @return showBacklink
  **/
  @ApiModelProperty(example = "true", value = "Whether to show a backlink to spoonacular. If set false, this call counts against your quota.")
  public Boolean getShowBacklink() {
    return showBacklink;
  }

  public void setShowBacklink(Boolean showBacklink) {
    this.showBacklink = showBacklink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.ingredientList, inlineObject2.ingredientList) &&
        Objects.equals(this.servings, inlineObject2.servings) &&
        Objects.equals(this.mode, inlineObject2.mode) &&
        Objects.equals(this.defaultCss, inlineObject2.defaultCss) &&
        Objects.equals(this.showBacklink, inlineObject2.showBacklink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredientList, servings, mode, defaultCss, showBacklink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    defaultCss: ").append(toIndentedString(defaultCss)).append("\n");
    sb.append("    showBacklink: ").append(toIndentedString(showBacklink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

