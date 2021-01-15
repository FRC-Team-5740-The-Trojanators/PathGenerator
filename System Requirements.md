### FIRST Robotics Competition Autonomous-mode Pathing Waypoint Generator Tool

The FIRST Robotics Competition (FRC) game matches includes a period of autonomous movement, where the robot moves under internal guidance, without external control signals from the drive team members. Some years' games have include a semi-autonomous mode, where some input from the drive team is allowed. A team will receive points for their robot't autonomous-mode performance. Often the minimum requirement for a robot to recieve points is merely move some distance, and then stop. This movement can be achieved by an open-loop mode, as in, "run the drive motors for 5 seconds, then stop". But for more points, a more sophisticated controls scheme is required. This more sophisticated controls scheme can be achieved by using a proportional-integral-diverative (PID) controls scheme. 

An excellent presentation is from FRC Team 254, found here: https://www.youtube.com/watch?v=8319J1BEHwM.

The goal of this program is to accept path waypoints and produce the PID values to control the robot during automous mode. The program is divided into several subsystems: a core library, a command-line text-based program, and a graphical user interface (GUI) program. 

The input of the program is the desired path, either as a text file or from the GUI. The output is a set of trajectory values. 

## Terms  
**Path**: the set of points the robot should travers across the playing area.  
**Trajectory**: the desired time and velocity of the robot at the corresponding Path points. 
**Jerk**: In physics, jerk or jolt is the rate at which an object's acceleration changes with respect to time. It is a vector quantity (having both magnitude and direction). Jerk is most commonly denoted by the symbol j and expressed in m/s^3 (SI units).


## Requirements
The program will load a configuration file at startup. The configuration file will include: 
 * Output directory
 * Delta-t (time steps, default is 20 milliseconds)
 * 

The tracectory output will include:
 * position
 * velocity
 * acceleration 
 * jerk
 * heading
 * delta-t
 * 