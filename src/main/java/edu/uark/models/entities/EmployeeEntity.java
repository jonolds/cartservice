package edu.uark.models.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import edu.uark.dataaccess.entities.BaseEntity;
import edu.uark.dataaccess.repository.BaseRepositoryInterface;

public class EmployeeEntity extends BaseEntity<EmployeeEntity>{

	protected EmployeeEntity(BaseRepositoryInterface<EmployeeEntity> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) {
		// TODO Auto-generated method stub
		return null;
	}

}
