// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.constants.SubsystemConstants;
import frc.robot.subsystems.elevator.Elevator;
import frc.robot.subsystems.scoral.ScoralArm;
//define your scoralArm and Elevator here

//create a bargeextand class that extends sequentialcommandgroup

//then create a constructor that takes in an elevator and a scoralarm


  public BargeExtend(Elevator elevator, ScoralArm scoralArm) {

   // access them in here by using this.elevator is equal to whatever you took in through the constructor. 


    // Add your commands in the addCommands() call, e.g.
   
    addCommands(
    //now use the command new SetElevatorTarget, that takes stuff you can check and make them any value. 
    //then make a new wait until command that waits until the elevator is at the goal, and waits 15, elevator.atGoal(15)
    //then create a new SetScoralArmTarget that takes in the scoralarm, and for now make it any double.s 
        