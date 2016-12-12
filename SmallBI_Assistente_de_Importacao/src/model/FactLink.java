package model;

public class FactLink {
    
    private String dimension;
    private String foreignKey;

    /**
     * @return the dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the foreignKey
     */
    public String getForeignKey() {
        return foreignKey;
    }

    /**
     * @param foreignKey the foreignKey to set
     */
    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey;
    }
    
}
