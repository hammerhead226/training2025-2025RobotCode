package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
// import your subsystem here
// example: import frc.robot.subsystems.elevator.Elevator;

public class SetElevatorTarget extends Command {

  // first create a variable for your subsystem
  // name it elevator (or whatever subsystem you're using)


  // now create two double variables
  // one called goalInch which stores the target position
  // and one called thresholdInch which stores how close is “good enough”


  // now create the constructor
  // the constructor should take in your subsystem
  // and also take in the goalInch and thresholdInch values
  // inside the constructor set your class variables equal to the values passed in
  // and make sure to use addRequirements(subsystem) so the command owns the subsystem


  // initialize()
  // this runs once when the command starts
  // inside this method you should call the subsystem method that sets the goal
  // for example: elevator.setElevatorGoal(goalInch);


  // execute()
  // this runs every 20ms while the command is active
  // for this command you probably don't need anything here


  @Override
  public void end(boolean interrupted) {}


  // isFinished()
  // this method decides when the command ends
  // return true when the current elevator position is within thresholdInch of goalInch
  // example:
  // return Math.abs(elevator.getElevatorPosition() - goalInch) <= thresholdInch;

}
