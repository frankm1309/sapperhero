package nl.sapperheroes.model.user;


import nl.sapperheroes.model.jobs.Job;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client extends User {


    @OneToOne (cascade = {CascadeType.ALL})
    private Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

