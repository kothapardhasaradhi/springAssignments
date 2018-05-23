package springDataAccess.Assignment2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import springDataAccess.modal.Student;

public class StudentDao {

	public List<Student> getAllDetails() {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
	
		Query query = session.createQuery("from Student");
		List<Student> studentsList =query.list();
		
		return studentsList;
	}

	public Student getDetails(String studentId) {
		
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Student where student_id =:id ");
		query.setParameter("id", studentId);
		List<Student> studentsList = query.list();
		//Student student = (Student) session.get(Student.class, studentId);
		return studentsList.get(0);
	}

}
