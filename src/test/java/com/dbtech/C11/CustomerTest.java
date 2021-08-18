package com.dbtech.C11;

import com.dbtech.C11.dao.Customer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


// Let-s test the Customer class
public class CustomerTest {



//    @Test
//    public void setDateReturnsOk(){
//        Movie movie = new Movie();
//        Date date = new Date(1628584852);
//        movie.setReleaseDate(date);
//        assertEquals(date,movie.getReleaseDate());
//    }




    @Test
    public void tryId(){
        Customer c = new Customer();
        c.setId(100);
        assertEquals(100,c.getId());
    }

    @Test
    public void tryUsername(){
        Customer c = new Customer();
        c.setUsername("Victor");
        assertEquals("Victor",c.getUsername());
    }

    @Test
    public void tryFirstName(){
        Customer c = new Customer();
        c.setFirstName("Ionel");
        assertEquals("Ionel",c.getFirstName());
    }

    @Test
    public void tryLastName(){
        Customer c = new Customer();
        c.setLastName("Popescu");
        assertEquals("Popescu",c.getLastName());
    }


    @Test
    public void tryAddress(){
        Customer c = new Customer();
        c.setAddress("Splaiul Independentei 290");
        assertEquals("Splaiul Independentei 290",c.getAddress());
    }

    @Test
    public void tryCountry(){
        Customer c = new Customer();
        c.setCountry("Romania");
        assertEquals("Romania",c.getCountry());
    }


    @Test
    public void tryPhone(){
        Customer c = new Customer();
        c.setPhone("0737555444");
        assertEquals("0737555444",c.getPhone());
    }

    @Test
    public void tryPostalCode(){
        Customer c = new Customer();
        c.setPostalCode("060011");
        assertEquals("060011",c.getPostalCode());
    }

    @Test
    public void tryCity(){
        Customer c = new Customer();
        c.setCity("Bucuresti");
        assertEquals("Bucuresti",c.getCity());
    }



}
