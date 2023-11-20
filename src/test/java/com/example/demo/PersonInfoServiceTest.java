package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;

import java.util.List;

@SpringBootTest
public class PersonInfoServiceTest {

    @Autowired
    private PersonInfoDao personInfoDao;
    
    @Test
    public void addPersonInfoTest() {
        PersonInfo newPerson = new PersonInfo();
        newPerson.setId("001");
        newPerson.setName("John Doe");
        newPerson.setAge(30);
        newPerson.setCity("New York");

        personInfoDao.save(newPerson);
    }
    @Test
    public void greaterThanTest() {
        int referenceAge = 30;
        List<PersonInfo> res = personInfoDao.findByAgeGreaterThan(referenceAge);
        res.forEach(item -> System.out.println(item));
    }

    @Test
    public void lessThanEqualTest() {
        int referenceAge = 25;
        List<PersonInfo> res = personInfoDao.findByAgeLessThanEqualOrderByAgeAsc(referenceAge);
        res.forEach(item -> System.out.println(item));
    }

    @Test
    public void lessAndGreaterTest() {
        int lessAge = 20;
        int greaterAge = 40;
        List<PersonInfo> res = personInfoDao.findByAgeLessThanOrAgeGreaterThan(lessAge, greaterAge);
        res.forEach(item -> System.out.println(item));
    }

    @Test
    public void betweenTest() {
        int minAge = 20;
        int maxAge = 50;
        List<PersonInfo> res = personInfoDao.findTop3ByAgeBetweenOrderByAgeDesc(minAge, maxAge);
        res.forEach(item -> System.out.println(item));
    }

    @Test
    public void containingTest() {
        String city = "New York";
        List<PersonInfo> res = personInfoDao.findByCityContaining(city);
        res.forEach(item -> System.out.println(item));
    }

    @Test
    public void greaterAndContainingTest() {
        int age = 30;
        String city = "New York";
        List<PersonInfo> res = personInfoDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(age, city);
        res.forEach(item -> System.out.println(item));
    }
}
