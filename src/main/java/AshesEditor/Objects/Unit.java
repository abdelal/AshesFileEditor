
package AshesEditor.Objects;

import AshesEditor.utils.Parser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Unit implements HasName {

    @Override
    public String toString() {
        return "Unit{" +
                "internalID='" + internalID + '\'' +
                ", name='" + name + '\'' +
                ", iconIndex='" + iconIndex + '\'' +
                ", detailIconIndex='" + detailIconIndex + '\'' +
                ", armyIconIndex='" + armyIconIndex + '\'' +
                ", assetID='" + assetID + '\'' +
                ", flockerTemplate='" + flockerTemplate + '\'' +
                ", formationTemplate='" + formationTemplate + '\'' +
                ", defaultChildFormationTemplate='" + defaultChildFormationTemplate + '\'' +
                ", childFormationXOffset='" + childFormationXOffset + '\'' +
                ", childFormationYOffset='" + childFormationYOffset + '\'' +
                ", promotedUnitWhenPromotedWhichUnitsFormationDataToUse='" + promotedUnitWhenPromotedWhichUnitsFormationDataToUse + '\'' +
                ", spawnCount='" + spawnCount + '\'' +
                ", maxChildrenDoNotSetThisHigherThan128='" + maxChildrenDoNotSetThisHigherThan128 + '\'' +
                ", tieBreakerForTierPromotions='" + tieBreakerForTierPromotions + '\'' +
                ", flags='" + flags + '\'' +
                ", prereqBuilding='" + prereqBuilding + '\'' +
                ", prereqFactoryAddOn='" + prereqFactoryAddOn + '\'' +
                ", canCapture='" + canCapture + '\'' +
                ", maxHPs='" + maxHPs + '\'' +
                ", maxEnergy='" + maxEnergy + '\'' +
                ", energyPerSecond='" + energyPerSecond + '\'' +
                ", armor='" + armor + '\'' +
                ", healRate='" + healRate + '\'' +
                ", maxShields='" + maxShields + '\'' +
                ", shieldRegenRate='" + shieldRegenRate + '\'' +
                ", sightRadius='" + sightRadius + '\'' +
                ", radarRadius='" + radarRadius + '\'' +
                ", costMetal='" + costMetal + '\'' +
                ", costData='" + costData + '\'' +
                ", costQuanta='" + costQuanta + '\'' +
                ", costEnergy='" + costEnergy + '\'' +
                ", costLogistics='" + costLogistics + '\'' +
                ", constructionTime='" + constructionTime + '\'' +
                ", selectUIAudioGroupID='" + selectUIAudioGroupID + '\'' +
                ", constructUIAudioGroupID='" + constructUIAudioGroupID + '\'' +
                ", moveOrderUIAudioGroupID='" + moveOrderUIAudioGroupID + '\'' +
                ", attackOrderUIAudioGroupID='" + attackOrderUIAudioGroupID + '\'' +
                ", moduleDefinitionFile='" + moduleDefinitionFile + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @SerializedName("Internal ID")
    @Expose
    private String internalID;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Icon Index")
    @Expose
    private String iconIndex;
    @SerializedName("Detail Icon Index")
    @Expose
    private String detailIconIndex;
    @SerializedName("Army Icon Index")
    @Expose
    private String armyIconIndex;
    @SerializedName("AssetID")
    @Expose
    private String assetID;
    @SerializedName("FlockerTemplate")
    @Expose
    private String flockerTemplate;
    @SerializedName("Formation Template")
    @Expose
    private String formationTemplate;
    @SerializedName("Default Child Formation Template")
    @Expose
    private String defaultChildFormationTemplate;
    @SerializedName("Child Formation X Offset")
    @Expose
    private String childFormationXOffset;
    @SerializedName("Child Formation Y Offset")
    @Expose
    private String childFormationYOffset;
    @SerializedName("Promoted Unit (when promoted - which units formation data to use)")
    @Expose
    private String promotedUnitWhenPromotedWhichUnitsFormationDataToUse;
    @SerializedName("Spawn Count")
    @Expose
    private String spawnCount;
    @SerializedName("Max Children (do not set this higher than 128!!!)")
    @Expose
    private String maxChildrenDoNotSetThisHigherThan128;
    @SerializedName("Tie Breaker for Tier Promotions")
    @Expose
    private String tieBreakerForTierPromotions;
    @SerializedName("Flags")
    @Expose
    private String flags;
    @SerializedName("Prereq Building")
    @Expose
    private String prereqBuilding;
    @SerializedName("Prereq Factory Add-On")
    @Expose
    private String prereqFactoryAddOn;
    @SerializedName("Can Capture")
    @Expose
    private String canCapture;
    @SerializedName("Max HPs")
    @Expose
    private String maxHPs;
    @SerializedName("Max Energy")
    @Expose
    private String maxEnergy;
    @SerializedName("Energy Per Second")
    @Expose
    private String energyPerSecond;
    @SerializedName("Armor")
    @Expose
    private String armor;
    @SerializedName("Heal Rate")
    @Expose
    private String healRate;
    @SerializedName("Max Shields")
    @Expose
    private String maxShields;
    @SerializedName("Shield Regen Rate")
    @Expose
    private String shieldRegenRate;
    @SerializedName("Sight Radius")
    @Expose
    private String sightRadius;
    @SerializedName("Radar Radius")
    @Expose
    private String radarRadius;
    @SerializedName("Cost Metal")
    @Expose
    private String costMetal;
    @SerializedName("Cost Data")
    @Expose
    private String costData;
    @SerializedName("Cost Quanta")
    @Expose
    private String costQuanta;
    @SerializedName("Cost Energy")
    @Expose
    private String costEnergy;
    @SerializedName("Cost Logistics")
    @Expose
    private String costLogistics;
    @SerializedName("Construction Time")
    @Expose
    private String constructionTime;
    @SerializedName("Select UI.AudioGroup ID")
    @Expose
    private String selectUIAudioGroupID;
    @SerializedName("Construct UI.AudioGroupID")
    @Expose
    private String constructUIAudioGroupID;
    @SerializedName("Move Order UI.AudioGroup ID")
    @Expose
    private String moveOrderUIAudioGroupID;
    @SerializedName("Attack Order UI.AudioGroup ID")
    @Expose
    private String attackOrderUIAudioGroupID;
    @SerializedName("Module Definition File")
    @Expose
    private String moduleDefinitionFile;
    @SerializedName("Description")
    @Expose
    private String description;

    private StringProperty namePR=new SimpleStringProperty();

    public Unit() {


    //namePR.bind(name);
}
    Parser parser= Parser.getInstance();

    public String getInternalID() {
        return internalID;
    }

    public void setInternalID(String internalID) {
        this.internalID = internalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        namePR.setValue(name);
    }

    public String getIconIndex() {
        return iconIndex;
    }

    public void setIconIndex(String iconIndex) {
        this.iconIndex = iconIndex;
    }

    public String getDetailIconIndex() {
        return detailIconIndex;
    }

    public void setDetailIconIndex(String detailIconIndex) {
        this.detailIconIndex = detailIconIndex;
    }

    public String getArmyIconIndex() {
        return armyIconIndex;
    }

    public void setArmyIconIndex(String armyIconIndex) {
        this.armyIconIndex = armyIconIndex;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getFlockerTemplate() {
        return flockerTemplate;
    }

    public void setFlockerTemplate(String flockerTemplate) {
        this.flockerTemplate = flockerTemplate;
    }

    public String getFormationTemplate() {
        return formationTemplate;
    }

    public void setFormationTemplate(String formationTemplate) {
        this.formationTemplate = formationTemplate;
    }

    public String getDefaultChildFormationTemplate() {
        return defaultChildFormationTemplate;
    }

    public void setDefaultChildFormationTemplate(String defaultChildFormationTemplate) {
        this.defaultChildFormationTemplate = defaultChildFormationTemplate;
    }

    public String getChildFormationXOffset() {
        return childFormationXOffset;
    }

    public void setChildFormationXOffset(String childFormationXOffset) {
        this.childFormationXOffset = childFormationXOffset;
    }

    public String getChildFormationYOffset() {
        return childFormationYOffset;
    }

    public void setChildFormationYOffset(String childFormationYOffset) {
        this.childFormationYOffset = childFormationYOffset;
    }

    public String getPromotedUnitWhenPromotedWhichUnitsFormationDataToUse() {
        return promotedUnitWhenPromotedWhichUnitsFormationDataToUse;
    }

    public void setPromotedUnitWhenPromotedWhichUnitsFormationDataToUse(String promotedUnitWhenPromotedWhichUnitsFormationDataToUse) {
        this.promotedUnitWhenPromotedWhichUnitsFormationDataToUse = promotedUnitWhenPromotedWhichUnitsFormationDataToUse;
    }

    public String getSpawnCount() {
        return spawnCount;
    }

    public void setSpawnCount(String spawnCount) {
        this.spawnCount = spawnCount;
    }

    public String getMaxChildrenDoNotSetThisHigherThan128() {
        return maxChildrenDoNotSetThisHigherThan128;
    }

    public void setMaxChildrenDoNotSetThisHigherThan128(String maxChildrenDoNotSetThisHigherThan128) {
        this.maxChildrenDoNotSetThisHigherThan128 = maxChildrenDoNotSetThisHigherThan128;
    }

    public String getTieBreakerForTierPromotions() {
        return tieBreakerForTierPromotions;
    }

    public void setTieBreakerForTierPromotions(String tieBreakerForTierPromotions) {
        this.tieBreakerForTierPromotions = tieBreakerForTierPromotions;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getPrereqBuilding() {
        return prereqBuilding;
    }

    public void setPrereqBuilding(String prereqBuilding) {
        this.prereqBuilding = prereqBuilding;
    }

    public String getPrereqFactoryAddOn() {
        return prereqFactoryAddOn;
    }

    public void setPrereqFactoryAddOn(String prereqFactoryAddOn) {
        this.prereqFactoryAddOn = prereqFactoryAddOn;
    }

    public String getCanCapture() {
        return canCapture;
    }

    public void setCanCapture(String canCapture) {
        this.canCapture = canCapture;
    }

    public String getMaxHPs() {
        return maxHPs;
    }

    public void setMaxHPs(String maxHPs) {
        this.maxHPs = maxHPs;
    }

    public String getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(String maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public String getEnergyPerSecond() {
        return energyPerSecond;
    }

    public void setEnergyPerSecond(String energyPerSecond) {
        this.energyPerSecond = energyPerSecond;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getHealRate() {
        return healRate;
    }

    public void setHealRate(String healRate) {
        this.healRate = healRate;
    }

    public String getMaxShields() {
        return maxShields;
    }

    public void setMaxShields(String maxShields) {
        this.maxShields = maxShields;
    }

    public String getShieldRegenRate() {
        return shieldRegenRate;
    }

    public void setShieldRegenRate(String shieldRegenRate) {
        this.shieldRegenRate = shieldRegenRate;
    }

    public String getSightRadius() {
        return sightRadius;
    }

    public void setSightRadius(String sightRadius) {
        this.sightRadius = sightRadius;
    }

    public String getRadarRadius() {
        return radarRadius;
    }

    public void setRadarRadius(String radarRadius) {
        this.radarRadius = radarRadius;
    }

    public String getCostMetal() {
        return costMetal;
    }

    public void setCostMetal(String costMetal) {
        this.costMetal = costMetal;
    }

    public String getCostData() {
        return costData;
    }

    public void setCostData(String costData) {
        this.costData = costData;
    }

    public String getCostQuanta() {
        return costQuanta;
    }

    public void setCostQuanta(String costQuanta) {
        this.costQuanta = costQuanta;
    }

    public String getCostEnergy() {
        return costEnergy;
    }

    public void setCostEnergy(String costEnergy) {
        this.costEnergy = costEnergy;
    }

    public String getCostLogistics() {
        return costLogistics;
    }

    public void setCostLogistics(String costLogistics) {
        this.costLogistics = costLogistics;
    }

    public String getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(String constructionTime) {
        this.constructionTime = constructionTime;
    }

    public String getSelectUIAudioGroupID() {
        return selectUIAudioGroupID;
    }

    public void setSelectUIAudioGroupID(String selectUIAudioGroupID) {
        this.selectUIAudioGroupID = selectUIAudioGroupID;
    }

    public String getConstructUIAudioGroupID() {
        return constructUIAudioGroupID;
    }

    public void setConstructUIAudioGroupID(String constructUIAudioGroupID) {
        this.constructUIAudioGroupID = constructUIAudioGroupID;
    }

    public String getMoveOrderUIAudioGroupID() {
        return moveOrderUIAudioGroupID;
    }

    public void setMoveOrderUIAudioGroupID(String moveOrderUIAudioGroupID) {
        this.moveOrderUIAudioGroupID = moveOrderUIAudioGroupID;
    }

    public String getAttackOrderUIAudioGroupID() {
        return attackOrderUIAudioGroupID;
    }

    public void setAttackOrderUIAudioGroupID(String attackOrderUIAudioGroupID) {
        this.attackOrderUIAudioGroupID = attackOrderUIAudioGroupID;
    }

    public String getModuleDefinitionFile() {
        return moduleDefinitionFile;
    }

    public void setModuleDefinitionFile(String moduleDefinitionFile) {
        this.moduleDefinitionFile = moduleDefinitionFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String fileLine() {
        return     internalID +
                "," + name +
                "," + iconIndex +
                "," + detailIconIndex +
                "," + armyIconIndex +
                "," + assetID +
                "," + flockerTemplate +
                "," + formationTemplate +
                "," + defaultChildFormationTemplate +
                "," + childFormationXOffset +
                "," + childFormationYOffset +
                "," + promotedUnitWhenPromotedWhichUnitsFormationDataToUse +
                "," + spawnCount +
                "," + maxChildrenDoNotSetThisHigherThan128 +
                "," + tieBreakerForTierPromotions +
                "," + flags +
                "," + prereqBuilding +
                "," + prereqFactoryAddOn +
                "," + canCapture +
                "," + maxHPs +
                "," + maxEnergy +
                "," + energyPerSecond +
                "," + armor +
                "," + healRate +
                "," + maxShields +
                "," + shieldRegenRate +
                "," + sightRadius +
                "," + radarRadius +
                "," + costMetal +
                "," + costData +
                "," + costQuanta +
                "," + costEnergy +
                "," + costLogistics +
                "," + constructionTime +
                "," + selectUIAudioGroupID +
                "," + constructUIAudioGroupID +
                "," + moveOrderUIAudioGroupID +
                "," + attackOrderUIAudioGroupID +
                "," + moduleDefinitionFile +
                "," + description ;
}

    @Override
    public String HasName() {
        return  internalID;
    }


    public void setNamePR(){

        namePR.setValue(name);
    }
/*    public StringProperty getname(){

        return namePR;
    }*/
}
