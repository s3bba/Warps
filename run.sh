#!/bin/bash
# Maven build
mvn

# Removing old warp files and directories
echo "[INFO]: Cleaning previous warps files & directories"
rm src/test/server/plugins/Warps-1.0-SNAPSHOT.jar
rm -d -R src/test/server/plugins/Warps

# Coping new warps jar
echo "[INFO]: Coping new jar to the plugins directory"
cp target/Warps-1.0-SNAPSHOT.jar src/test/server/plugins/ || exit

# Changing directories to the server dir and starting the server
echo "[INFO]: Changing directory to src/test/server/"
cd src/test/server/ || exit
echo "[INFO]: Starting Minecraft Java server"
java -Xms1G -Xmx2G -XX:+UseG1GC -XX:-OmitStackTraceInFastThrow -XX:+ShowCodeDetailsInExceptionMessages -jar paper.jar nogui