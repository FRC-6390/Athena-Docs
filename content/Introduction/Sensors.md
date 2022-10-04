---
title: "Sensors"
date: 2022-09-21T13:59:03-07:00
draft: false
description: " "
weight: 6
---

Some sensors have native support in WPI, but if you want to features offered by the vendor, you will need to install their custom vendor library.

---
## Accelerometers
Accelerometers measure acceleration (rate of change of velocity), an accelerometer typically uses 3 axes to measure acceleration but some may only measure in one direction. WPI has support for both types of single and tri-axis accelerometers. AnalogAccleromter, ADXL345_I2C, ADXL345_SP, ADXL362 and BuiltInAccelerometer for the Robrio.

## Gyroscopes
Gyroscopes measure the speed at which an object is turning. Similar to an accelerometer, gyroscopes can be single and tri-axis. WPI has support for gyroscopes but we strongly recommend using the vendor-provided library because they will include quality of life features and capabilities just not found in the WPI library. WPI has support for AnalogGyro, ADIS16448, ADIS16470 and ADXRS450_Gyro. WPI lib does have support for some vendor-specific gyroscopes but, we recommend using the library provided by the vendor itself

## Ultrasonic rangefinders
Ultrasonic rangefinders find the distance from itself to an object by using ultrasonic sound. WPI does not have much support for this type of sensor and recommends using a vendor-provided library. WPI only supports Ping-response and Analog ultrasonic sensors.

## Potentiometers
Potentiometers are variable resistors that measure the voltage of the resistor to find the distance. WPI only has support for one class, AnalogPotentiometer.

## Counters
Counters, count! They are often used to measure the number of rotations of a wheel or another rotating object but that job is usually left to an encoder. WPI has support for different counting modes, Two-pulse, Semi-period, Pulse-length, and External direction.

## Quadrature Encoders
Quadrature encoders or encoders, often measure the rotation of a wheel or shaft. WPI has great support for encoders but we strongly recommend using any vendor-provided library because they typically come with a whole suite of useful features. WPI has support for a few different decoding modes, 1x, 2x, and 4x.

## Limit Switches
Limit switches come in a few different types. Most commonly they will be mechanical/button-like or magnetic. No matter what type you have they all should operate the same, programmatically. WPI does not have a specific class for limit switches but it does include a DigitalInput class where support is provided.

## Colour Sensor
Colour sensors, sense colour. WPI does not have any support for this type of sensor. We suggest just using the vendor-provided library.

## Inertial Measurement Unit (IMU)
IMU typically combines multiple sensors that measure acceleration, angular rate and orientation. They do not always include all the listed sensors but most do, they act like an all-in-one including your Accelerometer, Gyroscope and AHRS.
WPI does have support for some vendor-specific devices but we recommend using the vendor provided library.
