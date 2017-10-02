
package AshesEditor.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Building {

    @SerializedName("Name")
    @Expose
    private String name;

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                ", iconName='" + iconName + '\'' +
                ", iconIndex='" + iconIndex + '\'' +
                ", detailIconIndex='" + detailIconIndex + '\'' +
                ", asset='" + asset + '\'' +
                ", terrainModifier='" + terrainModifier + '\'' +
                ", rigidBody='" + rigidBody + '\'' +
                ", flags='" + flags + '\'' +
                ", uICategory='" + uICategory + '\'' +
                ", maxHP='" + maxHP + '\'' +
                ", healRate='" + healRate + '\'' +
                ", maxShields='" + maxShields + '\'' +
                ", shieldRegenRate='" + shieldRegenRate + '\'' +
                ", sightRadius='" + sightRadius + '\'' +
                ", radarRadius='" + radarRadius + '\'' +
                ", nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis='" + nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis + '\'' +
                ", metalCost='" + metalCost + '\'' +
                ", dataCost='" + dataCost + '\'' +
                ", power='" + power + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", selectSound='" + selectSound + '\'' +
                ", constructSound='" + constructSound + '\'' +
                ", prereqFlag='" + prereqFlag + '\'' +
                ", grantedFlagS='" + grantedFlagS + '\'' +
                ", moduleDefinitionFile='" + moduleDefinitionFile + '\'' +
                ", armor='" + armor + '\'' +
                ", gridSize='" + gridSize + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @SerializedName("Name [1]")
    @Expose
    private String name1;
    @SerializedName("IconName")
    @Expose
    private String iconName;
    @SerializedName("Icon Index")
    @Expose
    private String iconIndex;
    @SerializedName("Detail Icon Index")
    @Expose
    private String detailIconIndex;
    @SerializedName("Asset")
    @Expose
    private String asset;
    @SerializedName("Terrain Modifier")
    @Expose
    private String terrainModifier;
    @SerializedName("Rigid Body")
    @Expose
    private String rigidBody;
    @SerializedName("Flags")
    @Expose
    private String flags;
    @SerializedName("UI Category")
    @Expose
    private String uICategory;
    @SerializedName("MaxHP")
    @Expose
    private String maxHP;
    @SerializedName("HealRate")
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
    @SerializedName("Nominal Attack Radius - this is used to draw the range ring for buildings in preview mode - if you update the weapons on a building it is up to you to update this")
    @Expose
    private String nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis;
    @SerializedName("MetalCost")
    @Expose
    private String metalCost;
    @SerializedName("DataCost")
    @Expose
    private String dataCost;
    @SerializedName("Power")
    @Expose
    private String power;
    @SerializedName("Build Time")
    @Expose
    private String buildTime;
    @SerializedName("Select Sound")
    @Expose
    private String selectSound;
    @SerializedName("Construct Sound")
    @Expose
    private String constructSound;
    @SerializedName("Prereq Flag")
    @Expose
    private String prereqFlag;
    @SerializedName("Granted Flag(s)")
    @Expose
    private String grantedFlagS;
    @SerializedName("ModuleDefinitionFile")
    @Expose
    private String moduleDefinitionFile;
    @SerializedName("Armor")
    @Expose
    private String armor;
    @SerializedName("GridSize")
    @Expose
    private String gridSize;
    @SerializedName("Description")
    @Expose
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
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

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getTerrainModifier() {
        return terrainModifier;
    }

    public void setTerrainModifier(String terrainModifier) {
        this.terrainModifier = terrainModifier;
    }

    public String getRigidBody() {
        return rigidBody;
    }

    public void setRigidBody(String rigidBody) {
        this.rigidBody = rigidBody;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getUICategory() {
        return uICategory;
    }

    public void setUICategory(String uICategory) {
        this.uICategory = uICategory;
    }

    public String getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(String maxHP) {
        this.maxHP = maxHP;
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

    public String getNominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis() {
        return nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis;
    }

    public void setNominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis(String nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis) {
        this.nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis = nominalAttackRadiusThisIsUsedToDrawTheRangeRingForBuildingsInPreviewModeIfYouUpdateTheWeaponsOnABuildingItIsUpToYouToUpdateThis;
    }

    public String getMetalCost() {
        return metalCost;
    }

    public void setMetalCost(String metalCost) {
        this.metalCost = metalCost;
    }

    public String getDataCost() {
        return dataCost;
    }

    public void setDataCost(String dataCost) {
        this.dataCost = dataCost;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getSelectSound() {
        return selectSound;
    }

    public void setSelectSound(String selectSound) {
        this.selectSound = selectSound;
    }

    public String getConstructSound() {
        return constructSound;
    }

    public void setConstructSound(String constructSound) {
        this.constructSound = constructSound;
    }

    public String getPrereqFlag() {
        return prereqFlag;
    }

    public void setPrereqFlag(String prereqFlag) {
        this.prereqFlag = prereqFlag;
    }

    public String getGrantedFlagS() {
        return grantedFlagS;
    }

    public void setGrantedFlagS(String grantedFlagS) {
        this.grantedFlagS = grantedFlagS;
    }

    public String getModuleDefinitionFile() {
        return moduleDefinitionFile;
    }

    public void setModuleDefinitionFile(String moduleDefinitionFile) {
        this.moduleDefinitionFile = moduleDefinitionFile;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getGridSize() {
        return gridSize;
    }

    public void setGridSize(String gridSize) {
        this.gridSize = gridSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}