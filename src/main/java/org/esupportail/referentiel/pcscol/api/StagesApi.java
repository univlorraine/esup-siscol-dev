/*
 * STA Externe V1 -  Contrat Api pour mise à disposition pour les SI de gestion de stage (Esup-stage, ...)
 *  # Introduction Liste l'ensemble des services et des opérations disponibles dans le service stage  Le service stage a pour vocation de mettre à disposition l'ensemble des éléments nécessaires aux systèmes d'informations de gestion des stages  # Authentification/autorisation obligatoire Pour tout appel à une opération vous devez être authentifié/autorisé à l’aide d’un token jwt. Pour cela, chaque requête HTTP doit contenir un token valide dans le header HTTP Authorization.  # Notions métiers  ## Apprenant Tout étudiant en formation initiale (dont apprentis) ou stagiaire de la formation continue inscrit administrativement ou pédagogiquement sur une formation ou un objet de formation.  ## Inscription Objet maquette (Formation ou Objet de formation) sur lesquels est inscrit administrativement l'apprenant.  ## Stage Objet de formation taggué stage qui fait partie de la descendance de l'objet maquette sur lequel est inscrit l'apprenant  # Gestion des erreurs  ## Codes d'erreurs  <exemple-status-code>  | Code    | Description                                | |---------|--------------------------------------------| | 200     | Opération effectuée                        | | 201     | Ressource créée                            | | 400     | Données envoyées par le client invalides   | | 404     | Ressource inexistante                      | | 500     | Erreur technique rencontrée par le serveur |  <exemple-erreurs>  ## Contenu d'une erreur métier (statusCode: 400 ou 404)  Lorsqu'une erreur 400 ou 404 (ressource métier non existante) est générée, le corps HTTP de la réponse contient:  ``` {     \"correlationId\": \"1ace2ef3-b00a-49d1-a45e-6b10783c6038\",     \"timestamp\": \"2020-06-24T15:17:48.95941+02:00\",     \"version\": \"1.1.0\",     \"path\": \"/api/cof/v2-draft/etablissements/ETAB00/formations\",     \"statusCode\": \"400\",     \"errors\": [         {             \"code\": \"FormatDeCodeValide\",             \"message\": \"Le code \\\"BLA43????\\\" ne doit être constitué que de lettres majuscules (de A à Z), de chiffres (de 0 à 9) et de tirets (-).\",             \"champ\": \"formation.code\",             \"messageDetails\": {                 \"arguments\": {}             }         }     ] } ```  Avec:  * correlationId: Identifiant de corrélation * timestamp: Timestamp auquel est survenu l'erreur * version: version de l'application * path: URI du module COF sur laquelle est survenue l'erreur. * statusCode: code statut HTTP * errors: Une liste d'erreur (taille minimum = 1) avec: ** code: code de l'erreur ** message: message de l'erreur ** champ: propriété de la ressource sur lequel se rapporte l'erreur (vide dans le cas où il s'agit d'une erreur    globale à la ressource ou sur plusieurs champs et non spécifique à un seul champs) ** messageDetails.arguments: contient des détails sur l'erreur  ## Contenu de l'erreur technique  Lorsqu'une erreur est générée, le corps HTTP de la réponse contient:  ``` {     \"timestamp\": \"2020-06-08T11:15:42.831+0000\",     \"status\": 500,     \"error\": \"Internal Server Error\",     \"message\": \"Un message d'erreur intelligible\",     \"path\": \"/api/cof/v2-draft/etablissements/ETAB00/objets-maquette/candidats\" } ```  Avec:  * timestamp: Timestamp auquel est survenu l'erreur * status: Code statut HTTP * error: Libellé correspondant au code Statut (exemple: Internal Server Error) * message: Message d'erreur. * path: URI du module COF sur laquelle est survenue l'erreur. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.esupportail.referentiel.pcscol.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

import org.esupportail.referentiel.pcscol.invoker.ApiClient;
import org.esupportail.referentiel.pcscol.invoker.ApiException;
import org.esupportail.referentiel.pcscol.invoker.ApiResponse;
import org.esupportail.referentiel.pcscol.invoker.Pair;
import org.esupportail.referentiel.pcscol.model.sta.StagesApprenant;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-15T13:35:24.917377+01:00[Europe/Paris]")
public class StagesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public StagesApi() {
    this(new ApiClient());
  }

  public StagesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Liste des stages par inscriptions
   * 
   * @param codeStructure Le code de l&#39;établissement (required)
   * @param codeApprenant code Apprenant (required)
   * @return StagesApprenant
   * @throws ApiException if fails to make API call
   */
  public StagesApprenant listerInscriptionsAvecStages(String codeStructure, String codeApprenant) throws ApiException {
    ApiResponse<StagesApprenant> localVarResponse = listerInscriptionsAvecStagesWithHttpInfo(codeStructure, codeApprenant);
    return localVarResponse.getData();
  }

  /**
   * Liste des stages par inscriptions
   * 
   * @param codeStructure Le code de l&#39;établissement (required)
   * @param codeApprenant code Apprenant (required)
   * @return ApiResponse&lt;StagesApprenant&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StagesApprenant> listerInscriptionsAvecStagesWithHttpInfo(String codeStructure, String codeApprenant) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listerInscriptionsAvecStagesRequestBuilder(codeStructure, codeApprenant);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listerInscriptionsAvecStages", localVarResponse);
        }
        return new ApiResponse<StagesApprenant>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<StagesApprenant>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listerInscriptionsAvecStagesRequestBuilder(String codeStructure, String codeApprenant) throws ApiException {
    // verify the required parameter 'codeStructure' is set
    if (codeStructure == null) {
      throw new ApiException(400, "Missing the required parameter 'codeStructure' when calling listerInscriptionsAvecStages");
    }
    // verify the required parameter 'codeApprenant' is set
    if (codeApprenant == null) {
      throw new ApiException(400, "Missing the required parameter 'codeApprenant' when calling listerInscriptionsAvecStages");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/structure/{codeStructure}/stages"
        .replace("{codeStructure}", ApiClient.urlEncode(codeStructure.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("codeApprenant", codeApprenant));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
