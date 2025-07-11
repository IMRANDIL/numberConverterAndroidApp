
```markdown
# 📱 Number to CSV Converter App

An Android utility app that lets you quickly convert a list of numbers into CSV-formatted text — wrapped in single quotes and comma-separated. Built with Kotlin and Material Design.

## ✨ Features


![WhatsApp Image 2025-07-11 at 4 19 37 PM](https://github.com/user-attachments/assets/6ba714af-f5d2-4195-aa93-fb46a27ce5fd)

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


