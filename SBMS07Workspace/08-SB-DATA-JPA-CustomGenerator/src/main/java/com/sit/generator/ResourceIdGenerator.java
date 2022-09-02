package com.sit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ResourceIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix="SIT";
		String suffix="";
		Connection connection = session.connection();
		try {
			Statement createStatement = connection.createStatement();
			String sql="select  RESOURCE_ID_SEQ.nextval from dual";
			ResultSet resultSet = createStatement.executeQuery(sql);
			if(resultSet.next()) {
				int seqval = resultSet.getInt(1);
				suffix=  String.valueOf(seqval);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prefix+suffix;
	}

}
