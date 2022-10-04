---
title: "CTRE"
date: 2022-09-21T14:01:12-07:00
draft: flase
description: ""
weight: 0
---


![CTRE](/gifs/robotconfig/ctre.jpeg?width=200px&height=200px)

Cross The Road Elctronics, also known as CTRE is one of the main FRC robot electronics provider while allowing for incredibly useful and neccesary tools for dignosing electronic devices and configurring.

---


#### Pheonix Tools
The Pheonix Library provided by CTRE is a great way to get started as they allow us to settup our devices once they are ready. The installation for the Pheonix Framework can be found [here](https://store.ctr-electronics.com/software/).

![CTRE](/gifs/robotconfig/pheonix.jpg?classes=border,shadow)

After installing the tools you will be able to use the Pheonix Tuner in order to interact with CTRE hardware devices, test them, and even settup their firmware version and ID.  

#### Device Software Firmware Configuration
Now that we have installed the tools required from CTRE it will come with latest device firmwares for all devices at the time, which you be a ble to find on your computer under an FRC folder `C:\Users\Public\Documents\FRC`
![CTRE](/gifs/robotconfig/firmware.jpg?classes=border,shadow)


There are also times where a firmware update is necessary due to a new updates, therefor we will need to download the latest version from the [CTRE website](https://store.ctr-electronics.com/software/).
![CTRE](/gifs/robotconfig/firmwareUpdate.jpg?classes=border,shadow)

#### Setting Up Your Device
After you have completed the above steps you will need to open the **Pheonix Tuner** desktop application and connect to your robot via a **USB Type B** which will be connected to your Roborio, then you will want to click **"Run A Temporary Diagnostic Server"** 
![CTRE](/gifs/robotconfig/tuner.jpg?width=800px&classes=border,shadow)

##### Updating Device 
After running a diagnostic server and getting connected, you will need to head to the second tab on the top left called **CAN Devices** it may take a few moments to load the devices that are recognised, but once they appear you will want to follow the following steps.  
**1)** Select the devices you want to update  and click  
**2)** Set the ID of the device you are updating, make sure it does not interfere with any other existing device ID's otherwise you may run into issues  
**3)** Change the name of the to something you are easily to recognised   
**4)** Select the proper path to the most recent **CRF** file, which would be the most recently downloaded firmware found under your FRC folder, please insure you are selecting the firmware for the correct device you are updating  
**5)** If you are updating the firmware of multiple devices with the same firmware select the option to "Update All With Matching Type"  
**6)** Finally press the **Update Device** button

![CTRE](/gifs/robotconfig/deviceConfig.jpg?width=900px&classes=border,shadow)

**Note:** incase you run into trouble identifying your device, due to tight spaces or idetical components you can blink each individual device by clicking the "Animate LED's and Confirm ID is Correct"
