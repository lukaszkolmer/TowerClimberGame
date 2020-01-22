package Character.BaseInfo;

public class Gender {
    private String gender;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "You are " + gender;
    }
}