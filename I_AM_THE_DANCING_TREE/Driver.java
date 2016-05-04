
public class Driver extends GraphicsProgram
{

    private static final int N_STEPS = 1000;
    private static final int PAUSE_TIME = 20;
    private static final double TRAIN_LENGTH = 320;


    /**
     * The run() method of the Driver Class.
     * Creates an instance of the Train Class.
     * Responsible for animating the train across the screen.
     */
    public void run()
    {
        Train train = new Train(getGCanvas());
        for (int i = 0; i < N_STEPS; i++) {
            train.move(-100, 0);
            pause(PAUSE_TIME);
        }
    }
}