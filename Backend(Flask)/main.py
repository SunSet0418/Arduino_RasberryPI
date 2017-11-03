import serial

ser = serial.Serial('/dev/cu.usbmodem1411', baudrate=9600)

def data():
    return str(ser.readline())




