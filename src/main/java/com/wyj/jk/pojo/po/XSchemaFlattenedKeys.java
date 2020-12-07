package com.wyj.jk.pojo.po;

public class XSchemaFlattenedKeys {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long nonUnique;

    private Long subpartExists;

    private String indexColumns;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Long getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(Long nonUnique) {
        this.nonUnique = nonUnique;
    }

    public Long getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(Long subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getIndexColumns() {
        return indexColumns;
    }

    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns;
    }
}