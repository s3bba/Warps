# Warps (Coming soon!)
Server and player warps module with advanced capabilities and lightweight game configuration. <br>
<br>
Version: 1.0-SNAPSHOT<br>
Native API: TODO add version<br>
Website: <a href="www.sebbaindustries.com">SebbaIndustries.com</a><br>
Source code: <a href="https://github.com/SebbaIndustries/Warps">github.com/SebbaIndustries/Warps</a><br>
Java Docs: <a href="https://github.com/SebbaIndustries/JavaDocs">github.com/SebbaIndustries/JavaDocs</a><br>
Developers: `SebbaIndustries`, `Frcsty` <br>

[![forthebadge made-with-java](https://ForTheBadge.com/images/badges/made-with-java.svg)](https://java.com/)
<br>
[![license](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/mit-license.php)

How To (Server Owners)
------
This is a plugin build on PaperAPI, you can run it on Spigot but use Paper for best experience.<br>
Warps plugin uses MySQL/MariaDB to store its data, so you need to configure `hikari.properties` file for your database.
<b>Plugin will not load without database connection!</b>

Download Warps here: <a href="#">TODO setup download site</a>

<b>Instalation:</b> 
- Place Warps-1.0-SNAPSHOT.jar file into plugins folder
- Start the server, plugin will generate `Warps` directory
- Stop the server after everything has been loaded
- Open and configure `hikari.properites` for your database (More detailed instructions on database connection are included in the file) 

## Features

Todo: Features here

## Commands (Players)
#### `/warp`
<b>Use: </b>
- `/warp <warp>`
<br>This command teleports you to the specified warp.
#### `/warps`
<b>Use: </b>
- `/warps`
<br>This command opens warps GUI.
- `/warps <category>`
<br>This command opens warps GUI with specified category.
#### `/setwarp`
<b>Use: </b>
- `/setwarp`
<br>This command creates new warp, name of the warp is taken from the players name.
- `/setwarp <name>`
<br>This command creates new warp, name is taken from the command argument.
#### `/delwarp`
<b>Use: </b>
- `/delwarp`
<br>This command deletes warp, name of the warp is taken from the players name.
- `/delwarp <name>`
<br>This command deletes warp, name is taken from the command argument.
#### `/movewarp`
<b>Use: </b>
- `/movewarp`
<br>This command moves warp to the current player location, name of the warp is taken from the players name.
- `/movewarp <name>`
<br>This command moves warp to the current player location, name is taken from the command argument.
#### `/renamewarp`
<b>Use: </b>
- `/renamewarp <name>`
<br>This command renames warp if warp can be renamed.
