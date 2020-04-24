package nl.sapperheroes.service;

import nl.sapperheroes.dao.JobDao;
import nl.sapperheroes.dao.UserDao;
import nl.sapperheroes.model.jobs.Job;
import nl.sapperheroes.model.user.Hero;
import nl.sapperheroes.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    //   private MockDatabase mockDatabase;
    private JobDao jobDoa;
    private UserDao userDao;

//    @Autowired
//    public void setMockDatabase(MockDatabase mockDatabase) {
//        this.mockDatabase = mockDatabase;
//    }

    @Autowired
    public void setJobDoa(JobDao jobDoa) {
        this.jobDoa = jobDoa;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //    public void createUser(User user) {
//        mockDatabase.addUserToList(user);
//        //hibernate shit
//    }
    @Transactional
    public void saveOrUpdateUser(User user) {
        userDao.saveOrUpdateUser(user);
    }


    public User getUser(int userId) {
        return userDao.getUser(userId);
    }

//    public List<User> getHeroList() {
//        return userDao.getHeroList();
//    }
//
//    public List<User> getClientList() {
//        return userDao.getClientList();
//    }

    public List<User> getUserList() {
        return userDao.listAllUsers();
    }

    public void addJobtoHeroJobList(Job job, int heroId) {
        User user = userDao.getUser(heroId);
        if (user.getClass().equals(Hero.class)) {
           Hero hero = (Hero) user;
            hero.setJobToList(job);
        }
    }
}