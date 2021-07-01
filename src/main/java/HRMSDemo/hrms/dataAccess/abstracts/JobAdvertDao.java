package HRMSDemo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import HRMSDemo.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer>{
	JobAdvert getByAdName(String adName); 
	JobAdvert getByJobId(int jobId); 

	@Query("From JobAdvert where adName=:adName")
	List<JobAdvert> getByAdName1(String adName);

	List<JobAdvert> findByIsActiveTrueOrderByApplicationDeadline();
	  

	List<JobAdvert> findByIsActiveTrueAndEmployer_Id(int employerId);
		
	List<JobAdvert> findByIsActiveTrue();
}
