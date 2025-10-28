// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.elevator.Elevator;
import frc.robot.subsystems.scoral.ScoralArm;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ToReefHeight extends SequentialCommandGroup {
  /** Creates a new goToReefHeight. */
  //add your final variables of ScoralArm and Elevator 


  public ToReefHeight(x,y,z,h) {
        //make this constructor take in  an elevator, scoral arm, heightInch, pitchDegs

    addCommands(
        new SequentialCommandGroup(
          //now in the sequentail command group add the following commands
          //set the elevator to heightInch with a timeout of 15 seconds using setElevatorTarget
          //use the setScoralArmTarget to set the scoral arm to pitchDegs with a timeout of 3.5 seconds
        )
    )
    
  }
}
