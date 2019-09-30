(this project requires processing 3)
The Cannonball class models a cannonball that has been fired from the ground 
into the air. As the ball moves, its position is tracked via x- and 
y-coordinates (position), and its velocity is indicated by x- and y-components 
of velocity.

Write a Cannonball class with the following methods:

* A constructor with an initial x-position and y-position (although y will 
  probably be zero)
* A method `shoot(double alpha, double v)` who arguments are the initial angle
  alpha (above the horizon) and initial velocity v. Calling shoot computes 
  the initial x- and y- velocities of the cannonball.
* A method `.move(double deltaSec)` that moves the ball to the next position
  based on calculations involving its current position and velocity and the
  amount of time that has passed (deltaSec). To do
  this:
    * in the x-direction use current position and velocity to calculate a
      new x-position based on deltaSec
    * in the y-direction use current position, velocity, and acceleration to
      calculate a new y-position based on deltaSec
    * update the y-component of velocity as well, based on acceleration and 
      deltaSec
* A method `Point getLocation()` that gets the current location of the 
  cannonball, rounded to integer coordinates.

For a Runner class to use the Cannonball class:

1. Identify an initial position and create the cannonball object.
2. Call the .shoot() method with a specified angle and velocity.
3. Repeatedly call the .move() method with a given deltaSec to track the 
   cannonball's motion.
4. Repeatedly call the .getLocation() method to identify and printout the 
   position of the cannonball as it moves.
5. Stop tracking the cannonball's motion once it has landed on the ground 
   again.


This activity is modeled on a project from Horstmann's *Java Concepts: Early Objects*, 8th Edition.

