# 📡 Aplicação Java - Comunicação Serial com Arduino

Este projeto é uma aplicação Java que realiza a comunicação com uma placa **Arduino** via **porta serial**, utilizando a biblioteca **jSerialComm**. A aplicação lê dados enviados pela placa referentes a sensores de **temperatura**, **umidade** e **luminosidade**, e exibe essas informações diretamente no **console**.

---

## 🛠 Funcionalidades

- Comunicação serial com Arduino
- Leitura de dados dos sensores:
  - Temperatura
  - Umidade
  - Luminosidade
- Exibição dos dados no console

---

## 🚀 Pré-requisitos

Antes de rodar a aplicação, certifique-se de que você tem:

- Java 17 ou superior instalado
- Arduino configurado e enviando dados via porta serial
- Biblioteca `jSerialComm` adicionada ao seu projeto (pode ser via Maven, Gradle ou manualmente)

### Exemplo com Maven:

```xml
<dependency>
  <groupId>com.fazecast</groupId>
  <artifactId>jSerialComm</artifactId>
  <version>2.9.2</version>
</dependency>
```

---

## 🔌 Comunicação com o Arduino

A placa Arduino deve estar programada para enviar os dados dos sensores seguindo o modelo abaixo:

```text
temperatura,luminosidade,umidade;

Exemplo:
35,250,60
```

A aplicação Java faz a leitura da porta serial e imprime essas informações no console.

---

## 📁 Estrutura do Projeto

```text
📦main
 📂java
 ┗ 📂br
 ┃ ┗ 📂edu
 ┃ ┃ ┗ 📂aurus
 ┃ ┃ ┃ ┣ 📜Arduino.java
 ┃ ┃ ┃ ┣ 📜Luminosidade.java
 ┃ ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┃ ┣ 📜Temperatura.java
 ┃ ┃ ┃ ┗ 📜Umidade.java
```

---

## ▶️ Como Executar

1. Conecte sua placa Arduino ao computador.
2. Compile e execute a aplicação Java.
3. Os dados serão exibidos no console.
---

## 📚 Tecnologias Utilizadas

- Java
- jSerialComm
- Arduino (IDE e firmware)

---

## 📌 Observações

- Verifique qual é a porta serial correta (ex: `COM3`, `/dev/ttyUSB0`, etc).
- A taxa de transmissão (**baud rate**) configurada no código Java deve ser igual à configurada no Arduino (ex: `9600`).
