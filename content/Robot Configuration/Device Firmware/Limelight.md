---
title: "Limelight"
date: 2022-09-21T14:02:00-07:00
draft: false
description: "Setting up your limelight"
weight: 0
---

![REV](/gifs/robotconfig/limelight.jpg?width=200px&height=200px)

Limelight is an incredibly useful vision processing tool in FRC which allows you to make accurate predictions and measurments based off a reflective tape on the FRC field, as well as by being used as a normal camera.

---

#### Downloading
To get started we will need to install the latest **Drivers**, **Image** and **Flasher** from the [Limelight Downloads Page](https://limelightvision.io/pages/downloads)

##### Drivers 
After clicking the link to the Limelight downloads page you will be required to download the latest **USB Driver** and then run the .exe file to download the correct drivers as the LimeLight runs off of a Raspberry PI.
![limelight](/gifs/robotconfig/limelightDriver.jpg?classes=border,shadow)

##### Image
The next step would be to download the lastest Limelight **Image** which would be required for the next step. To download the latest version can also be found on the Limelight Downloads page listed above. Make sure you are aware of where the file is saved on your device as we will need to use that file later on.
![limelight](/gifs/robotconfig/limelightImages.jpg?classes=border,shadow)

##### Flash Tool (Etcher)
Etcher is the designated flashing software used by LimeLight, which will be used to install the coreect driver and image onto your LimeLight device. To get started download the Flashing Tool form the [Limelights Downloads Page](https://limelightvision.io/pages/downloads). After downloading it, you will need to run the .exe file and complete the installation process
![limelight](/gifs/robotconfig/limelightFlasher.jpg?classes=border,shadow)

#### Setup
After installing all neccessary software, you will need to follow the setup process:   

**1)** You will want to start off by connecting your LimeLight device to your computer by using a USB cable  
**2)** Next you will need to open the Balena Etcher Flashing desktop application "as administrator", it may take up to 20 seconds until it recognizes your LimeLight  
**3)** After that you will click the first button "Flash From File", then you will need to go back and locate where the latest image you downloaded which would be saved as a .zip   
**4)** The next step requires you clicking the "Select Target" button and will need you to select the Limelight "Compute Module"  
**5)** Once all the above steps have been clicked, you will finally click the "Flash" button to complete the proccess  

![limelight](/gifs/robotconfig/limelightBalena.jpg?classes=border,shadow)