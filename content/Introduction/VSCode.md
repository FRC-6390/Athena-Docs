---
title: "VS Code"
date: 2022-09-16T08:57:12-07:00
description: "How to get your computer ready for FRC"
weight: 1

---


#### What is VS Code?
Visual Studio Code is an Integrated Development Environment or IDE, An IDE is often a program that programmers use to code and compile projects. Visual Studio Code is a versatile platform and can be used with almost any language. Along with being able to support many languages, it has a large community creating extensions which allow you to personalize, improve workflow, and add more support for even more languages.

We will be using Visual Studio code in order to set up our java command-based programming envirnoment.

#### Downloading VS Code
To get started open the link bellow to download the VS Code installer for your platform.
https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java  
![Downloaing VS Code](/gifs/image4.gif?classes=border,shadow)

Once downloaded, run the installer and follow the default installation.  
The installer will install everything you’ll need, including a java JDK,  
Visual Studio Code and the required java extensions.
![Java Installation](/gifs/image3.gif?classes=border,shadow)

#### Downloading WPI Support For FRC 
To add FRC support to Visual Studio Code, download the following:   
https://github.com/wpilibsuite/allwpilib/releases  
Make sure you are not downloading a pre-release, The one you download should have a green **Latest** tag next to the title.  
![Downloading WPI](/gifs/image13.gif?classes=border,shadow)

Each season a new version comes out and you will need to update to that version if you wish to compete.  

Then run the ".iso" file that you just downloaded and run the Installer.exe program.
Choose the skip installing VS Code option as we have already installed it in the previous step above.  
![Downloading WPI](/gifs/image9.gif?classes=border,shadow)

##### Verifying and Finishing Install
Now the that we have finished downloading everything we need to do a few more things before we are free to start programming on Visual Studio Code. First thing we need to check after openning VS Code is if all of our java related tools were installed. Please make sure that the following java extension pack is installed.  
![Downloading WPI](/gifs/image16.gif?classes=border,shadow)

Now please confirm the following:  
`Ctrl + P`, will open the Visual Studio Extensions Command Line, then type   
`> java: configure java runtime`,   
and verify that you are using a Java version above 11.  
If you wish to download another version you can download it [here](https://adoptium.net/temurin/releases/?version=17).
![Downloading WPI](/gifs/image2.gif?classes=border,shadow)

Now we need to add the WPI support to Visual Studio Code, because we have only installed it to our system and have not added the proper extension into Visual Studio Code.  
Please go to this folder within your computer `C:\Users\Public\wpilib\2021\vsCodeExtensions`  
![Downloading WPI](/gifs/image17.gif?classes=border,shadow)


Now open Visual Studio Code and go to extensions, we need to install the WPILib.vsix file into Visual Studio Code. Once in extensions go to the 3 dots and press “Install from VSIX” and install the WPILib.vsix file.  
gif should go here 
![Downloading WPI](/gifs/image10.gif?classes=border,shadow)

#### Exploring VS Code 
##### File Management
Visual Studio Code has lots of way to manage your files, you can open folders through the “Open Folder” option in the Explorer tab on the left.  
You can also manage your files through the File button on the top of the window  
![Downloading WPI](/gifs/image14.gif?classes=border,shadow)

You can right click to bring up options within your current folder, like making new folders and files.   
![Downloading WPI](/gifs/image12.gif?classes=border,shadow)

##### Extensions
Visual Studio has lots of extensions, for almost anything you may need  
Disabling and extension will stop it from working  
Uninstalling an extension will remove it  
![Downloading WPI](/gifs/image7.gif?classes=border,shadow)

##### Terminal
The terminal is a very useful tool and helps a lot you a lot to find issues within your code by displaying information and errors. The terminal is usually located at the bottom of your screen.  
![Downloading WPI](/gifs/image5.gif?classes=border,shadow)

If the terminal is missing go to the top left under the Terminal tab and Press create new terminal or `ctrl+~`  

##### Personalization
Visual Studio Code has lots of ways to personalize your workflow, check out the extensions and find some themes you think you may like.
Personally we use “Material Icons” for our icons and
Visual Studio’s built in theme “Abyss”.
![Downloading WPI](/gifs/image11.png?classes=border,shadow)

To change your theme do the following, `ctrl + p`, to open the Visual Studio Extensions Command Line, then type the following `> preferences: Color Theme`


