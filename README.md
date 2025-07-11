
```markdown
# 📱 Number to CSV Converter App

An Android utility app that lets you quickly convert a list of numbers into CSV-formatted text — wrapped in single quotes and comma-separated. Built with Kotlin and Material Design.

## ✨ Features

![WhatsApp Image 2025-07-11 at 4 19 37 PM](https://github.com/user-attachments/assets/38f2df29-c0c7-4083-bf9c-e9e86ef3f647)
![WhatsApp Image 2025-07-11 at 4 19 37 PM (1)](https://github.com/user-attachments/assets/fa444d18-a27a-4aff-973c-b61180dde69c)

![WhatsApp Image 2025-07-11 at 4 19 36 PM](https://github.com/user-attachments/assets/658e945a-3961-446c-ae9c-fa4c527e113a)

![WhatsApp Image 2025-07-11 at 4 19 36 PM (1)](https://github.com/user-attachments/assets/9f3210fa-0866-4684-a753-c55537cd9e93)

![WhatsApp Image 2025-07-11 at 4 19 36 PM (2)](https://github.com/user-attachments/assets/fd65ac28-9f53-4557-8171-54b4eb40b1c2)

- 🧮 **Number Conversion**  
  Converts numbers (entered line-by-line or space/comma separated) into comma-separated values wrapped in single quotes:
```
Input: 123 456 789
Output: '123', '456', '789'

````

- 📋 **Copy to Clipboard**  
One-tap copy functionality for converted output.

- 📂 **Export to File**  
Export converted values to a `.txt` file in your Downloads folder, auto-named with timestamp.

- 🌙 **Dark Mode Support**  
Toggle between light/dark themes using the built-in switch.

- 🧼 **Clear Button**  
Quickly reset input and output with one tap.

---


## 🚀 Installation

1. Clone the repo:
 ```bash
 git clone https://github.com/IMRANDIL/number-converter-app.git
````

2. Open in **Android Studio**.

3. Build and run the app on an emulator or physical device.

---

## 🛠 Tech Stack

* **Language**: Kotlin
* **UI**: Material Design, XML Layouts
* **Min SDK**: 21
* **Target SDK**: 34

---

## 🔐 Permissions

* `WRITE_EXTERNAL_STORAGE` (for export feature — limited to SDK ≤ 28)

For SDK 29+, Scoped Storage APIs will be used in future updates.

---

## 🤝 Contribution

Pull requests are welcome! Feel free to fork and improve the app:

* Add new export formats (e.g. CSV file)
* Save preferences across sessions
* Support large input datasets

---

## 📧 Author

Made with ❤️ by [IMRAN DIL](https://github.com/IMRANDIL)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

```


