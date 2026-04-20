# 📝 Todo Application (Spring Boot + Thymeleaf)

A sleek, server-side rendered (SSR) Task Management application built using Spring Boot, Spring Data JPA, and Thymeleaf.  
This project demonstrates clean MVC architecture and a modern UI/UX for managing daily tasks.

---

## 🚀 Features

- ✅ **Create**: Add new todos instantly  
- ✔️ **Toggle Completion**: Mark tasks as done with visual feedback  
- 🗑️ **Delete**: Remove tasks from the database  
- 📃 **Dynamic List**: Real-time view using Thymeleaf  
- 🎨 **Modern UI**: Bootstrap 5 + Google Fonts (Urbanist)  
- ⚡ **Fast Backend**: Optimized Spring Boot performance  

---

## 🛠️ Tech Stack

### Backend
- Java 17+
- Spring Boot 3.x (Spring MVC, Spring Data JPA)
- Lombok

### Database
- H2 Database (in-memory for local testing)

### Frontend
- Thymeleaf
- Bootstrap 5
- Bootstrap Icons
- CSS3

---

## 📂 Project Structure


src/main/java/com/example/todo/
├── controller/
│ └── TodoController.java # Web Routing & Logic
├── entity/
│ └── TodoEntity.java # Database Model
├── repository/
│ └── TodoRepositories.java # Data Access Layer (JPA)

src/main/resources/
├── templates/
│ └── index.html # UI Template
├── static/
│ └── css/style.css # Custom Styles


---

## 🔗 Web Routes & Logic

| Method | Endpoint        | Description |
|--------|----------------|------------|
| GET    | `/`            | Render home page |
| POST   | `/add`         | Add new todo |
| GET    | `/update/{id}` | Toggle completed status |
| GET    | `/delete/{id}` | Delete todo |

---

## ⚙️ How It Works

- **Persistence**: Managed via Spring Data JPA (H2 DB by default)
- **State Management**: Boolean `completed` field
- **UI Feedback**: Completed tasks show strikethrough using Thymeleaf
- **Pattern Used**: Post-Redirect-Get (PRG)

---

## ▶️ Run Locally

### 1. Clone the repository
```bash
git clone https://github.com/your-username/todo-app.git
cd todo-app
2. Run the application
./mvnw spring-boot:run
3. Open in browser
http://localhost:8080
```
## 🧠 Technical Notes
Follows MVC (Model-View-Controller)
Uses Lombok @Builder for clean object creation
Implements PRG pattern to avoid duplicate submissions

## 📜 License
This project is licensed under the MIT License.
