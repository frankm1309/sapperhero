//package nl.sapperheroes.Mock;
//
//import nl.sapperheroes.model.jobs.Job;
//import nl.sapperheroes.model.jobs.JobType;
//import nl.sapperheroes.model.user.Client;
//import nl.sapperheroes.model.user.Hero;
//import nl.sapperheroes.model.user.User;
//import org.springframework.stereotype.Component;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class MockDatabase {
//
//    private Integer currentId = 0;
//    private List<User> userList = new LinkedList<>();
//    private List<Job> jobList = new LinkedList<>();
//
//    public MockDatabase() {
//        createDatabase();
//    }
//
//    public Integer getCurrentId() {
//        return currentId;
//    }
//
//    public void setCurrentId(Integer currentId) {
//        this.currentId = currentId;
//    }
//
//
//    public Job getJob(int jobId) {
//        return jobList.stream().filter(job -> job.getId() == jobId).collect(Collectors.toList()).get(0);
//    }
//
//    public void addJobToList(Job job) {
//        jobList.add(job);
//    }
//
//    public User getUser(int userId) {
//        for (User user : userList) {
//            if (user.getId() == userId) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public void addUserToList(User user) {
//        userList.add(user);
//    }
//
//    public List<User> getUserList(){
//        return userList;
//    }
//
//    public List<User> getClientList() {
//        return userList.stream().filter(user -> user.getClass().equals(Client.class)).collect(Collectors.toList());
//    }
//
//    public List<User> getHeroList() {
//        return userList.stream().filter(user -> user.getClass().equals(Hero.class)).collect(Collectors.toList());
//    }
//
//    public List<Job> getJobList(){
//        return jobList;
//    }
//
//    public void createDatabase() {
//        Job job = new Job();
//        job.setId(currentId++);
//        job.setDescription("transportation please!!!!");
//        job.setType(JobType.TRANSPORTATION);
//        addJobToList(job);
//
//        User client1 = new Client();
//        User client2 = new Client();
//        User client3 = new Client();
//        User client4 = new Client();
//
//        client1.setId(currentId++);
//        client1.setCity("Utrecht");
//        client1.setCountry("Holland");
//        client1.setFirstName("Martijn");
//        client1.setLastName("Louzada");
//        client1.setEmail("Martijn@Gmail.nl");
//        client1.setHouseNumber(12);
//        client1.setPassword("123");
//        client1.setPhoneNumber("06-12345678");
//        client1.setPostalCode("1234 AB");
//        client1.setStreet("langestraat");
//        Client client = (Client) client1;
//        client.setJob(job);
//        addUserToList(client1);
//
//        client2.setId(currentId++);
//        client2.setCity("Utrecht");
//        client2.setCountry("Holland");
//        client2.setFirstName("Jerrol");
//        client2.setLastName("Cambiel");
//        client2.setEmail("Jerrol@Gmail.nl");
//        client2.setHouseNumber(325);
//        client2.setPassword("1234");
//        client2.setPhoneNumber("06-12345453");
//        client2.setPostalCode("1234 GB");
//        client2.setStreet("Brink");
//        addUserToList(client2);
//
//        client3.setId(currentId++);
//        client3.setCity("Utrecht");
//        client3.setCountry("Holland");
//        client3.setFirstName("Matt");
//        client3.setLastName("Lau");
//        client3.setEmail("Matt@Gmail.nl");
//        client3.setHouseNumber(90);
//        client3.setPassword("12345");
//        client3.setPhoneNumber("06-54345453");
//        client3.setPostalCode("1234 ZW");
//        client3.setStreet("jupiterlaan");
//        addUserToList(client3);
//
//        client4.setId(currentId++);
//        client4.setCity("Utrecht");
//        client4.setCountry("Holland");
//        client4.setFirstName("Sara");
//        client4.setLastName("Talefe");
//        client4.setEmail("Sara@Gmail.nl");
//        client4.setHouseNumber(90);
//        client4.setPassword("123456");
//        client4.setPhoneNumber("06-54354645");
//        client4.setPostalCode("1234 DG");
//        client4.setStreet("kerkweg");
//        addUserToList(client4);
//
//        User hero1 = new Hero();
//        User hero2 = new Hero();
//        User hero3 = new Hero();
//        User hero4 = new Hero();
//
//        hero1.setId(currentId++);
//        hero1.setFirstName("Frank");
//        hero1.setLastName("Meert");
//        hero1.setCity("Utrecht");
//        hero1.setCountry("Holland");
//        hero1.setEmail("frank@meert.com");
//        hero1.setStreet("straat");
//        hero1.setHouseNumber(5);
//        hero1.setPostalCode("1234 AB");
//        hero1.setPhoneNumber("1234567890");
//        hero1.setPassword("password");
//        addUserToList(hero1);
//        Hero hero = (Hero) hero1;
//        hero.createHeroList();
//
//        hero2.setId(currentId++);
//        hero2.setFirstName("Roy");
//        hero2.setLastName("van Straten");
//        hero2.setCity("Velsenbroek");
//        hero2.setCountry("Holland");
//        hero2.setEmail("roy@straten.nl");
//        hero2.setStreet("avenue");
//        hero2.setHouseNumber(420);
//        hero2.setPostalCode("2341 BA");
//        hero2.setPhoneNumber("1234567890");
//        hero2.setPassword("password");
//        addUserToList(hero2);
//        Hero h2 = (Hero) hero2;
//        h2.createHeroList();
//
//        hero3.setId(currentId++);
//        hero3.setFirstName("Costas");
//        hero3.setLastName("de Griek");
//        hero3.setCity("Utrecht");
//        hero3.setCountry("Holland");
//        hero3.setEmail("costas@deGriek.com");
//        hero3.setStreet("boulevard");
//        hero3.setHouseNumber(101);
//        hero3.setPostalCode("3412 AA");
//        hero3.setPhoneNumber("1234567890");
//        hero3.setPassword("password");
//        addUserToList(hero3);
//        Hero h3 = (Hero) hero3;
//        h3.createHeroList();
//
//        hero4.setId(currentId++);
//        hero4.setFirstName("Diogo");
//        hero4.setLastName("Rolo");
//        hero4.setCity("Utrecht");
//        hero4.setCountry("Holland");
//        hero4.setEmail("Diogo@Rolo.com");
//        hero4.setStreet("Park");
//        hero4.setHouseNumber(89);
//        hero4.setPostalCode("2341 BB");
//        hero4.setPhoneNumber("1234567890");
//        hero4.setPassword("password");
//        addUserToList(hero4);
//        Hero h4 = (Hero) hero4;
//        h4.createHeroList();
//    }
//}