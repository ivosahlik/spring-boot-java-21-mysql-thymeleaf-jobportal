package cz.ivosahlik.jobportal.services;

import cz.ivosahlik.jobportal.entity.JobPostActivity;
import cz.ivosahlik.jobportal.entity.JobSeekerProfile;
import cz.ivosahlik.jobportal.entity.JobSeekerSave;
import cz.ivosahlik.jobportal.repository.JobSeekerSaveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}
