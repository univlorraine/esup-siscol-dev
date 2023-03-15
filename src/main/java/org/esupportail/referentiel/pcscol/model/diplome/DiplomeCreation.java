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


package org.esupportail.referentiel.pcscol.model.diplome;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DiplomeCreation
 */
@JsonPropertyOrder({
  DiplomeCreation.JSON_PROPERTY_CODE,
  DiplomeCreation.JSON_PROPERTY_CODE_TYPE_FINALITE_FORMATION,
  DiplomeCreation.JSON_PROPERTY_LIBELLE_COURT,
  DiplomeCreation.JSON_PROPERTY_DENOMINATION,
  DiplomeCreation.JSON_PROPERTY_VALIDITE,
  DiplomeCreation.JSON_PROPERTY_ACTIF
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-16T08:54:45.925006+01:00[Europe/Paris]")
public class DiplomeCreation {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CODE_TYPE_FINALITE_FORMATION = "codeTypeFinaliteFormation";
  private String codeTypeFinaliteFormation;

  public static final String JSON_PROPERTY_LIBELLE_COURT = "libelleCourt";
  private String libelleCourt;

  public static final String JSON_PROPERTY_DENOMINATION = "denomination";
  private String denomination;

  public static final String JSON_PROPERTY_VALIDITE = "validite";
  private String validite;

  public static final String JSON_PROPERTY_ACTIF = "actif";
  private Boolean actif;

  public DiplomeCreation() { 
  }

  public DiplomeCreation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code du diplome ou certificat ou autre
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Code du diplome ou certificat ou autre")
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


  public DiplomeCreation codeTypeFinaliteFormation(String codeTypeFinaliteFormation) {
    this.codeTypeFinaliteFormation = codeTypeFinaliteFormation;
    return this;
  }

   /**
   * Le type de finalité de formation du diplôme ou certificat ou autre
   * @return codeTypeFinaliteFormation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le type de finalité de formation du diplôme ou certificat ou autre")
  @JsonProperty(JSON_PROPERTY_CODE_TYPE_FINALITE_FORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeTypeFinaliteFormation() {
    return codeTypeFinaliteFormation;
  }


  @JsonProperty(JSON_PROPERTY_CODE_TYPE_FINALITE_FORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeTypeFinaliteFormation(String codeTypeFinaliteFormation) {
    this.codeTypeFinaliteFormation = codeTypeFinaliteFormation;
  }


  public DiplomeCreation libelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
    return this;
  }

   /**
   * Le libellé court du diplôme, certificat ou autre
   * @return libelleCourt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Le libellé court du diplôme, certificat ou autre")
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


  public DiplomeCreation denomination(String denomination) {
    this.denomination = denomination;
    return this;
  }

   /**
   * La dénomination officielle du diplôme, certificat ou autre. Libellé utilisé dans l&#39;attestation de réussite, dans l&#39;édition du diplôme et dans le supplément au diplôme.
   * @return denomination
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "La dénomination officielle du diplôme, certificat ou autre. Libellé utilisé dans l'attestation de réussite, dans l'édition du diplôme et dans le supplément au diplôme.")
  @JsonProperty(JSON_PROPERTY_DENOMINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDenomination() {
    return denomination;
  }


  @JsonProperty(JSON_PROPERTY_DENOMINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDenomination(String denomination) {
    this.denomination = denomination;
  }


  public DiplomeCreation validite(String validite) {
    this.validite = validite;
    return this;
  }

   /**
   * La durée de validité du diplôme certificat ou autre
   * @return validite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "La durée de validité du diplôme certificat ou autre")
  @JsonProperty(JSON_PROPERTY_VALIDITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValidite() {
    return validite;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidite(String validite) {
    this.validite = validite;
  }


  public DiplomeCreation actif(Boolean actif) {
    this.actif = actif;
    return this;
  }

   /**
   * La version du diplôme est-elle active
   * @return actif
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "La version du diplôme est-elle active")
  @JsonProperty(JSON_PROPERTY_ACTIF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActif() {
    return actif;
  }


  @JsonProperty(JSON_PROPERTY_ACTIF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActif(Boolean actif) {
    this.actif = actif;
  }


  /**
   * Return true if this DiplomeCreation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiplomeCreation diplomeCreation = (DiplomeCreation) o;
    return Objects.equals(this.code, diplomeCreation.code) &&
        Objects.equals(this.codeTypeFinaliteFormation, diplomeCreation.codeTypeFinaliteFormation) &&
        Objects.equals(this.libelleCourt, diplomeCreation.libelleCourt) &&
        Objects.equals(this.denomination, diplomeCreation.denomination) &&
        Objects.equals(this.validite, diplomeCreation.validite) &&
        Objects.equals(this.actif, diplomeCreation.actif);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeTypeFinaliteFormation, libelleCourt, denomination, validite, actif);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiplomeCreation {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeTypeFinaliteFormation: ").append(toIndentedString(codeTypeFinaliteFormation)).append("\n");
    sb.append("    libelleCourt: ").append(toIndentedString(libelleCourt)).append("\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
    sb.append("    validite: ").append(toIndentedString(validite)).append("\n");
    sb.append("    actif: ").append(toIndentedString(actif)).append("\n");
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

