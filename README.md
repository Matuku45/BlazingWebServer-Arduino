# 🔥 Blazing Web Server + Arduino Integration

This project integrates a **Blazing fast web server** with an **Arduino** to enable real-time control of hardware (like LEDs, buzzers, etc.) through a web-based interface.

It combines:
- 🌐 A Java-based Blazing web server
- 🔌 Serial communication to Arduino
- 🧠 Command-based interaction from browser to microcontroller

---

## 📡 How It Works

1. **User interacts** with a web page hosted by the Blazing server.
2. The server **receives commands** (like "LED ON", "LED OFF", etc.).
3. Java **sends those commands via serial** to the Arduino.
4. Arduino **executes hardware-level actions**.

---

## 🧰 Technologies Used

| Component       | Role |
|----------------|------|
| Blazing Server (Java) | Serves web pages and handles HTTP requests |
| jSerialComm    | Manages communication with the Arduino |
| Arduino Uno    | Microcontroller receiving commands |
| HTML/CSS/JS    | Frontend interface for user input |
| Arduino IDE    | Uploads sketch to Arduino board |

---

## ⚙️ Arduino Sketch

```cpp
void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT); // Built-in LED
}

void loop() {
  if (Serial.available()) {
    int cmd = Serial.read();
    if (cmd == 1) digitalWrite(13, HIGH);  // Turn LED on
    else if (cmd == 0) digitalWrite(13, LOW); // Turn LED off
  }
}
****
