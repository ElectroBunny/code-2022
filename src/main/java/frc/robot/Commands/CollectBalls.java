// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.Subsystems.Collector;

public class CollectBalls extends CommandBase {
  private Collector balls_collector;

  public CollectBalls(Collector innerCollector) {
    balls_collector = innerCollector;
    addRequirements(balls_collector);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    balls_collector.startCollect(SmartDashboard.getNumber("Collector Gain", 0));
    SmartDashboard.putNumber("Collector voltage output ", balls_collector.getMotorVoltage());
  }

  @Override
  public void end(boolean interrupted) {
    balls_collector.stopCollect();
  }

  @Override
  public boolean isFinished() {
    return (new OI().getJoystick().getRawButtonPressed(3));
  }
}
