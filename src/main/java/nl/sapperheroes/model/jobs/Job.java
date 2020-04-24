package nl.sapperheroes.model.jobs;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorColumn(name = "job_type") //Maybe
public class Job {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING) //MAYBE
    private JobType type;
    private String description;
    private boolean completed;
    private Date jobTimeAndDate;

    public Job(){};

    public Job(JobType type) {
        id++;
        this.type = type;
    }

    public Date getJobTimeAndDate() {
        return jobTimeAndDate;
    }

    public void setJobTimeAndDate(Date jobTimeAndDate) {
        this.jobTimeAndDate = jobTimeAndDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JobType getType() {
        return type;
    }

    public void setType(JobType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
