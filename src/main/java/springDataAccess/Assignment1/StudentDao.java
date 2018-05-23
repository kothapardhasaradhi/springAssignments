package springDataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springDataAccess.modal.Address;
import springDataAccess.modal.Student;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public List<Student> getAllDetails(){
		
		String query = "select * from students";
		List<Student> studentList = jdbcTemplate.query(query, new RowMapper<Student>(){

			@Override
			public Student mapRow(ResultSet rs, int rownumber) throws SQLException {
				Student student = new Student();
				student.setStudentId(rs.getString("STUDENT_ID"));
				student.setStudentName(rs.getString("SYUDENT_NAME"));
					
					int id= rs.getInt("ADDRESS_ID");
					String query = "select * from address where ADDRESS_ID = ?";
					Address address = jdbcTemplate.queryForObject(query,new Object[]{id} ,new RowMapper<Address>(){
	
						@Override
						public Address mapRow(ResultSet rs2, int arg1) throws SQLException {
							Address address = new Address();
							address.setCity(rs2.getString("CITY"));
							address.setState(rs2.getString("STATE"));
							address.setId(rs2.getInt("ADDRESS_ID"));
							return address;
						}
					});
				
				student.setAddress(address);
				return student;
			}  });
	
		
		return studentList;
		
	}

	public Student getDetails(String studentId) {
		String query = "select * from students where STUDENT_ID=?";
		return jdbcTemplate.queryForObject(query,new Object[]{studentId},new RowMapper<Student>(){

			@Override
			public Student mapRow(ResultSet rs, int arg1) throws SQLException {
				Student student = new Student();
				student.setStudentId(rs.getString("STUDENT_ID"));
				student.setStudentName(rs.getString("SYUDENT_NAME"));
					
					int id= rs.getInt("ADDRESS_ID");
					String query = "select * from address where ADDRESS_ID=?";
					Address address = jdbcTemplate.queryForObject(query,new Object[]{id} ,new RowMapper<Address>(){
	
						@Override
						public Address mapRow(ResultSet rs2, int arg1) throws SQLException {
							Address address = new Address();
							address.setCity(rs2.getString("CITY"));
							address.setState(rs2.getString("STATE"));
							address.setId(rs2.getInt("ADDRESS_ID"));
							return address;
						}
					});
				
				student.setAddress(address);
				return student;
			}
		});
	}
}
