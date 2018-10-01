package dk.cphbusiness.checks;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    public PersonTest() {
        }
    
    @Test
    public void testPersonCreation() {
        Person person = new Person(7, "Kurt", "kurt@hansen.dk");
        assertThat(person.getName(), is("Kurt"));
        }

    @Test
    public void testGetName() {
        Person person = new Person(7, "Kurt", "kurt@hansen.dk");
        assertThat(person.getName(), is("Kurt"));
        }
    
    
    }
