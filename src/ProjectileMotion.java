

public class ProjectileMotion {

    private double g = 9.8;         // Gravity
    private double vInitial;        // Initial Velocity
    private double hInitial;        // Initial Height
    private double dt = 0.1;        // time step (interval in which time increments)

    public ProjectileMotion(double vInitial, double hInitial) {
        this.vInitial = vInitial;
        this.hInitial = hInitial;
    }

    public void simulationMotion() {
        double y, ay, vy, t;
        y = this.hInitial;
        vy = this.vInitial;
        t = 0;

        while(y > 0) {
            ay = -g;
            y += vy * dt;           // use old vy to calculate new y
            vy += ay * dt;          // use old ay to calculate new vy
            t += dt;
        }

        System.out.println("Time: " + t);
        System.out.println("Particle's Velocity: " + vy);

    }

}
