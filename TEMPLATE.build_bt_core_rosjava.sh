#! /bin/bash

PACKAGE=ftag2_core
JAR_FILE=${PACKAGE}-0.0.0.jar
MATLAB_ROOT=/opt/MATLAB/R2014b
WS_ROOT=~/catkin_ws/rosjava

MATLAB_JAR_DIR=$MATLAB_ROOT/toolbox/psp/rosmatlab/jars

cd $WS_ROOT
source devel/setup.bash
catkin_make
sudo cp $WS_ROOT/src/${PACKAGE}_rosjava/$PACKAGE/build/libs/$JAR_FILE $MATLAB_JAR_DIR
sudo chmod +x $MATLAB_JAR_DIR/$JAR_FILE
