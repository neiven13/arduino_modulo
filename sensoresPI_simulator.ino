void setup() {
  Serial.begin(9600);
  delay(800);
}

void loop() {
  Serial.flush();
  delay(1000);
  Serial.print(50);
  Serial.print(",");
  Serial.print(1000);
  Serial.print(",");
  Serial.println(20);
}
