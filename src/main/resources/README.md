# Warps (Coming soon!)
Server and player warps module with advanced capabilities and lightweight game configuration. <br>
<br>
Version: `1.0-SNAPSHOT`<br>
Native API: `Paper-1.16.3-R0.1-SNAPSHOT`<br>
Website: <a href="www.sebbaindustries.com">SebbaIndustries.com</a><br>
Source code: <a href="https://github.com/SebbaIndustries/Warps">github.com/SebbaIndustries/Warps</a><br>
Wiki: <a href="#">TODO: Plugin Wiki here</a><br>
Developers: `SebbaIndustries`, `Frcsty` <br>


[![license](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/mit-license.php)
![GitHub Workflow Status (branch)](https://img.shields.io/github/workflow/status/SebbaIndustries/Warps/Java%20CI%20with%20Maven/master)
![GitHub Workflow Status (branch)](https://img.shields.io/github/workflow/status/SebbaIndustries/Warps/CodeQL/master?label=codeQL)
[![GitHub issues](https://img.shields.io/github/issues/SebbaIndustries/Warps)](https://github.com/SebbaIndustries/Warps/issues)

How To (Server Owners)
------
This is a plugin build on PaperAPI, you can run it on Spigot but use Paper for best experience.<br>
Warps plugin uses MySQL/MariaDB to store its data, so you need to configure `hikari.properties` file for your database.
<b>Plugin will not load without database connection!</b>

Download Warps here: <a href="#">TODO setup download site</a>

<b>Installation:</b> 
- Place Warps-1.0-SNAPSHOT.jar file into plugins folder
- Start the server, plugin will generate `Warps` directory with files:
  * `README.md`
  * `configuration.properties`
  * `hikari.properties`
  * `messages.properties`
  * `gui.xml`
- Stop the server after everything has been loaded
- Open and configure `hikari.properites` for your database (More detailed instructions on database connection are included in the file) 
- Create a new database with the same name you used in `hikari.properites`
- Start the server and enjoy the plugin!

<b>Message configuration:</b>
<br>All messages are stored in `messages.properites`, you can change them to your liking.
<br>One difference is in place holders: every place holder starts with `{` and ends with `}`, inside you can call the place holder.

<b>Warp Placeholders:</b> 
```
{warp.name} - Returns warp name
{warp.location.x} - Returns warp location on X coordinate
{warp.location.y} - Returns warp location on Y coordinate
{warp.location.z} - Returns warp location on Z coordinate
{warp.location.yaw} - Returns warp location on Yaw axis
{warp.location.pitch} - Returns warp location on Pitch axis
{warp.metadata.description} - Returns warp description
{warp.metadata.category} - Returns warp category
{warp.visits} - Returns number of visits warp currently has.
```

## Features

Todo: Features here

## Commands & permissions

#### `/warp`
Use (Players): 
- `/warp <warp>` `warps.warp`
<br>This command teleports you to the specified warp.
- `/warp <warp> unsafe` `warps.warp.unsafe`
<br>This command teleports you to the specified warp even if warp location is considered dangerous.

#### `/warps`
Use (Players):
- `/warps` `warps.warps`
<br>This command opens warps GUI.
- `/warps help` `warps.warps.help`
<br>This command shows help message.
- `/warps <category>` `warps.warps.category`
<br>This command opens warps GUI with specified category.

#### `/listwarps`
Use (Players):
- `/listwarps` `warps.listwarps`
<br>This command opens warps GUI displaying all your warps.
- `/listwarps <player>` `warps.listwarps.others`
<br>This command opens warps GUI with warps from that player.

#### `/setwarp`
Use (Players):
- `/setwarp` `warps.setwarp`
<br>This command creates a new warp, name of the warp is taken from the players name.
- `/setwarp <name>` `warps.setwarp`
<br>This command creates a new warp, name is taken from the command argument.

Use (Staff): 
- `/setwarp ~ <name>` `warps.setwarp.staff`
<br>This command creates a new server warp (Warp will be under server warps instead of player warps).

#### `/delwarp`
Use (Players):
- `/delwarp` `warps.delwarp`
<br>This command deletes warp, name of the warp is taken from the players name.
- `/delwarp <name>` `warps.delwarp`
<br>This command deletes warp, name is taken from the command argument.

Use (Staff): 
- `/delwarp ~ <name>` `warps.delwarp.staff`
<br>This command deletes warp, name is taken from the command argument.

#### `/movewarp`
Use (Players): 
- `/movewarp` `warps.movewarp`
<br>This command moves warp to the current player location, name of the warp is taken from the players name.
- `/movewarp <name>` `warps.movewarp`
<br>This command moves warp to the current player location, name is taken from the command argument.

Use (Staff):
- `/movewarp ~ <name>` `warps.movewarp.staff`
<br>This command moves warp to the current player location, name is taken from the command argument.

#### `/renamewarp`
Use (Players):
- `/renamewarp <name> <new_name>` `warps.renamewarp`
<br>This command renames warp if warp can be renamed.

Use (Staff):
- `/renamewarp ~ <name> <new_name>` `warps.renamewarp.staff`
<br>This command renames warp.

#### `/reloadwarps`
Use:
- `/reloadwarps` `warps.reloadwarps`
<br>This command reloads warps plugin and its configuration.
