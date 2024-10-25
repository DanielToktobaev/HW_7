public class Medic extends Hero{
    int healpoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic healed his teammates");
    }

    public void increaseExperience() {
        healpoints *= 1.1;
        System.out.println("Medic Увеличил лечения на 10%");
    }
}
