import serial

ser = serial.Serial('/dev/cu.usbmodem1421', baudrate=9600)

def data():
    return str(ser.readline())
