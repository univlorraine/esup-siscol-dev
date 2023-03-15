/*
 * MOF Application v1 - Mise en œuvre de l'offre de formation - Bloc «application»
 * Liste l'ensemble des services et des opérations utilisées par l'application front du module MOF (Mise en œuvre de l'offre de formation)  ### Authentification/autorisation obligatoire  Pour tout appel à une opération vous devez être authentifié/authorisé (voir le paragraphe [Authentification](#section/Authentication) pour les détails).  ### Type de données  Sauf indications spécifiques données au niveau de l'opération, les types de données utilisés dans cette API sont les suivants :  * string - Chaîne de caractères encodée en UTF8 (ex : `Une chaîne de caractère`)    * Dans le cas des descripteurs de type `codeXxx`, seuls les caractères de A à Z, de 0 à 9 et le tiret(-) sont autorisés    * Dans le cas des descripteurs de type montant ou nombre avec une partie décimale, seuls les caractères de 0 à 9 et le point(.) sont autorisés (ex : `12525.99`)  * string($date) - Une date sous la forme d'une chaîne de caractères (ex : `2020-02-25`, norme [ISO-8601](https://fr.wikipedia.org/wiki/ISO_8601))  * string($date-time) - Une date et heure avec fuseau horaire sous la forme d'une chaîne de caractères (ex : `2020-02-25T18:36:22+02:00`, norme [ISO-8601](https://fr.wikipedia.org/wiki/ISO_8601))  * integer($int64) - Un entier sur 64 bits (de -9 223 372 036 854 775 808 à 9 223 372 036 854 775 807) (ex : `2542`)  * integer($int32) - Un entier sur 32 bits (de –2 147 483 648 à 2 147 483 647) (ex : `2542`)  * boolean - Un booléen représenté par `true` ou `false`  ### Code retour   * 200 - Ok : L'opération s'est déroulée avec succès  * 201 - Created : L'opération a aboutie à la création d'une ressource  * 400 - Bad request :    * Un ou des paramètres d'entrées sont erronées    * Une erreur fonctionnelle s'est produite  * 404 - Not Found : La ressource demandée n'est pas trouvé    * Remarque : Dans le cas des opérations retournant une liste, on recevra un code 200 avec en résultat une liste vide  * 500 - Internal server error : Erreur inattendue et non gérés 
 *
 * The version of the OpenAPI document: 2.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.esupportail.referentiel.pcscol.model.formation;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * La tarification sans ses élements de droits
 */
@ApiModel(description = "La tarification sans ses élements de droits")
@JsonPropertyOrder({
  DroitTarification.JSON_PROPERTY_CODE,
  DroitTarification.JSON_PROPERTY_LIBELLE,
  DroitTarification.JSON_PROPERTY_LIBELLE_COURT,
  DroitTarification.JSON_PROPERTY_LIBELLE_LONG
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-16T08:54:45.925006+01:00[Europe/Paris]")
public class DroitTarification {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_LIBELLE = "libelle";
  private String libelle;

  public static final String JSON_PROPERTY_LIBELLE_COURT = "libelleCourt";
  private String libelleCourt;

  public static final String JSON_PROPERTY_LIBELLE_LONG = "libelleLong";
  private String libelleLong;

  public DroitTarification() { 
  }

  public DroitTarification code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Le code de la tarification de droit
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le code de la tarification de droit")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public DroitTarification libelle(String libelle) {
    this.libelle = libelle;
    return this;
  }

   /**
   * Le libellé de la tarification de droit
   * @return libelle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le libellé de la tarification de droit")
  @JsonProperty(JSON_PROPERTY_LIBELLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLibelle() {
    return libelle;
  }


  @JsonProperty(JSON_PROPERTY_LIBELLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }


  public DroitTarification libelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
    return this;
  }

   /**
   * Le libellé court de la tarification de droit
   * @return libelleCourt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le libellé court de la tarification de droit")
  @JsonProperty(JSON_PROPERTY_LIBELLE_COURT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLibelleCourt() {
    return libelleCourt;
  }


  @JsonProperty(JSON_PROPERTY_LIBELLE_COURT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLibelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
  }


  public DroitTarification libelleLong(String libelleLong) {
    this.libelleLong = libelleLong;
    return this;
  }

   /**
   * Le libellé long de la tarification de droit
   * @return libelleLong
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le libellé long de la tarification de droit")
  @JsonProperty(JSON_PROPERTY_LIBELLE_LONG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLibelleLong() {
    return libelleLong;
  }


  @JsonProperty(JSON_PROPERTY_LIBELLE_LONG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLibelleLong(String libelleLong) {
    this.libelleLong = libelleLong;
  }


  /**
   * Return true if this DroitTarification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DroitTarification droitTarification = (DroitTarification) o;
    return Objects.equals(this.code, droitTarification.code) &&
        Objects.equals(this.libelle, droitTarification.libelle) &&
        Objects.equals(this.libelleCourt, droitTarification.libelleCourt) &&
        Objects.equals(this.libelleLong, droitTarification.libelleLong);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, libelle, libelleCourt, libelleLong);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DroitTarification {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    libelle: ").append(toIndentedString(libelle)).append("\n");
    sb.append("    libelleCourt: ").append(toIndentedString(libelleCourt)).append("\n");
    sb.append("    libelleLong: ").append(toIndentedString(libelleLong)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

