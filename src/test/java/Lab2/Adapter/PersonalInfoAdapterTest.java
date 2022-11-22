package Lab2.Adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalInfoAdapterTest {
    PersonalInfoAdapter adapter;

    @BeforeEach
    public void setUp() {
        PersonalData personalData = new PersonalData();
        adapter = new PersonalInfoAdapter(personalData);
    }

    @Test
    void getPersonalInformation() {
        assertEquals("{ name: Marian,yearOfBirth: 1983-12-05,email: marian@yahoo.com,telephone: 07273127371 }",
                adapter.getPersonalInformation());
    }
}