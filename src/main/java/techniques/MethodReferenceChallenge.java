package techniques;

public class MethodReferenceChallenge {

    public static void main( String...args) {
        Runnable universeImpactRunnable = () -> new ChuckNorris().roundHouseKick();
        Runnable galaxyImpactRunnable = new ChuckNorris()::roundHouseKick;

        System.out.println("The galaxy is finished");

        universeImpactRunnable.run();
        universeImpactRunnable.run();

        galaxyImpactRunnable.run();
        galaxyImpactRunnable.run();
    }
    static class ChuckNorris {
        private static int numberOfKicks;
        private int galaxyDamage;

        ChuckNorris(){
            this.galaxyDamage = numberOfKicks++;
        }

        void roundHouseKick(){
            System.out.println(this.galaxyDamage);
        }
    }
}
