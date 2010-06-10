# Sample code for Tycho builds

Copyright 2010 Mattias Holmqvist. All rights reserved.

# What is this?

This project contains sub-projects that will show you how to use Tycho for:

* Building OSGi bundles
* Building Eclipse features
* Building Eclipse Update sites
* Run unit tests for code in an OSGi bundle
* Code coverage with EclEmma 

Download the source .tar or .zip. Unpack the sources to a folder somewhere.

# How to use the projects from within Eclipse

0. Create a new Eclipse workspace.
0. Choose "Import->Existing projects into workspace"
0. Select all "se.mattiasholmqvist.*" projects from the source folder.
0. Open the se.mattiasholmqvist.tychoexamples.target project and select the example_target.target file. Choose "Set as target platform" from the Target Definition Editor.

# How to build everything with Tycho?

0. Download and install a version of Maven 3.
0. Open a command line shell.
0. Go to the se.mattiasholmqvist.tychoexamples.parent project folder.
0. Enter:
`mvn clean package`

## Run unit tests with code coverage:
`mvn integration-test verify -Pcoverage`

# Want more help?

Checkout [my website](http://www.mattiasholmqvist.se) for some complementary articles or [Sonatype's Tycho site](http://tycho.sonatype.org/).