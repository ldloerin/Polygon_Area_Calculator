# Polygon_Area_Calculator

This code calculates the area of the minimum convex polygon of a given number of X, Y coordinates. 

The code can be launched by running the executable file CalculatePolygonArea/src/polygons.exe. This file will compile the Java source code and run the sequence within a console. Once the code runs, it will wait for an input line of X, Y coordinates. Every input line has to be forwarded to the code by pressing the enter key and has to follow the typical Json file format, like shown in theis example:

{"x": 0.0, "y": 0.0}, {"x": 2.0, "y": 0.0}, {"x": 2.0, "y": 2.0}

The code returns the area of the minimum convex polygone and waits for the next polygon input line. To finish the process, close the command line window.