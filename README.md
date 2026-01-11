**Ball Game (Java AWT)**
**Description**

This is a simple mouse-interactive ball game developed using Java AWT. A red ball moves in response to the mouse pointer’s position. The goal is to keep the ball inside the window boundaries. If the ball touches the window edges, the game ends automatically.

**Technologies Used**

Java

AWT (Abstract Window Toolkit)

Event Handling (MouseMotionListener, WindowAdapter)

Multithreading (for delayed exit)

**How the Game Works**

A red ball is drawn inside a window.

The ball moves away from the mouse cursor when the mouse is moved.

The ball continuously updates its position using mouse movement events.

If the ball touches any boundary of the window:

The message "Game end!!" is displayed.

The application closes automatically after 1 second.
