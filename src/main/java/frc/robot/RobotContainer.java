// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.Commands.CollectBalls;
import frc.robot.Commands.ReleaseBalls;
import frc.robot.Commands.ShootBall;
import frc.robot.Commands.StartArcadeDrive;
import frc.robot.Commands.RollerWork;
import frc.robot.Subsystems.NewDriverTrain;
import frc.robot.Subsystems.Shooter;
import frc.robot.Subsystems.Collector;
import frc.robot.Subsystems.Track;


public class RobotContainer {
  Timer time = new Timer();
  private final NewDriverTrain driverTrain = new NewDriverTrain();
  private final Shooter ballsShooter = new Shooter();
  private final Track ballsRoller = new Track();
  private final OI m_oi;
  private final Collector ballsCollector = new Collector();
  public double startTime;
  double kP = 0; 
  double delta_time = 0;
  Shooter victor_shooter = new Shooter();
  double straightValue =0;
  double timePeriod = 2;

  public RobotContainer() {
    driverTrain.getGyro().calibrate();

    m_oi = new OI();
    configureButtonBindings();
    driverTrain.setDefaultCommand(new StartArcadeDrive(driverTrain));
  }

  public void onAutoInit(){
    startTime = Timer.getFPGATimestamp();
    
    }
  
  public void onAutoPeriodic(){
    while (delta_time < 2){
      delta_time = Timer.getFPGATimestamp()- startTime;
    
    }
    driverTrain.ArcadeDrive(0, 0);
    // To continue - add the shoot in the autonomous
  }

  public void onTeleopInit() {

    driverTrain.GyroToWidget();

  }

    

  public void onTeleopPeriodic(){

  }

  public void onDisabledInit(){
    driverTrain.changetoCoast();
    
  }
  public void onDisabledPeriodic(){
    driverTrain.changetoCoast();
    driverTrain.getGyro().calibrate();
    
  }

  private void configureButtonBindings() {
    m_oi.button3.whileHeld(new CollectBalls(ballsCollector));
    m_oi.button4.whileHeld(new ReleaseBalls(ballsCollector));
    m_oi.button1.whileHeld(new ShootBall(ballsShooter));
    
  }
}

