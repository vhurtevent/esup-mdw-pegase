/*
 * API CHC v4
 * Liste l'ensemble des services et des opérations disponibles dans le module choix des cursus v4
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.chc;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import fr.univlorraine.pegase.model.chc.Formation;
import fr.univlorraine.pegase.model.chc.Groupement;
import fr.univlorraine.pegase.model.chc.ObjetFormation;
import fr.univlorraine.pegase.model.chc.Periode;
import fr.univlorraine.pegase.model.chc.RegimeInscription;
import fr.univlorraine.pegase.model.chc.TypeAmenagement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjetMaquetteExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T17:44:47.769+01:00[Europe/Paris]")
public class ObjetMaquetteExtension {
  public static final String SERIALIZED_NAME_CAPACITE_ACCUEIL = "capaciteAccueil";
  @SerializedName(SERIALIZED_NAME_CAPACITE_ACCUEIL)
  private Integer capaciteAccueil;

  public static final String SERIALIZED_NAME_CARACTERE_OBLIGATOIRE = "caractereObligatoire";
  @SerializedName(SERIALIZED_NAME_CARACTERE_OBLIGATOIRE)
  private Boolean caractereObligatoire;

  public static final String SERIALIZED_NAME_CODE_CATEGORIE = "codeCategorie";
  @SerializedName(SERIALIZED_NAME_CODE_CATEGORIE)
  private String codeCategorie;

  public static final String SERIALIZED_NAME_CODE_CHEMIN = "codeChemin";
  @SerializedName(SERIALIZED_NAME_CODE_CHEMIN)
  private String codeChemin;

  public static final String SERIALIZED_NAME_CODE_PERIODE = "codePeriode";
  @SerializedName(SERIALIZED_NAME_CODE_PERIODE)
  private String codePeriode;

  public static final String SERIALIZED_NAME_CODE_STRUCTURE = "codeStructure";
  @SerializedName(SERIALIZED_NAME_CODE_STRUCTURE)
  private String codeStructure;

  public static final String SERIALIZED_NAME_CODE_TYPE = "codeType";
  @SerializedName(SERIALIZED_NAME_CODE_TYPE)
  private String codeType;

  public static final String SERIALIZED_NAME_FORMATION = "formation";
  @SerializedName(SERIALIZED_NAME_FORMATION)
  private Formation formation;

  public static final String SERIALIZED_NAME_GROUPEMENT = "groupement";
  @SerializedName(SERIALIZED_NAME_GROUPEMENT)
  private Groupement groupement;

  public static final String SERIALIZED_NAME_OBJET_FORMATION = "objetFormation";
  @SerializedName(SERIALIZED_NAME_OBJET_FORMATION)
  private ObjetFormation objetFormation;

  public static final String SERIALIZED_NAME_OUVERTE_CHOIX_CURSUS = "ouverteChoixCursus";
  @SerializedName(SERIALIZED_NAME_OUVERTE_CHOIX_CURSUS)
  private Boolean ouverteChoixCursus;

  public static final String SERIALIZED_NAME_PERIODE = "periode";
  @SerializedName(SERIALIZED_NAME_PERIODE)
  private Periode periode;

  public static final String SERIALIZED_NAME_REGIME_INSCRIPTION_LST = "regimeInscriptionLst";
  @SerializedName(SERIALIZED_NAME_REGIME_INSCRIPTION_LST)
  private List<RegimeInscription> regimeInscriptionLst = null;

  public static final String SERIALIZED_NAME_TEMOIN_ACQUIS = "temoinAcquis";
  @SerializedName(SERIALIZED_NAME_TEMOIN_ACQUIS)
  private Boolean temoinAcquis;

  public static final String SERIALIZED_NAME_TEMOIN_AFFECTE = "temoinAffecte";
  @SerializedName(SERIALIZED_NAME_TEMOIN_AFFECTE)
  private Boolean temoinAffecte;

  public static final String SERIALIZED_NAME_TEMOIN_I_A_VALIDE = "temoinIAValide";
  @SerializedName(SERIALIZED_NAME_TEMOIN_I_A_VALIDE)
  private Boolean temoinIAValide;

  public static final String SERIALIZED_NAME_TYPE_AMENAGEMENT_LST = "typeAmenagementLst";
  @SerializedName(SERIALIZED_NAME_TYPE_AMENAGEMENT_LST)
  private List<TypeAmenagement> typeAmenagementLst = null;

  public static final String SERIALIZED_NAME_VERSION_MAQUETTE = "versionMaquette";
  @SerializedName(SERIALIZED_NAME_VERSION_MAQUETTE)
  private Integer versionMaquette;


  public ObjetMaquetteExtension capaciteAccueil(Integer capaciteAccueil) {
    
    this.capaciteAccueil = capaciteAccueil;
    return this;
  }

   /**
   * La capacite accueil
   * @return capaciteAccueil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La capacite accueil")

  public Integer getCapaciteAccueil() {
    return capaciteAccueil;
  }


  public void setCapaciteAccueil(Integer capaciteAccueil) {
    this.capaciteAccueil = capaciteAccueil;
  }


  public ObjetMaquetteExtension caractereObligatoire(Boolean caractereObligatoire) {
    
    this.caractereObligatoire = caractereObligatoire;
    return this;
  }

   /**
   * Est ce que l&#39;objet maquette est obligatoire au choix de cursus?
   * @return caractereObligatoire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Est ce que l'objet maquette est obligatoire au choix de cursus?")

  public Boolean getCaractereObligatoire() {
    return caractereObligatoire;
  }


  public void setCaractereObligatoire(Boolean caractereObligatoire) {
    this.caractereObligatoire = caractereObligatoire;
  }


  public ObjetMaquetteExtension codeCategorie(String codeCategorie) {
    
    this.codeCategorie = codeCategorie;
    return this;
  }

   /**
   * Le code de la catégorie
   * @return codeCategorie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de la catégorie")

  public String getCodeCategorie() {
    return codeCategorie;
  }


  public void setCodeCategorie(String codeCategorie) {
    this.codeCategorie = codeCategorie;
  }


  public ObjetMaquetteExtension codeChemin(String codeChemin) {
    
    this.codeChemin = codeChemin;
    return this;
  }

   /**
   * Le code chemin de l&#39;objet maquette - identifiant unique
   * @return codeChemin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code chemin de l'objet maquette - identifiant unique")

  public String getCodeChemin() {
    return codeChemin;
  }


  public void setCodeChemin(String codeChemin) {
    this.codeChemin = codeChemin;
  }


  public ObjetMaquetteExtension codePeriode(String codePeriode) {
    
    this.codePeriode = codePeriode;
    return this;
  }

   /**
   * Le code de la période  - identifiant unique
   * @return codePeriode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de la période  - identifiant unique")

  public String getCodePeriode() {
    return codePeriode;
  }


  public void setCodePeriode(String codePeriode) {
    this.codePeriode = codePeriode;
  }


  public ObjetMaquetteExtension codeStructure(String codeStructure) {
    
    this.codeStructure = codeStructure;
    return this;
  }

   /**
   * Le code structure  - identifiant unique
   * @return codeStructure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code structure  - identifiant unique")

  public String getCodeStructure() {
    return codeStructure;
  }


  public void setCodeStructure(String codeStructure) {
    this.codeStructure = codeStructure;
  }


  public ObjetMaquetteExtension codeType(String codeType) {
    
    this.codeType = codeType;
    return this;
  }

   /**
   * Le code type  - identifiant unique
   * @return codeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code type  - identifiant unique")

  public String getCodeType() {
    return codeType;
  }


  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }


  public ObjetMaquetteExtension formation(Formation formation) {
    
    this.formation = formation;
    return this;
  }

   /**
   * Get formation
   * @return formation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Formation getFormation() {
    return formation;
  }


  public void setFormation(Formation formation) {
    this.formation = formation;
  }


  public ObjetMaquetteExtension groupement(Groupement groupement) {
    
    this.groupement = groupement;
    return this;
  }

   /**
   * Get groupement
   * @return groupement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Groupement getGroupement() {
    return groupement;
  }


  public void setGroupement(Groupement groupement) {
    this.groupement = groupement;
  }


  public ObjetMaquetteExtension objetFormation(ObjetFormation objetFormation) {
    
    this.objetFormation = objetFormation;
    return this;
  }

   /**
   * Get objetFormation
   * @return objetFormation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjetFormation getObjetFormation() {
    return objetFormation;
  }


  public void setObjetFormation(ObjetFormation objetFormation) {
    this.objetFormation = objetFormation;
  }


  public ObjetMaquetteExtension ouverteChoixCursus(Boolean ouverteChoixCursus) {
    
    this.ouverteChoixCursus = ouverteChoixCursus;
    return this;
  }

   /**
   * Est ce que l&#39;objet maquette est ouverte au choix de cursus?
   * @return ouverteChoixCursus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Est ce que l'objet maquette est ouverte au choix de cursus?")

  public Boolean getOuverteChoixCursus() {
    return ouverteChoixCursus;
  }


  public void setOuverteChoixCursus(Boolean ouverteChoixCursus) {
    this.ouverteChoixCursus = ouverteChoixCursus;
  }


  public ObjetMaquetteExtension periode(Periode periode) {
    
    this.periode = periode;
    return this;
  }

   /**
   * Get periode
   * @return periode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Periode getPeriode() {
    return periode;
  }


  public void setPeriode(Periode periode) {
    this.periode = periode;
  }


  public ObjetMaquetteExtension regimeInscriptionLst(List<RegimeInscription> regimeInscriptionLst) {
    
    this.regimeInscriptionLst = regimeInscriptionLst;
    return this;
  }

  public ObjetMaquetteExtension addRegimeInscriptionLstItem(RegimeInscription regimeInscriptionLstItem) {
    if (this.regimeInscriptionLst == null) {
      this.regimeInscriptionLst = new ArrayList<>();
    }
    this.regimeInscriptionLst.add(regimeInscriptionLstItem);
    return this;
  }

   /**
   * Get regimeInscriptionLst
   * @return regimeInscriptionLst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RegimeInscription> getRegimeInscriptionLst() {
    return regimeInscriptionLst;
  }


  public void setRegimeInscriptionLst(List<RegimeInscription> regimeInscriptionLst) {
    this.regimeInscriptionLst = regimeInscriptionLst;
  }


  public ObjetMaquetteExtension temoinAcquis(Boolean temoinAcquis) {
    
    this.temoinAcquis = temoinAcquis;
    return this;
  }

   /**
   * Témoin indiquant si l&#39;étudiant a validé son CHC sur l&#39;objet maquette
   * @return temoinAcquis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Témoin indiquant si l'étudiant a validé son CHC sur l'objet maquette")

  public Boolean getTemoinAcquis() {
    return temoinAcquis;
  }


  public void setTemoinAcquis(Boolean temoinAcquis) {
    this.temoinAcquis = temoinAcquis;
  }


  public ObjetMaquetteExtension temoinAffecte(Boolean temoinAffecte) {
    
    this.temoinAffecte = temoinAffecte;
    return this;
  }

   /**
   * Témoin indiquant si l&#39;étudiant a une affectation CHC sur l&#39;objet maquette
   * @return temoinAffecte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Témoin indiquant si l'étudiant a une affectation CHC sur l'objet maquette")

  public Boolean getTemoinAffecte() {
    return temoinAffecte;
  }


  public void setTemoinAffecte(Boolean temoinAffecte) {
    this.temoinAffecte = temoinAffecte;
  }


  public ObjetMaquetteExtension temoinIAValide(Boolean temoinIAValide) {
    
    this.temoinIAValide = temoinIAValide;
    return this;
  }

   /**
   * Témoin indiquant si l&#39;étudiant a un IA valide sur l&#39;objet maquette
   * @return temoinIAValide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Témoin indiquant si l'étudiant a un IA valide sur l'objet maquette")

  public Boolean getTemoinIAValide() {
    return temoinIAValide;
  }


  public void setTemoinIAValide(Boolean temoinIAValide) {
    this.temoinIAValide = temoinIAValide;
  }


  public ObjetMaquetteExtension typeAmenagementLst(List<TypeAmenagement> typeAmenagementLst) {
    
    this.typeAmenagementLst = typeAmenagementLst;
    return this;
  }

  public ObjetMaquetteExtension addTypeAmenagementLstItem(TypeAmenagement typeAmenagementLstItem) {
    if (this.typeAmenagementLst == null) {
      this.typeAmenagementLst = new ArrayList<>();
    }
    this.typeAmenagementLst.add(typeAmenagementLstItem);
    return this;
  }

   /**
   * les types amenagements choisis pour un objet maquette
   * @return typeAmenagementLst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "les types amenagements choisis pour un objet maquette")

  public List<TypeAmenagement> getTypeAmenagementLst() {
    return typeAmenagementLst;
  }


  public void setTypeAmenagementLst(List<TypeAmenagement> typeAmenagementLst) {
    this.typeAmenagementLst = typeAmenagementLst;
  }


  public ObjetMaquetteExtension versionMaquette(Integer versionMaquette) {
    
    this.versionMaquette = versionMaquette;
    return this;
  }

   /**
   * La version de maquette
   * @return versionMaquette
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La version de maquette")

  public Integer getVersionMaquette() {
    return versionMaquette;
  }


  public void setVersionMaquette(Integer versionMaquette) {
    this.versionMaquette = versionMaquette;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjetMaquetteExtension objetMaquetteExtension = (ObjetMaquetteExtension) o;
    return Objects.equals(this.capaciteAccueil, objetMaquetteExtension.capaciteAccueil) &&
        Objects.equals(this.caractereObligatoire, objetMaquetteExtension.caractereObligatoire) &&
        Objects.equals(this.codeCategorie, objetMaquetteExtension.codeCategorie) &&
        Objects.equals(this.codeChemin, objetMaquetteExtension.codeChemin) &&
        Objects.equals(this.codePeriode, objetMaquetteExtension.codePeriode) &&
        Objects.equals(this.codeStructure, objetMaquetteExtension.codeStructure) &&
        Objects.equals(this.codeType, objetMaquetteExtension.codeType) &&
        Objects.equals(this.formation, objetMaquetteExtension.formation) &&
        Objects.equals(this.groupement, objetMaquetteExtension.groupement) &&
        Objects.equals(this.objetFormation, objetMaquetteExtension.objetFormation) &&
        Objects.equals(this.ouverteChoixCursus, objetMaquetteExtension.ouverteChoixCursus) &&
        Objects.equals(this.periode, objetMaquetteExtension.periode) &&
        Objects.equals(this.regimeInscriptionLst, objetMaquetteExtension.regimeInscriptionLst) &&
        Objects.equals(this.temoinAcquis, objetMaquetteExtension.temoinAcquis) &&
        Objects.equals(this.temoinAffecte, objetMaquetteExtension.temoinAffecte) &&
        Objects.equals(this.temoinIAValide, objetMaquetteExtension.temoinIAValide) &&
        Objects.equals(this.typeAmenagementLst, objetMaquetteExtension.typeAmenagementLst) &&
        Objects.equals(this.versionMaquette, objetMaquetteExtension.versionMaquette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capaciteAccueil, caractereObligatoire, codeCategorie, codeChemin, codePeriode, codeStructure, codeType, formation, groupement, objetFormation, ouverteChoixCursus, periode, regimeInscriptionLst, temoinAcquis, temoinAffecte, temoinIAValide, typeAmenagementLst, versionMaquette);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetMaquetteExtension {\n");
    sb.append("    capaciteAccueil: ").append(toIndentedString(capaciteAccueil)).append("\n");
    sb.append("    caractereObligatoire: ").append(toIndentedString(caractereObligatoire)).append("\n");
    sb.append("    codeCategorie: ").append(toIndentedString(codeCategorie)).append("\n");
    sb.append("    codeChemin: ").append(toIndentedString(codeChemin)).append("\n");
    sb.append("    codePeriode: ").append(toIndentedString(codePeriode)).append("\n");
    sb.append("    codeStructure: ").append(toIndentedString(codeStructure)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    formation: ").append(toIndentedString(formation)).append("\n");
    sb.append("    groupement: ").append(toIndentedString(groupement)).append("\n");
    sb.append("    objetFormation: ").append(toIndentedString(objetFormation)).append("\n");
    sb.append("    ouverteChoixCursus: ").append(toIndentedString(ouverteChoixCursus)).append("\n");
    sb.append("    periode: ").append(toIndentedString(periode)).append("\n");
    sb.append("    regimeInscriptionLst: ").append(toIndentedString(regimeInscriptionLst)).append("\n");
    sb.append("    temoinAcquis: ").append(toIndentedString(temoinAcquis)).append("\n");
    sb.append("    temoinAffecte: ").append(toIndentedString(temoinAffecte)).append("\n");
    sb.append("    temoinIAValide: ").append(toIndentedString(temoinIAValide)).append("\n");
    sb.append("    typeAmenagementLst: ").append(toIndentedString(typeAmenagementLst)).append("\n");
    sb.append("    versionMaquette: ").append(toIndentedString(versionMaquette)).append("\n");
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

