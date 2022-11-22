package Lab2.Adapter;

import java.time.LocalDate;

public class PersonalData implements PersonalDataI{
    @Override
    public String getName() {
        return "Marian";
    }

    @Override
    public LocalDate getBDay() {
        return LocalDate.of(1983, 12, 5);
    }

    @Override
    public String getEmail() {
        return "marian@yahoo.com";
    }

    @Override
    public String getTelephone() {
        return "07273127371";
    }
}
