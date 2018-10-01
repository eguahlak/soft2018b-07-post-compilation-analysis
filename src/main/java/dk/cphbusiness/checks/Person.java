package dk.cphbusiness.checks;

public class Person {
    private long id;
    private String name;
    
    public Person(final long id, final String name, final String email) {
        this.id = id;
        this.name = name;
        }
    
    public final String getName() {
        return name;
        }
    
    }
