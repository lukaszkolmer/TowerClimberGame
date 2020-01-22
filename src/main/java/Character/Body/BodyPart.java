package Character.Body;

public abstract class BodyPart {

    private boolean crippled = false;
    private Integer healthPoints = 100;
    private boolean itemEquippedOn = false;

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void decreaseHealthPoints(Integer decreaseBy){
        healthPoints -= decreaseBy;
        if (healthPoints < 0){
            healthPoints = 0;
        }
    }
    public void increaseHealthPoints(Integer increaseBy){
        healthPoints += increaseBy;
        if (healthPoints > 100){
            healthPoints = 100;
        }
    }

    public boolean isCrippled() {
        return crippled;
    }

    public void setCrippled(boolean crippled) {
        this.crippled = crippled;
    }

    public boolean isItemEquippedOn() {
        return itemEquippedOn;
    }

    public void setItemEquippedOn(boolean equipped) {
        this.itemEquippedOn = equipped;
    }
}
