package com.sit.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public static Stirng DELETE_EMP_ID="delete from students_dtls where ";

	private JdbcTemplate jt=null;
	
	public StudentDao(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	public int insertStudent(int sid,String  sname,String semail, int sage ) {
		int update = jt.update("insert into students_dtls values( ?,?,?,?)"
				,sid,sname,semail,sage);
		
		System.out.print("================}"+update);
		
		return 0;
	}
	
	
}
