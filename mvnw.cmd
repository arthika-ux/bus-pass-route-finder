@REM ----------------------------------------------------------------------------
@REM Maven Wrapper Script for Bus Pass & Route Finder System
@REM ----------------------------------------------------------------------------
@echo off
set "SCRIPT_DIR=%~dp0"
set "MAVEN_HOME=%SCRIPT_DIR%apache-maven-3.9.9"
set "JAVA_HOME=C:\Program Files\Java\jdk-26.0.2"

if not exist "%MAVEN_HOME%\bin\mvn.cmd" (
    echo Error: Maven binary not found in %MAVEN_HOME%
    exit /b 1
)

call "%MAVEN_HOME%\bin\mvn.cmd" %*
