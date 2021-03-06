#!/bin/bash


echo
echo "---------------------------------------------------------------------------------"
echo "Installing component"
echo "---------------------------------------------------------------------------------"



# -------------------------------------------------------------------------------------
# INITIALIZE VARIABLES
# -------------------------------------------------------------------------------------

echo
echo "Initializing variables"
BASEDIR="$( cd "$( dirname "$0" )" && pwd )"



# -------------------------------------------------------------------------------------
# SET WORKING DIRECTORY
# -------------------------------------------------------------------------------------

echo
echo "Changing working directory"
cd $BASEDIR



# -------------------------------------------------------------------------------------
# GET THE NAME OF THE APPLICATION
# -------------------------------------------------------------------------------------

echo
echo "Taking ${PWD##*/} as the name of the application"
APPLICATION=${PWD##*/}



# -------------------------------------------------------------------------------------
# INSTALL THE APPLICATION
# -------------------------------------------------------------------------------------

echo
echo "Installing application"
echo
helm install $APPLICATION $BASEDIR/chart



echo
echo "---------------------------------------------------------------------------------"
echo "Done installing component"
echo "---------------------------------------------------------------------------------"
