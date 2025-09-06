// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.constants.SubsystemConstants.ElevatorConstants;
import frc.robot.constants.SubsystemConstants.ScoralArmConstants;
import frc.robot.subsystems.elevator.Elevator;
import frc.robot.subsystems.scoral.ScoralArm;
import frc.robot.subsystems.scoral.ScoralRollers;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class GoToStowAuto extends SequentialCommandGroup {
  /** Creates a new GoToStowAuto. */
  public GoToStowAuto(/*add them here */) {
    
    //Add the elvator object, scoralArm object, and scoralRollers object to the command

    addCommands(
        //create an instant command to set the constraints of the scoral arm to 300, 600
        //create a setScoralArmTarget command to move the scoral arm to the stow setpoint - 6 degrees with a tolerance of 20 degrees
        //create an instant command to set the constraints of the scoral arm to 150, 300
        //create a stop command for the scoral rollers
        //create a wait until command to wait until the scoral arm is at its goal with a tolerance of 10 degrees
        //create a setElevatorTarget command to move the elevator to the stow setpoint with a tolerance of 15 inches
        //create a setScoralArmTarget command to move the scoral arm to the stow setpoint with a tolerance of 2 degrees
  }
}
