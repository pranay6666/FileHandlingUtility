# 🗂️ FileHandlingUtility Project

## 🧩 Overview
A Java console-based application that demonstrates **File Handling operations** using Core Java concepts.  
It allows users to **write, read, append, and modify** text files interactively through a menu-driven interface, showcasing **I/O streams**, **exception handling**, and **OOP principles**.

---

## ⚙️ How to Run This Project (Eclipse)

### 1️⃣ Prerequisites
- **Java JDK 8+** installed  
- **Eclipse IDE** for Java Developers  

> 🧠 *No external JAR files are required for this project.*

---

### 2️⃣ Create or Import the Project
1. Open **Eclipse**.  
2. Go to **File → Import → Existing Projects into Workspace**.  
3. Browse to your project folder (e.g., `FileHandlingUtility`).  
4. Click **Finish** to import it.  

If creating manually:  
1. Go to **File → New → Java Project** → Project Name: `FileHandlingUtility` → **Finish**.  
2. Right-click `src` → **New → Package** → name it `com`.  
3. Create the following Java files inside the package and paste your code:
   - `FileHandlingUtilityMainClass.java`  
   - `WriteFile.java`  
   - `ReadFile.java`  
   - `AppendFile.java`  
   - `ModifyFile.java`

---

### 3️⃣ Run the Project
1. In Eclipse, open the file **FileHandlingUtilityMainClass.java**.  
2. Right-click → **Run As → Java Application**.  
3. When prompted, enter the **file name** (e.g., `data.txt`).  
4. The console will display a menu like this:
***** File Handling Utility *****

Write to File

Read from File

Append to File

Modify File

EXIT
Choose the option :


5. Choose an operation (1–4) and follow the instructions.  
6. The file will be created or modified automatically in your project folder.

---

### 💡 Example Output


Enter File Name (with extension , eg : file.txt)
data.txt
***** File Handling Utility *****

Write to File

Read from File

Append to File

Modify File

EXIT
Choose the option : 1
✏️ Enter text to write into file:
Hello, this is my first file!
File written successfully!
