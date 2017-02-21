package model;

public class Link {
    private Integer idLink;
    private String source;
    private String target;
    private String foreignKey;

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
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

    /**
     * @return the idLink
     */
    public Integer getIdLink() {
        return idLink;
    }

    /**
     * @param idLink the idLink to set
     */
    public void setIdLink(Integer idLink) {
        this.idLink = idLink;
    }
    
    
}
