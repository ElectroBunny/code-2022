package frc.robot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;

public class RobotMap {
    /**
	 * How many sensor units per rotation.
	 * Using CTRE Magnetic Encoder.
	 * @link https://github.com/CrossTheRoadElec/Phoenix-Documentation#what-are-the-units-of-my-sensor
	 */
    public final static int kSensorUnitsPerRotation = 4096;

	/**
	 * Using the configSelectedFeedbackCoefficient() function, scale units to 3600 per rotation.
	 * This is nice as it keeps 0.1 degrees of resolution, and is fairly intuitive.
	 */
	public final static double kTurnTravelUnitsPerRotation = 3600;
	
	/**
	 * Empirically measure what the difference between encoders per 360'
	 * Drive the robot in clockwise rotations and measure the units per rotation.
	 * Drive the robot in counter clockwise rotations and measureַ the units per rotation.
	 * Take the average of the two.
	 */
	public final static int kEncoderUnitsPerRotation = 4096;
    
    public final static double DIAMETER_WHELL=6 * 0.254; //in METERS
    public final static int MAX_VOLT = 12;

    public static final int JOYSTICK_CONTROLLER = 0;
    public static final int XBOX_CONTROLLER = 1;
    public static final int STICK_X = 0;
	public static final int STICK_Y = 1;
	public static final int STICK_Z = 2;
	public static final int THOROTTLE = 3;

	public static final int DRIVE_RIGHT_MASTER = 4;
    public static final int DRIVE_RIGHT_FOLLOWER = 3;

    public static final int DRIVE_LEFT_MASTER = 1;
    public static final int DRIVE_LEFT_FOLLOWER = 2;
    

    public static final int VICTOR_COLLECTOR = 9;
    public static final int VICTOR_SHOOTER = 7;

    public static final int VICTOR_ROLLER = 0;
    
    public static final int CHANGEDIRECTION_MASTER=7;
    
    public static final double PATH_MAX_SPEED = 4.572;


    public static final int JOYSTICK_LEFT = 0;
    public static final int JOYSTICK_RIGHT = 1;

    public static final int LIGHT_VOLTAGE = 0;

    public static final int RAMP_CLAW_FORWARD = 5;
    public static final int RAMP_CLAW_REVERSE = 6;

    public static final int LIFT_MOTOR = 6;
    public static final int LIFT_HALL_TOP = 0;
    public static final int LIFT_HALL_BOT = 1;

    private static final double ENCODER_PULSES_PER_REVOLUTION = 256.0D;
    public static final double WHEEL_TURNS_PER_ENCODER_TURN = 1.0 / 2.975;
    public static final double INCHES_PER_WHEEL_TURN = 6.0 * Math.PI;

    public static final double INCHES_PER_COUNT = (1.0 / ENCODER_PULSES_PER_REVOLUTION) * WHEEL_TURNS_PER_ENCODER_TURN * INCHES_PER_WHEEL_TURN;
    public static final double COUNTS_PER_INCH = 1.0 / INCHES_PER_COUNT;

    public static final double FEET_PER_COUNT = (1.0 / 12.0) * INCHES_PER_COUNT;
    public static final double COUNTS_PER_FOOT = COUNTS_PER_INCH * 12.0;

    public static final double COUNTS_PER_METER = COUNTS_PER_INCH * (1 / 2.54) * 100.0;
    public static final double METERS_PER_COUNT = 1.0 / COUNTS_PER_METER;

    public static final DifferentialDriveKinematics kinematics = new  DifferentialDriveKinematics(0.5);
    public static final PIDController leftPIDController= new PIDController(1.0, 1, 0); 
    public static final  PIDController rightPIDController= new PIDController(1.0, 1, 0); 
    public static final SimpleMotorFeedforward feedforward = new SimpleMotorFeedforward(0.3, 2);

    public static boolean GrabWorkKey=false;
    public static boolean ShotWorkKey=false;
    public static boolean CollectWorkKey=false;

    public static final int SHOOTER_PITCH_SOLENOID_DEPLOY = 0;//0
    public static final int SHOOTER_PITCH_SOLENOID_RETRACT = 1;//0

    public static final double BASKET_HEIGHT = 2.64; // Meters
    
    
}