package nl.sapperheroes.model.user;

import nl.sapperheroes.model.jobs.Job;
import nl.sapperheroes.model.jobs.JobType;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


@Entity
@Table(name="hero")
public class Hero extends User {

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Job> jobs = new LinkedList<>();

    public void setJobToList(Job job) {
        jobs.add(job);
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


    public List<Job> getJobs() {
        return jobs;
    }

    public List<Job> jobsDone() {
        return jobs.stream().filter(Job::isCompleted).collect(Collectors.toList());
    }

    public List<Job> jobsToDo() {
        return jobs.stream().filter(job -> !job.isCompleted()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
