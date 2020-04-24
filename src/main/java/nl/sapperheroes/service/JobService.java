package nl.sapperheroes.service;


import nl.sapperheroes.dao.JobDao;
import nl.sapperheroes.model.jobs.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobService {

    //    private MockDatabase mockDatabase;
    private JobDao jobDao; // new

    @Autowired
    public void setJobDao(JobDao jobDao) {
        this.jobDao = jobDao;
    }


    //    public void setMockDatabase(MockDatabase mockDatabase) {
//        this.mockDatabase = mockDatabase;
//    }

//    public Job createJob(Job job, int clientId) {
//        User user = mockDatabase.getUser(clientId);
//        {
//            if (user.getId() == clientId && user.getClass().equals(Client.class)) {
//                Client client = (Client) user;
//                client.setJob(job);
//            }
//            return job;
//        }
//
//    }

    // returns job id after saving
    @Transactional
    public Integer createJob(Job job) {
      return jobDao.saveOrUpdateJob(job).getId();
    }

    //    public Job getJob(int jobId){
//       return mockDatabase.getJob(jobId);
//    }


    public Job getJob(Integer id) {
        return jobDao.findJobById(id);
    }

    public List<Job> getJobList(){
        return jobDao.listAllJobs();

    }

}
