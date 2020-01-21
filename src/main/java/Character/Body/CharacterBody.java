package Character.Body;

public class CharacterBody {
    private LeftHand leftHand = new LeftHand();
    private RightHand rightHand = new RightHand();
    private LeftLeg leftLeg = new LeftLeg();
    private RightLeg rightLeg = new RightLeg();
    private Torso torso = new Torso();
    private Head head = new Head();

    public LeftHand getLeftHand() {
        return leftHand;
    }

    public RightHand getRightHand() {
        return rightHand;
    }

    public LeftLeg getLeftLeg() {
        return leftLeg;
    }

    public RightLeg getRightLeg() {
        return rightLeg;
    }

    public Torso getTorso() {
        return torso;
    }

    public Head getHead() {
        return head;
    }
}
