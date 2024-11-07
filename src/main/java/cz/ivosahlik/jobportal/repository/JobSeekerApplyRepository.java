package cz.ivosahlik.jobportal.repository;

import cz.ivosahlik.jobportal.entity.JobPostActivity;
import cz.ivosahlik.jobportal.entity.JobSeekerApply;
import cz.ivosahlik.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
