# Contacts List Application  

This repository contains an Android application developed using **Kotlin** for managing a simple contact list.  
The project demonstrates usage of **RecyclerView**, custom adapters, dialogs, and dynamic list operations.  
It follows a structured development workflow with feature branches and clear commit history.  

## **Overview**  
The application implements a contact management system where users can **view, add, edit, and delete** contacts.  
RecyclerView is utilized for efficient rendering of list items, while custom dialogs are used for user interactions such as edit and delete confirmation.  

The aim of this project is to provide a clean and practical example of common Android patterns and practices.  

## **Features**  

### **Contact List**  
- Contact entries are displayed using **RecyclerView** for efficient scrolling and performance.  
- Each item includes an **image**, a **name**, and a **phone number**.  
- **ViewHolder pattern** ensures efficient recycling of views.  

### **Add Contact**  
- Users can add new contacts through a **form dialog** containing fields for **name** and **phone number**.  
- Dummy image resources are used for contact pictures.  
- *(This feature is planned to be added soon)*  
- The list updates immediately on successful addition.  

### **Delete Contact**  
- A **long press** on an item opens a custom dialog with a delete option.  
- A **confirmation step** is included to avoid accidental deletions.  
- Deletion is reflected using `notifyItemRemoved`, and index consistency is maintained with `notifyItemRangeChanged`.  

### **Edit Contact**  
- A **long press** also provides the option to **update an existing contact**.  
- Current details are **pre‑filled** into the form for modification.  
- On submission, **changes are applied** and the adapter refreshes the specific item using `notifyItemChanged`.  

### **Custom Dialogs**  
- Custom **XML layouts** are used within **AlertDialogs**.  
- Dialogs provide **multiple actions** (e.g., edit, delete) in a structured manner.  
- Dialog handling ensures **dismissibility** and **responsiveness**.  

## **Technical Details**  
- **Programming Language:** Kotlin  
- **UI Components:** RecyclerView with Adapter and ViewHolder  
- **Data Source:** ArrayList of model objects (in‑memory)  
- **Dialogs:** Managed through **AlertDialog.Builder** with inflated custom layouts  
- **Version Control Workflow:**  
  - Feature branches created for functionalities:  
    - `feature/contact-list-ripple-effect-on-items`  
    - `feature/edit-and-delete-contacts`  
  - Merged into **main** via Pull Requests for structured history.  

## **Sample Data**  
The application currently uses **dummy contact data** with placeholder **names and numbers**.  
Profile images are taken from **drawable resources**.  

## **Future Enhancements**  
- Replace temporary data with persistent storage (**Room Database** or **SQLite**).  
- Add a **search bar** for ease of navigation.  
- Introduce **dark mode** theme.  
- Add ability to mark and view **favorite contacts**.  
- Import/export contacts in **CSV/JSON** formats.  
- Implement an **Undo option** (via Snackbar) after deletions.  
- Add **input validation** (e.g., correct phone number formats).  
- Further **UI/UX improvements**.  
- Additional **optimizations** as the app evolves.  

## **Setup Instructions**  

### **Prerequisites**  
- Install **Android Studio** (latest stable version recommended).  
- Ensure **JDK 11 or higher** (bundled with Android Studio).  
- Emulator or physical device with **Android 5.0 Lollipop (API 21+) or above**.  

### **Steps**  
1. **Open the project in Android Studio.**  
2. **Wait for Gradle to sync and build the project.**  
3. **Select an emulator** from the AVD Manager or connect a physical device with **USB debugging enabled**.  
4. **Press Run ▶️ in Android Studio** or use the shortcut **Shift + F10** to build and launch the app.  

### **Verification**  
- The app should launch and display a **list of sample dummy contacts**.  
- Long press any contact to access **Edit** and **Delete** dialogs.  
- Add/Update features can be tested through the dialogs.  

## **License**  
This project is intended for **learning and demonstration purposes**.  
The **source code may be reused with attribution**.  
No warranty or liability is provided.  
