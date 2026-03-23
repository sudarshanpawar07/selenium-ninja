# 🥷 Selenium Ninja

> *Mastering the art of web automation — one script at a time.*

A personal learning journal documenting my daily journey with **Selenium WebDriver using Java**. This repository grows every day with new scripts, concepts, and frameworks as I level up my automation skills.

---

## 📖 About This Repository

This repo is my hands-on Selenium learning log. Each folder represents a topic or concept, with real working Java scripts. Starting from the basics and progressing towards industry-level frameworks like FireFlink, TestNG, and Maven.

---

## 🛠️ Tech Stack

| Tool | Details |
|------|---------|
| Language | Java |
| Framework | Selenium WebDriver |
| IDE | Eclipse |
| Browser | Chrome |
| Coming Soon | TestNG, Maven, FireFlink |

---

## 📁 Project Structure

```
selenium-ninja/
│
├── src/
│   ├── Basic/                        # Core Selenium fundamentals
│   │   ├── Launch.java               # Browser launch basics
│   │   ├── OpenMakeMyTrip.java       # Automating MakeMyTrip website
│   │   └── StartupScript.java        # Initial setup & first script
│   │
│   └── Assignment/                   # Practice assignments on e-commerce sites
│       ├── CometLaunch.java
│       ├── JordanLaunch.java
│       ├── NikeLaunch.java
│       ├── PumaLaunch.java
│       ├── RedTapeLaunch.java
│       └── UsPoloLaunch.java
│
├── .gitignore
├── .classpath
├── .project
└── README.md
```

---

## 🗺️ Learning Roadmap

### ✅ Current Progress

| Module | Topic | Status |
|--------|-------|--------|
| Basic | Browser launch & setup | ✅ Done |
| Basic | Automating MakeMyTrip | ✅ Done |
| Basic | Startup script | ✅ Done |
| Assignment | E-commerce sites automation (Nike, Puma, Jordan, etc.) | ✅ Done |

---

### 🔜 Upcoming Topics

| Module | Topics | Status |
|--------|--------|--------|
| Selenium | Locators (XPath, CSS, ID, Name) | ⏳ |
| Selenium | Waits (Implicit, Explicit, Fluent) | ⏳ |
| Selenium | Dropdowns, Alerts, Frames | ⏳ |
| Selenium | Actions class (hover, drag & drop) | ⏳ |
| Selenium | JavaScript Executor | ⏳ |
| Selenium | Screenshot capture | ⏳ |
| Selenium | Window & tab handling | ⏳ |
| TestNG | Annotations, Assertions, Test suites | ⏳ |
| TestNG | Data Driven Testing | ⏳ |
| Maven | Project setup & dependencies | ⏳ |
| Maven | Running tests via Maven | ⏳ |
| FireFlink | Introduction & setup | ⏳ |
| FireFlink | Creating & running test cases | ⏳ |
| Page Object Model | POM design pattern | ⏳ |

> ✅ Done &nbsp;|&nbsp; 🔄 In Progress &nbsp;|&nbsp; ⏳ Upcoming

---

## 💡 Sample Script

```java
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
    public static void main(String[] args) {

       

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.close();
    }
}
```

---

## 🚀 How to Run

1. Clone the repository
```bash
git clone https://github.com/sudarshanpawar07/selenium-ninja.git
```

2. Open in **Eclipse IDE**

3. Add **Selenium Java JAR** files to the build path

4. Run any `.java` file as a **Java Application**

---

## 🙌 Author

**Sudarshan Pawar**
- GitHub: [@sudarshanpawar07](https://github.com/sudarshanpawar07)

---


> *"The journey of a thousand tests begins with a single `driver.get()`."* 🥷
