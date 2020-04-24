package nl.sapperheroes.controller;

import nl.sapperheroes.model.jobs.Job;
import nl.sapperheroes.model.user.Client;
import nl.sapperheroes.model.user.User;
import nl.sapperheroes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import nl.sapperheroes.service.JobService;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    private JobService jobService;
    private UserService userService;

    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{custId}")
    public ResponseEntity<Job> createJob(@RequestBody Job job, @PathVariable Integer custId) {
        User user = userService.getUser(custId);
        Client client = (Client)user;
        client.setJob(job);
        userService.saveOrUpdateUser(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{jobId}/hero/{heroId}")
    public ResponseEntity<Job> assignJob(@PathVariable Integer jobId, @PathVariable Integer heroId) {
        Job job = jobService.getJob(jobId);
        userService.addJobtoHeroJobList(job, heroId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public ResponseEntity<List<Job>> getJobList() {
        List<Job> jobs = jobService.getJobList();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }
}
