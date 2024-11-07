package cz.ivosahlik.jobportal.repository;

import cz.ivosahlik.jobportal.entity.JobPostActivity;
import cz.ivosahlik.jobportal.entity.JobSeekerProfile;
import cz.ivosahlik.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
