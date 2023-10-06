@echo off
set "batchPath=%~dp0"
echo The location of the currently running batch file is: %batchPath%
echo running groupTestng.xml
cd /d "%batchPath%"
cd..
mvn test -DsuiteXmlFiles=Build/groupTestng.xml