public class TestHuman
{
    public static void main(String[] args)
    {
        Head head = new Head("Brown");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(81);
        Hand leftHand = new Hand(true);
        Hand rightHand = new Hand(true);

        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Hair color: " + person.getHead().getHairColor());
        System.out.println("Left leg length: " + person.getLeftLeg().getLength() + " cm");
        System.out.println("Right leg length: " + person.getRightLeg().getLength() + " cm");
        System.out.println("Left hand has fingers: " + person.getLeftHand().hasFingers());
        System.out.println("Right hand has fingers: " + person.getRightHand().hasFingers());
    }
}
