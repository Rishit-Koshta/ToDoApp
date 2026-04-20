📝 Todo Application (Spring Boot + Thymeleaf)

A simple and elegant Todo List Web Application built using Spring Boot, Spring Data JPA, and Thymeleaf.
This app allows users to create, update, and delete tasks with a clean UI.

🚀 Features
✅ Add new todos
✔️ Mark todos as completed
🗑️ Delete todos
📃 View all todos
🎨 Clean and responsive UI using Bootstrap
⚡ Fast backend using Spring Boot
🛠️ Tech Stack

Backend:

Java
Spring Boot
Spring MVC
Spring Data JPA

Frontend:

Thymeleaf
HTML, CSS
Bootstrap 5
Bootstrap Icons

Database:

H2 / MySQL (depending on your configuration)
📂 Project Structure
├── controller
│   └── TodoController.java
├── entity
│   └── TodoEntity.java
├── repository
│   └── TodoRepositories.java
├── templates
│   └── index.html
├── static
│   └── css/style.css
⚙️ How It Works
1. Add Todo
User enters a task
Saved in database with completed = false
2. Mark as Completed
Clicking checkbox updates completed = true
3. Delete Todo
Removes task from database
🔗 API Endpoints
Method	Endpoint	Description
GET	/	Show all todos
POST	/add	Add new todo
GET	/update/{id}	Mark todo as completed
GET	/delete/{id}	Delete todo
🖥️ UI Preview (Features)
Input field to add tasks
List of todos
Checkbox icon to mark complete
Trash icon to delete
▶️ Run Locally
1. Clone the repository
git clone https://github.com/your-username/todo-app.git
cd todo-app
2. Run the application
mvn spring-boot:run
3. Open in browser
http://localhost:8080
🧠 Future Improvements
✏️ Edit existing todos
🔍 Search & filter tasks
📅 Due dates & reminders
👤 User authentication (login/signup)
📊 Analytics dashboard
📌 Notes
Uses Thymeleaf server-side rendering
Follows MVC architecture
Beginner-friendly Spring Boot project
🙌 Contribution

Feel free to fork this repo and improve it. Contributions are always welcome!

📜 License

This project is open-source and available under the MIT License.
