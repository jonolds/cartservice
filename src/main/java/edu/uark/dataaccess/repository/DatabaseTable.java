package edu.uark.dataaccess.repository;

public enum DatabaseTable {
	NONE(""),
	PRODUCT("product");

	private final String label;
	DatabaseTable(String label) {
		this.label = label;
	}
	public String getLabel( ) {
		return label;
	}
}