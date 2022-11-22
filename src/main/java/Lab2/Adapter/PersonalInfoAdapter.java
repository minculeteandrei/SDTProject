package Lab2.Adapter;

public class PersonalInfoAdapter implements PersonalInformation{
    private final PersonalDataI personalData;

    public PersonalInfoAdapter(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public String getPersonalInformation() {
        return "{ name: " + this.personalData.getName() + "," + "yearOfBirth: " + this.personalData.getBDay() +
                "," + "email: " + this.personalData.getEmail() + "," + "telephone: " + this.personalData.getTelephone() + " }";
    }
}
