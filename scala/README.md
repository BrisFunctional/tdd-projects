# simple-build-tool project for TDD in scala

sbt is a build tool for scala - http://code.google.com/p/simple-build-tool/ - check for instructions there on how to install it.  It really is just one jar (called "sbt-launcher" or similar).

If you are at a console in the root directory of this project, you can type `sbt` to launch the sbt console.

Then `update` and `reload` to pull in all the project dependencies and make them available.  This will download about 30mb of dependencies.

Then you can type `test` to run the unit tests.  If you type `~test` then sbt will go into a loop of running the tests every time you change any file, which is just about perfect.
