#include <SimpleDHT.h>
#include <LiquidCrystal_I2C.h>
#include <Wire.h>

SimpleDHT11 dht11;
int dhtpin = 8;

LiquidCrystal_I2C lcd(0x3F,16,2);

void setup() {
  lcd.init();
  lcd.backlight();
  Serial.begin(9600);
}

void loop() {
  byte temperature = 0;
  byte humidity = 0;
  if(dht11.read(dhtpin, &temperature, &humidity, NULL)){
    Serial.print("DHT Error");
  }
  int db = analogRead(0);
  int t = (int)temperature;
  int h = (int)humidity;
  Serial.print(t);
  Serial.print(" ");
  Serial.print(h);
  Serial.print(" ");
  Serial.println(db);
  lcd.setCursor(0,0);
  lcd.print(t);
  lcd.setCursor(3,0);
  lcd.print("'C");
  lcd.setCursor(0,1);
  lcd.print(h);
  lcd.setCursor(3,1);
  lcd.print("%");
  delay(1000);
}
