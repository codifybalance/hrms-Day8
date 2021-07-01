package HRMSDemo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import HRMSDemo.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer>{
	JobAdvert getByAdName(String adName); 
	JobAdvert getByJobId(int jobId); 
	/* JobAdvert getById(int id); */

//	JobAdvert getByJobAdvertNameAndJobPosition_JobPositionId(String adName , String jobPositionId);
	
//	List<JobAdvert> getByJobAdvertAdNameOrJobPosition_JobPositionId(String adName , String jobPositionId);
//	
//	List<JobAdvert> getByJobPositionIn(List<Integer> job_positions);
//
//	List<JobAdvert> getByAdNameContains(String adName);
//	
//	List<JobAdvert> getByJobDescriptionStartsWith(String jobDescription);
//	
//	
//	//JPQLnasılyazılır?
	  @Query("From JobAdvert where adName=:adName")
	  List<JobAdvert> getByAdName1(String adName);

		/* @Query("From JobAdvert where isActive=:isActive") */
	  List<JobAdvert> findByIsActiveTrueOrderByApplicationDeadline();
	  
	  //@Query("From JobAdvert where isActive=:isActive And employer.userId=:user_id")
	  List<JobAdvert> findByIsActiveTrueAndEmployer_Id(int employerId);
//		
	  List<JobAdvert> findByIsActiveTrue();
//
	  //JobAdvert findByIdAndEmployer(int user_id);
	  
	  
	  
//	
//	//select*from products where product_name=bisey and category_Id=bisey 
//	//select*from products where category_id in(1,2,3,4)

	
}
