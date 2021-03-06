#!/bin/bash


echo
echo "---------------------------------------------------------------------------------"
echo "Building component"
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
# UPDATE API HOST
# -------------------------------------------------------------------------------------

echo
echo "Updating API Server host value"
sed -i 's/cloud\.miles\.co\.ke/'${API_SERVER_HOST_NAME}'/g' $BASEDIR/chart/values.yaml



# -------------------------------------------------------------------------------------
# UPDATE DOCKER HOST
# -------------------------------------------------------------------------------------

echo
echo "Updating Docker Registry host value"
sed -i 's/cloud\.miles\.co\.ke/'${REGISTRY_SERVER_HOST_NAME}'/g' $BASEDIR/pom.xml



# -------------------------------------------------------------------------------------
# BUILD & INSTALL COMPONENT IN MAVEN REPOSITORY
# -------------------------------------------------------------------------------------

echo
echo "Building & installing components into the Maven repository"
echo
bash mvnw install



echo
echo "---------------------------------------------------------------------------------"
echo "Done building component"
echo "---------------------------------------------------------------------------------"
