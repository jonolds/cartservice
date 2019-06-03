package edu.uark.dataaccess.repository.helpers.join;

public enum SQLJoinType {
	NONE(""), INNER("INNER"), LEFT("LEFT");

	public String getLabel( ) {
		return label;
	}

	private final String label;

	SQLJoinType(String label) {
		this.label = label;
	}
}
