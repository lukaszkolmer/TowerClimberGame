package Character.Body;

public class Head {
    private Ears ears = new Ears();
    private Eyes eyes = new Eyes();
    private Mouth mouth = new Mouth();
    private boolean itemEquippedOn = false;
    public Ears getEars() {
        return ears;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public Mouth getMouth() {
        return mouth;
    }
}
