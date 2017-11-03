import serial

ser = serial.Serial('/dev/ttyACM0', baudrate=9600)

def data():
    return str(ser.readline())
