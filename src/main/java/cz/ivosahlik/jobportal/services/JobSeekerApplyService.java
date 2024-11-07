package cz.ivosahlik.jobportal.services;

import cz.ivosahlik.jobportal.entity.JobPostActivity;
import cz.ivosahlik.jobportal.entity.JobSeekerApply;
import cz.ivosahlik.jobportal.entity.JobSeekerProfile;
import cz.ivosahlik.jobportal.repository.JobSeekerApplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobSeekerApplyService {

    private final JobSeekerApplyRepository jobSeekerApplyRepository;

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerApplyRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
        return jobSeekerApplyRepository.findByJob(job);
    }

    public void addNew(JobSeekerApply jobSeekerApply) {
        jobSeekerApplyRepository.save(jobSeekerApply);
    }
}
