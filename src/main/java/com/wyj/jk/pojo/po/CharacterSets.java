package com.wyj.jk.pojo.po;

public class CharacterSets {
    private String characterSetName;

    private String defaultCollateName;

    private String description;

    private Long maxlen;

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMaxlen() {
        return maxlen;
    }

    public void setMaxlen(Long maxlen) {
        this.maxlen = maxlen;
    }
}